package com.yuqiaotech.facepp;

import android.Manifest;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.squareup.okhttp.Request;
import com.yuqiaotech.facepp.bean.DataBean;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MainActivity extends Activity {

    /**
     * 裁剪好的图片的输出路径
     */
    private File photoZoomOutFile;

    /**
     * 拍照的图片的url
     */
    private Uri pictureOutUri;

    private ProgressDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialog = new ProgressDialog(this);
        dialog.setMessage("正在提交...");
    }

    //点击事件
    public void btn(View view) {
        //1.拍照
        camera();
    }

    public void btn2(View view) {
        //重新提交
        if (photoZoomOutFile != null) {
            getFaceInfo(photoZoomOutFile.getName(), photoZoomOutFile);
        } else {
            Toast.makeText(getApplicationContext(), "还没有图片,请先拍照", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 拍照
     */
    private void camera() {

        // 激活相机
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        // 判断存储卡是否可以用，可用进行存储
        if (hasSdcard()) {
            SimpleDateFormat timeStampFormat = new SimpleDateFormat(
                    "yyyy_MM_dd_HH_mm_ss");
            String filename = timeStampFormat.format(new Date());
            File tempFile = new File(Environment.getExternalStorageDirectory().getPath() + "/shch/icon",
                    filename + ".jpg");
            pictureOutUri = geturi(tempFile);

            intent.putExtra(MediaStore.EXTRA_OUTPUT, pictureOutUri);
        }
        // 开启一个带有返回值的Activity，请求码为PHOTO_REQUEST_CAREMA
        startActivityForResult(intent, 1);
    }


    private Uri geturi(File tempFile) {
        Uri imgUri =null;
        //獲取系統版本
        int currentapiVersion = android.os.Build.VERSION.SDK_INT;
        if (currentapiVersion < 24) {
            // 从文件中创建uri
            imgUri = Uri.fromFile(tempFile);

        } else {
            //兼容android7.0 使用共享文件的形式
            ContentValues contentValues = new ContentValues(1);
            contentValues.put(MediaStore.Images.Media.DATA, tempFile.getAbsolutePath());
            //检查是否有存储权限，以免崩溃
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED) {
                //申请WRITE_EXTERNAL_STORAGE权限
                Toast.makeText(this, "请开启存储权限", Toast.LENGTH_SHORT).show();
                return null;
            }
            imgUri = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        }
        return imgUri ;
    }

    /*
 * 判断sdcard是否被挂载
 */
    public static boolean hasSdcard() {
        return Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED);
    }

    /**
     * 裁剪
     *
     * @param uri 被裁剪的图片
     */
    private void startPhotoZoom(Uri uri) {
        File file = new File(Environment.getExternalStorageDirectory().getPath() + "/shch/icon");
        if (!file.exists()) {
            file.mkdirs();
        }
        photoZoomOutFile = new File(file, System.currentTimeMillis() + ".jpg");//裁剪的图片保存路径
        Uri outUri = geturi(photoZoomOutFile);
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        //intent.putExtra("outputX", 480);
        //intent.putExtra("outputY", 480);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, outUri);
        intent.putExtra("return-data", false);
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, 3);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1://拍照
                if (resultCode == RESULT_OK) {
                    startPhotoZoom(pictureOutUri);//裁剪
                }
                break;
            case 2://图库
                if (resultCode == RESULT_OK) {
                    Uri uri = data.getData();
                    if (uri == null) {
                        //选择图片失败
                        return;
                    }

                }
                break;
            case 3://裁剪
                if (resultCode == RESULT_OK) {
                    Log.e("tag2", "文件名=" + photoZoomOutFile.getName());
                    getFaceInfo(photoZoomOutFile.getName(), photoZoomOutFile);
                }
                break;
        }
    }

    /**
     * 获取人脸信息
     */
    public void getFaceInfo(String name, File file) {
        dialog.show();
        //请求接口拿到数据
        OkHttpUtils.post()
                .url("https://api-cn.faceplusplus.com/facepp/v3/detect") //请求数据的接口
//                .addParams("api_key","IYBMBAX6moez1pirP_J6jLGsrUfLn3YY")
                .addParams("api_key", "mJXGeo2PeDkZx3EjCAVc73eG4DVhA4V-")
//                .addParams("api_secret","kS0Otv3e9G20nS8UpZn3_8DcuAo8cjJq")
                .addParams("api_secret", "uzgQDYqxElehdIIxEmzCbQCXLnsEFLYp")
                .addFile("image_file", name, file) //提交图片
                .addParams("return_attributes", "gender,age,smiling,headpose,facequality,blur,eyestatus,ethnicity")//需要的数据
                //.addParams("return_landmark","1")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                        Log.e("tag2", "onError=" + e.getMessage());
                        dialog.dismiss();
                        if (e.getMessage().contains("403")) {
                            Toast.makeText(getApplicationContext(), "服务器繁忙,请重试", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "提交错误", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onResponse(String response) {
                        Log.i("tag2", "response=" + response);
                        dialog.dismiss();
                        //Toast.makeText(getApplicationContext(),"成功了",Toast.LENGTH_SHORT).show();
                        DataBean dataBean = new Gson().fromJson(response, DataBean.class);
                        if (dataBean == null) {
                            Toast.makeText(getApplicationContext(), "获取的数据为空", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        List<DataBean.Faces> faces = dataBean.getFaces();
                        String age = "未知";//年龄
                        String ethnicity = "未知";//人种
                        String facequality = "未知";//人脸质量
                        String gender = "未知";//性别
                        String smile = "未知";//笑容分析

                        if (faces != null && faces.size() > 0 && faces.get(0).getAttributes() != null) {
                            DataBean.Attributes attributes = faces.get(0).getAttributes();

                            if (attributes.getAge() != null) {
                                age = attributes.getAge().getValue() + "";
                            }

                            if (!TextUtils.isEmpty(attributes.getEthnicity().getValue())) {
                                switch (attributes.getEthnicity().getValue()) {
                                    case "Asian":
                                        ethnicity = "亚洲人";
                                        break;
                                    case "White":
                                        ethnicity = "白种人";
                                        break;
                                    case "Black":
                                        ethnicity = "黑种人";
                                        break;

                                }
                            }
                            //人脸质量
                            if (attributes.getFacequality() != null) {
                                facequality = attributes.getFacequality().getValue() + "";//0-100
                            }

                            if (attributes.getGender() != null && !TextUtils.isEmpty(attributes.getGender().getValue())) {
                                switch (attributes.getGender().getValue()) {
                                    case "Male":
                                        gender = "男性";
                                        break;
                                    case "Female":
                                        gender = "女性";
                                        break;
                                }
                            }

                            //笑容度
                            if (attributes.getSmile() != null) {
                                smile = attributes.getSmile().getValue() + "";
                            }

                        }


                        TextView tv = (TextView) findViewById(R.id.tv);
                        tv.setText("年龄=" + age +
                                ",人种=" + ethnicity +
                                ",人脸质量=" + facequality +
                                ",性别=" + gender +
                                ",笑容度=" + smile);
                    }
                });
    }

}
