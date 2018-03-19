package com.yuqiaotech.facepp.app;

import android.app.Application;

import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * (用一句话描述类的主要功能)
 * Created by yun on 2018/3/19.
 */
public class FaceApplication extends Application {
    private static OkHttpClient okHttpClient;
    private static Retrofit retrofit;

    public static FaceApplication app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        //初始化OkHttp
        OkHttpInstance();
        //初始化Retrofit
        RetrofitInstance();
    }


    /**
     * 初始化okHttp
     * @return
     */
    public static OkHttpClient OkHttpInstance() {
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient().newBuilder()
                    //设置连接时间
                    .connectTimeout(500, TimeUnit.MILLISECONDS)
                    //设置读时间
                    .readTimeout(1000, TimeUnit.MILLISECONDS)
                    //设置写时间
                    .writeTimeout(1000, TimeUnit.MILLISECONDS)
                    //设置缓存
                    .cache(new Cache(app.getExternalCacheDir(), 10 * 1024 * 1024))
                    .build();
            return okHttpClient;
        } else {
            return okHttpClient;
        }
    }

    /**
     * 初始化retrofit
     */
    public static Retrofit RetrofitInstance(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl("https://api-cn.faceplusplus.com/facepp/v3/")
                    //添加Gson支持
                    .addConverterFactory(GsonConverterFactory.create())
                    //添加Retrofit对Rxjava的支持
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    //配置OkHttp
                    .client(okHttpClient).build();
            return retrofit;
        }else{
            return retrofit;
        }
    }



}
