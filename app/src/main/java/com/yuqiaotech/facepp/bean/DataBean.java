package com.yuqiaotech.facepp.bean;

import java.util.List;

/**
 * (用一句话描述类的主要功能)
 * Created by yun on 2018/3/19.
 */
public class DataBean {

    private List<Faces> faces;

    private String image_id;

    private String request_id;

    private int time_used;

    public void setFaces(List<Faces> faces){
        this.faces = faces;
    }
    public List<Faces> getFaces(){
        return this.faces;
    }
    public void setImage_id(String image_id){
        this.image_id = image_id;
    }
    public String getImage_id(){
        return this.image_id;
    }
    public void setRequest_id(String request_id){
        this.request_id = request_id;
    }
    public String getRequest_id(){
        return this.request_id;
    }
    public void setTime_used(int time_used){
        this.time_used = time_used;
    }
    public int getTime_used(){
        return this.time_used;
    }

    public class Age
    {
        private int value;

        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            return this.value;
        }

        @Override
        public String toString() {
            return "年龄=" +
                    value
                    ;
        }
    }


    public class Blurness
    {
        private int threshold;

        private double value;

        public void setThreshold(int threshold){
            this.threshold = threshold;
        }
        public int getThreshold(){
            return this.threshold;
        }
        public void setValue(double value){
            this.value = value;
        }
        public double getValue(){
            return this.value;
        }
    }



    public class Gaussianblur
    {
        private int threshold;

        private double value;

        public void setThreshold(int threshold){
            this.threshold = threshold;
        }
        public int getThreshold(){
            return this.threshold;
        }
        public void setValue(double value){
            this.value = value;
        }
        public double getValue(){
            return this.value;
        }
    }



    public class Motionblur
    {
        private int threshold;

        private double value;

        public void setThreshold(int threshold){
            this.threshold = threshold;
        }
        public int getThreshold(){
            return this.threshold;
        }
        public void setValue(double value){
            this.value = value;
        }
        public double getValue(){
            return this.value;
        }
    }



    public class Blur
    {
        private Blurness blurness;

        private Gaussianblur gaussianblur;

        private Motionblur motionblur;

        public void setBlurness(Blurness blurness){
            this.blurness = blurness;
        }
        public Blurness getBlurness(){
            return this.blurness;
        }
        public void setGaussianblur(Gaussianblur gaussianblur){
            this.gaussianblur = gaussianblur;
        }
        public Gaussianblur getGaussianblur(){
            return this.gaussianblur;
        }
        public void setMotionblur(Motionblur motionblur){
            this.motionblur = motionblur;
        }
        public Motionblur getMotionblur(){
            return this.motionblur;
        }
    }



    public class Ethnicity
    {
        private String value;

        public void setValue(String value){
            this.value = value;
        }
        public String getValue(){
            return this.value;
        }

        @Override
        public String toString() {
            return "人种{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }



    public class Left_eye_status
    {
        private int dark_glasses;

        private int no_glass_eye_close;

        private double no_glass_eye_open;

        private int normal_glass_eye_close;

        private double normal_glass_eye_open;

        private String occlusion;

        public void setDark_glasses(int dark_glasses){
            this.dark_glasses = dark_glasses;
        }
        public int getDark_glasses(){
            return this.dark_glasses;
        }
        public void setNo_glass_eye_close(int no_glass_eye_close){
            this.no_glass_eye_close = no_glass_eye_close;
        }
        public int getNo_glass_eye_close(){
            return this.no_glass_eye_close;
        }
        public void setNo_glass_eye_open(double no_glass_eye_open){
            this.no_glass_eye_open = no_glass_eye_open;
        }
        public double getNo_glass_eye_open(){
            return this.no_glass_eye_open;
        }
        public void setNormal_glass_eye_close(int normal_glass_eye_close){
            this.normal_glass_eye_close = normal_glass_eye_close;
        }
        public int getNormal_glass_eye_close(){
            return this.normal_glass_eye_close;
        }
        public void setNormal_glass_eye_open(double normal_glass_eye_open){
            this.normal_glass_eye_open = normal_glass_eye_open;
        }
        public double getNormal_glass_eye_open(){
            return this.normal_glass_eye_open;
        }

        public String getOcclusion() {
            return occlusion;
        }

        public void setOcclusion(String occlusion) {
            this.occlusion = occlusion;
        }
    }



    public class Right_eye_status
    {
        private int dark_glasses;

        private int no_glass_eye_close;

        private double no_glass_eye_open;

        private int normal_glass_eye_close;

        private double normal_glass_eye_open;

        private double occlusion;

        public void setDark_glasses(int dark_glasses){
            this.dark_glasses = dark_glasses;
        }
        public int getDark_glasses(){
            return this.dark_glasses;
        }
        public void setNo_glass_eye_close(int no_glass_eye_close){
            this.no_glass_eye_close = no_glass_eye_close;
        }
        public int getNo_glass_eye_close(){
            return this.no_glass_eye_close;
        }
        public void setNo_glass_eye_open(double no_glass_eye_open){
            this.no_glass_eye_open = no_glass_eye_open;
        }
        public double getNo_glass_eye_open(){
            return this.no_glass_eye_open;
        }
        public void setNormal_glass_eye_close(int normal_glass_eye_close){
            this.normal_glass_eye_close = normal_glass_eye_close;
        }
        public int getNormal_glass_eye_close(){
            return this.normal_glass_eye_close;
        }
        public void setNormal_glass_eye_open(double normal_glass_eye_open){
            this.normal_glass_eye_open = normal_glass_eye_open;
        }
        public double getNormal_glass_eye_open(){
            return this.normal_glass_eye_open;
        }
        public void setOcclusion(double occlusion){
            this.occlusion = occlusion;
        }
        public double getOcclusion(){
            return this.occlusion;
        }
    }



    public class Eyestatus
    {
        private Left_eye_status left_eye_status;

        private Right_eye_status right_eye_status;

        public void setLeft_eye_status(Left_eye_status left_eye_status){
            this.left_eye_status = left_eye_status;
        }
        public Left_eye_status getLeft_eye_status(){
            return this.left_eye_status;
        }
        public void setRight_eye_status(Right_eye_status right_eye_status){
            this.right_eye_status = right_eye_status;
        }
        public Right_eye_status getRight_eye_status(){
            return this.right_eye_status;
        }
    }



    public class Facequality
    {
        private double threshold;

        private double value;

        public void setThreshold(double threshold){
            this.threshold = threshold;
        }
        public double getThreshold(){
            return this.threshold;
        }
        public void setValue(double value){
            this.value = value;
        }
        public double getValue(){
            return this.value;
        }

        @Override
        public String toString() {
            return "人脸质量{" +
                    "threshold=" + threshold +
                    ", value=" + value +
                    '}';
        }
    }



    public class Gender
    {
        private String value;

        public void setValue(String value){
            this.value = value;
        }
        public String getValue(){
            return this.value;
        }

        @Override
        public String toString() {
            return "性别{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }



    public class Glass
    {
        private String value;

        public void setValue(String value){
            this.value = value;
        }
        public String getValue(){
            return this.value;
        }
    }



    public class Headpose
    {
        private double pitch_angle;

        private double roll_angle;

        private double yaw_angle;

        public void setPitch_angle(double pitch_angle){
            this.pitch_angle = pitch_angle;
        }
        public double getPitch_angle(){
            return this.pitch_angle;
        }
        public void setRoll_angle(double roll_angle){
            this.roll_angle = roll_angle;
        }
        public double getRoll_angle(){
            return this.roll_angle;
        }
        public void setYaw_angle(double yaw_angle){
            this.yaw_angle = yaw_angle;
        }
        public double getYaw_angle(){
            return this.yaw_angle;
        }
    }



    public class Smile
    {
        private double threshold;

        private double value;

        public void setThreshold(double threshold){
            this.threshold = threshold;
        }
        public double getThreshold(){
            return this.threshold;
        }
        public void setValue(double value){
            this.value = value;
        }
        public double getValue(){
            return this.value;
        }

        @Override
        public String toString() {
            return "笑容分享{" +
                    "threshold=" + threshold +
                    ", value=" + value +
                    '}';
        }
    }



    public class Attributes
    {
        private Age age;//年龄

        private Blur blur;

        /**
         * ethnicity： 人种分析结果，value的值为Asian/White/Black。Asian代表亚洲人，White代表白人，Black代表黑人。
         */
        private Ethnicity ethnicity;

        private Eyestatus eyestatus;// 眼睛状态信息 包括 le

        /**
         * facequality: 人脸质量判断结果，value值为人脸的质量判断的分数，是一个浮点数，范围[0,100], 小数点后3位有效数字。threshold表示人脸质量基本合格的一个阈值，超过该阈值的人脸适合用于人脸比对。
         */
        private Facequality facequality;

        /**
         * gender：性别分析结果，value的值为Male/Female。Male 代表男性，Female代表女性。
         */
        private Gender gender;

        /**
         * 是否佩戴眼镜的分析结果，value的值为None/Dark/Normal。None代表不佩戴眼镜，Dark代表佩戴墨镜，Normal代表佩戴普通眼镜。（请注意，motionblur 和 gaussianblur 将于2017-4-30日停止返回，请尽快停用)
         headpose：人脸姿势分析结果，包括pitch_angle, roll_angle, yaw_angle，分别对应抬头，旋转（平面旋转），摇头。单位为角度。
         */
        private Glass glass;

        private Headpose headpose;

        /**
         * smiling：笑容分析结果，value的值为一个[0,100]的浮点数，小数点后3位有效数字，数值大表示笑程度高。threshold代表笑容的阈值，超过该阈值认为有笑容。
         */
        private Smile smile;

        public void setAge(Age age){
            this.age = age;
        }
        public Age getAge(){
            return this.age;
        }
        public void setBlur(Blur blur){
            this.blur = blur;
        }
        public Blur getBlur(){
            return this.blur;
        }
        public void setEthnicity(Ethnicity ethnicity){
            this.ethnicity = ethnicity;
        }
        public Ethnicity getEthnicity(){
            return this.ethnicity;
        }
        public void setEyestatus(Eyestatus eyestatus){
            this.eyestatus = eyestatus;
        }
        public Eyestatus getEyestatus(){
            return this.eyestatus;
        }
        public void setFacequality(Facequality facequality){
            this.facequality = facequality;
        }
        public Facequality getFacequality(){
            return this.facequality;
        }
        public void setGender(Gender gender){
            this.gender = gender;
        }
        public Gender getGender(){
            return this.gender;
        }
        public void setGlass(Glass glass){
            this.glass = glass;
        }
        public Glass getGlass(){
            return this.glass;
        }
        public void setHeadpose(Headpose headpose){
            this.headpose = headpose;
        }
        public Headpose getHeadpose(){
            return this.headpose;
        }
        public void setSmile(Smile smile){
            this.smile = smile;
        }
        public Smile getSmile(){
            return this.smile;
        }

        @Override
        public String toString() {
            return "Attributes{" +
                    "age=" + age +
                    ", blur=" + blur +
                    ", ethnicity=" + ethnicity +
                    ", eyestatus=" + eyestatus +
                    ", facequality=" + facequality +
                    ", gender=" + gender +
                    ", glass=" + glass +
                    ", headpose=" + headpose +
                    ", smile=" + smile +
                    '}';
        }
    }



    public class Face_rectangle
    {
        private int height;

        private int left;

        private int top;

        private int width;

        public void setHeight(int height){
            this.height = height;
        }
        public int getHeight(){
            return this.height;
        }
        public void setLeft(int left){
            this.left = left;
        }
        public int getLeft(){
            return this.left;
        }
        public void setTop(int top){
            this.top = top;
        }
        public int getTop(){
            return this.top;
        }
        public void setWidth(int width){
            this.width = width;
        }
        public int getWidth(){
            return this.width;
        }
    }



    public class Contour_chin
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_left1
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_left2
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_left3
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_left4
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_left5
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_left6
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_left7
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_left8
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_left9
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_right1
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_right2
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_right3
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_right4
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_right5
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_right6
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_right7
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_right8
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Contour_right9
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eye_bottom
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eye_center
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eye_left_corner
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eye_lower_left_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eye_lower_right_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eye_pupil
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eye_right_corner
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eye_top
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eye_upper_left_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eye_upper_right_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eyebrow_left_corner
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eyebrow_lower_left_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eyebrow_lower_middle
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eyebrow_lower_right_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eyebrow_right_corner
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eyebrow_upper_left_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eyebrow_upper_middle
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Left_eyebrow_upper_right_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_left_corner
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_lower_lip_bottom
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_lower_lip_left_contour1
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_lower_lip_left_contour2
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_lower_lip_left_contour3
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_lower_lip_right_contour1
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_lower_lip_right_contour2
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_lower_lip_right_contour3
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_lower_lip_top
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_right_corner
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_upper_lip_bottom
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_upper_lip_left_contour1
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_upper_lip_left_contour2
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_upper_lip_left_contour3
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_upper_lip_right_contour1
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_upper_lip_right_contour2
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_upper_lip_right_contour3
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Mouth_upper_lip_top
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Nose_contour_left1
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Nose_contour_left2
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Nose_contour_left3
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Nose_contour_lower_middle
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Nose_contour_right1
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Nose_contour_right2
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Nose_contour_right3
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Nose_left
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Nose_right
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }

    public class Nose_tip
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }

    public class Right_eye_bottom
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }

    public class Right_eye_center
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eye_left_corner
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eye_lower_left_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eye_lower_right_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eye_pupil
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eye_right_corner
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eye_top
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eye_upper_left_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eye_upper_right_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eyebrow_left_corner
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eyebrow_lower_left_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eyebrow_lower_middle
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eyebrow_lower_right_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eyebrow_right_corner
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Right_eyebrow_upper_left_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }

    public class Right_eyebrow_upper_middle
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }

    public class Right_eyebrow_upper_right_quarter
    {
        private int x;

        private int y;

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return this.y;
        }
    }



    public class Landmark
    {
        private Contour_chin contour_chin;

        private Contour_left1 contour_left1;

        private Contour_left2 contour_left2;

        private Contour_left3 contour_left3;

        private Contour_left4 contour_left4;

        private Contour_left5 contour_left5;

        private Contour_left6 contour_left6;

        private Contour_left7 contour_left7;

        private Contour_left8 contour_left8;

        private Contour_left9 contour_left9;

        private Contour_right1 contour_right1;

        private Contour_right2 contour_right2;

        private Contour_right3 contour_right3;

        private Contour_right4 contour_right4;

        private Contour_right5 contour_right5;

        private Contour_right6 contour_right6;

        private Contour_right7 contour_right7;

        private Contour_right8 contour_right8;

        private Contour_right9 contour_right9;

        private Left_eye_bottom left_eye_bottom;

        private Left_eye_center left_eye_center;

        private Left_eye_left_corner left_eye_left_corner;

        private Left_eye_lower_left_quarter left_eye_lower_left_quarter;

        private Left_eye_lower_right_quarter left_eye_lower_right_quarter;

        private Left_eye_pupil left_eye_pupil;

        private Left_eye_right_corner left_eye_right_corner;

        private Left_eye_top left_eye_top;

        private Left_eye_upper_left_quarter left_eye_upper_left_quarter;

        private Left_eye_upper_right_quarter left_eye_upper_right_quarter;

        private Left_eyebrow_left_corner left_eyebrow_left_corner;

        private Left_eyebrow_lower_left_quarter left_eyebrow_lower_left_quarter;

        private Left_eyebrow_lower_middle left_eyebrow_lower_middle;

        private Left_eyebrow_lower_right_quarter left_eyebrow_lower_right_quarter;

        private Left_eyebrow_right_corner left_eyebrow_right_corner;

        private Left_eyebrow_upper_left_quarter left_eyebrow_upper_left_quarter;

        private Left_eyebrow_upper_middle left_eyebrow_upper_middle;

        private Left_eyebrow_upper_right_quarter left_eyebrow_upper_right_quarter;

        private Mouth_left_corner mouth_left_corner;

        private Mouth_lower_lip_bottom mouth_lower_lip_bottom;

        private Mouth_lower_lip_left_contour1 mouth_lower_lip_left_contour1;

        private Mouth_lower_lip_left_contour2 mouth_lower_lip_left_contour2;

        private Mouth_lower_lip_left_contour3 mouth_lower_lip_left_contour3;

        private Mouth_lower_lip_right_contour1 mouth_lower_lip_right_contour1;

        private Mouth_lower_lip_right_contour2 mouth_lower_lip_right_contour2;

        private Mouth_lower_lip_right_contour3 mouth_lower_lip_right_contour3;

        private Mouth_lower_lip_top mouth_lower_lip_top;

        private Mouth_right_corner mouth_right_corner;

        private Mouth_upper_lip_bottom mouth_upper_lip_bottom;

        private Mouth_upper_lip_left_contour1 mouth_upper_lip_left_contour1;

        private Mouth_upper_lip_left_contour2 mouth_upper_lip_left_contour2;

        private Mouth_upper_lip_left_contour3 mouth_upper_lip_left_contour3;

        private Mouth_upper_lip_right_contour1 mouth_upper_lip_right_contour1;

        private Mouth_upper_lip_right_contour2 mouth_upper_lip_right_contour2;

        private Mouth_upper_lip_right_contour3 mouth_upper_lip_right_contour3;

        private Mouth_upper_lip_top mouth_upper_lip_top;

        private Nose_contour_left1 nose_contour_left1;

        private Nose_contour_left2 nose_contour_left2;

        private Nose_contour_left3 nose_contour_left3;

        private Nose_contour_lower_middle nose_contour_lower_middle;

        private Nose_contour_right1 nose_contour_right1;

        private Nose_contour_right2 nose_contour_right2;

        private Nose_contour_right3 nose_contour_right3;

        private Nose_left nose_left;

        private Nose_right nose_right;

        private Nose_tip nose_tip;

        private Right_eye_bottom right_eye_bottom;

        private Right_eye_center right_eye_center;

        private Right_eye_left_corner right_eye_left_corner;

        private Right_eye_lower_left_quarter right_eye_lower_left_quarter;

        private Right_eye_lower_right_quarter right_eye_lower_right_quarter;

        private Right_eye_pupil right_eye_pupil;

        private Right_eye_right_corner right_eye_right_corner;

        private Right_eye_top right_eye_top;

        private Right_eye_upper_left_quarter right_eye_upper_left_quarter;

        private Right_eye_upper_right_quarter right_eye_upper_right_quarter;

        private Right_eyebrow_left_corner right_eyebrow_left_corner;

        private Right_eyebrow_lower_left_quarter right_eyebrow_lower_left_quarter;

        private Right_eyebrow_lower_middle right_eyebrow_lower_middle;

        private Right_eyebrow_lower_right_quarter right_eyebrow_lower_right_quarter;

        private Right_eyebrow_right_corner right_eyebrow_right_corner;

        private Right_eyebrow_upper_left_quarter right_eyebrow_upper_left_quarter;

        private Right_eyebrow_upper_middle right_eyebrow_upper_middle;

        private Right_eyebrow_upper_right_quarter right_eyebrow_upper_right_quarter;

        public void setContour_chin(Contour_chin contour_chin){
            this.contour_chin = contour_chin;
        }
        public Contour_chin getContour_chin(){
            return this.contour_chin;
        }
        public void setContour_left1(Contour_left1 contour_left1){
            this.contour_left1 = contour_left1;
        }
        public Contour_left1 getContour_left1(){
            return this.contour_left1;
        }
        public void setContour_left2(Contour_left2 contour_left2){
            this.contour_left2 = contour_left2;
        }
        public Contour_left2 getContour_left2(){
            return this.contour_left2;
        }
        public void setContour_left3(Contour_left3 contour_left3){
            this.contour_left3 = contour_left3;
        }
        public Contour_left3 getContour_left3(){
            return this.contour_left3;
        }
        public void setContour_left4(Contour_left4 contour_left4){
            this.contour_left4 = contour_left4;
        }
        public Contour_left4 getContour_left4(){
            return this.contour_left4;
        }
        public void setContour_left5(Contour_left5 contour_left5){
            this.contour_left5 = contour_left5;
        }
        public Contour_left5 getContour_left5(){
            return this.contour_left5;
        }
        public void setContour_left6(Contour_left6 contour_left6){
            this.contour_left6 = contour_left6;
        }
        public Contour_left6 getContour_left6(){
            return this.contour_left6;
        }
        public void setContour_left7(Contour_left7 contour_left7){
            this.contour_left7 = contour_left7;
        }
        public Contour_left7 getContour_left7(){
            return this.contour_left7;
        }
        public void setContour_left8(Contour_left8 contour_left8){
            this.contour_left8 = contour_left8;
        }
        public Contour_left8 getContour_left8(){
            return this.contour_left8;
        }
        public void setContour_left9(Contour_left9 contour_left9){
            this.contour_left9 = contour_left9;
        }
        public Contour_left9 getContour_left9(){
            return this.contour_left9;
        }
        public void setContour_right1(Contour_right1 contour_right1){
            this.contour_right1 = contour_right1;
        }
        public Contour_right1 getContour_right1(){
            return this.contour_right1;
        }
        public void setContour_right2(Contour_right2 contour_right2){
            this.contour_right2 = contour_right2;
        }
        public Contour_right2 getContour_right2(){
            return this.contour_right2;
        }
        public void setContour_right3(Contour_right3 contour_right3){
            this.contour_right3 = contour_right3;
        }
        public Contour_right3 getContour_right3(){
            return this.contour_right3;
        }
        public void setContour_right4(Contour_right4 contour_right4){
            this.contour_right4 = contour_right4;
        }
        public Contour_right4 getContour_right4(){
            return this.contour_right4;
        }
        public void setContour_right5(Contour_right5 contour_right5){
            this.contour_right5 = contour_right5;
        }
        public Contour_right5 getContour_right5(){
            return this.contour_right5;
        }
        public void setContour_right6(Contour_right6 contour_right6){
            this.contour_right6 = contour_right6;
        }
        public Contour_right6 getContour_right6(){
            return this.contour_right6;
        }
        public void setContour_right7(Contour_right7 contour_right7){
            this.contour_right7 = contour_right7;
        }
        public Contour_right7 getContour_right7(){
            return this.contour_right7;
        }
        public void setContour_right8(Contour_right8 contour_right8){
            this.contour_right8 = contour_right8;
        }
        public Contour_right8 getContour_right8(){
            return this.contour_right8;
        }
        public void setContour_right9(Contour_right9 contour_right9){
            this.contour_right9 = contour_right9;
        }
        public Contour_right9 getContour_right9(){
            return this.contour_right9;
        }
        public void setLeft_eye_bottom(Left_eye_bottom left_eye_bottom){
            this.left_eye_bottom = left_eye_bottom;
        }
        public Left_eye_bottom getLeft_eye_bottom(){
            return this.left_eye_bottom;
        }
        public void setLeft_eye_center(Left_eye_center left_eye_center){
            this.left_eye_center = left_eye_center;
        }
        public Left_eye_center getLeft_eye_center(){
            return this.left_eye_center;
        }
        public void setLeft_eye_left_corner(Left_eye_left_corner left_eye_left_corner){
            this.left_eye_left_corner = left_eye_left_corner;
        }
        public Left_eye_left_corner getLeft_eye_left_corner(){
            return this.left_eye_left_corner;
        }
        public void setLeft_eye_lower_left_quarter(Left_eye_lower_left_quarter left_eye_lower_left_quarter){
            this.left_eye_lower_left_quarter = left_eye_lower_left_quarter;
        }
        public Left_eye_lower_left_quarter getLeft_eye_lower_left_quarter(){
            return this.left_eye_lower_left_quarter;
        }
        public void setLeft_eye_lower_right_quarter(Left_eye_lower_right_quarter left_eye_lower_right_quarter){
            this.left_eye_lower_right_quarter = left_eye_lower_right_quarter;
        }
        public Left_eye_lower_right_quarter getLeft_eye_lower_right_quarter(){
            return this.left_eye_lower_right_quarter;
        }
        public void setLeft_eye_pupil(Left_eye_pupil left_eye_pupil){
            this.left_eye_pupil = left_eye_pupil;
        }
        public Left_eye_pupil getLeft_eye_pupil(){
            return this.left_eye_pupil;
        }
        public void setLeft_eye_right_corner(Left_eye_right_corner left_eye_right_corner){
            this.left_eye_right_corner = left_eye_right_corner;
        }
        public Left_eye_right_corner getLeft_eye_right_corner(){
            return this.left_eye_right_corner;
        }
        public void setLeft_eye_top(Left_eye_top left_eye_top){
            this.left_eye_top = left_eye_top;
        }
        public Left_eye_top getLeft_eye_top(){
            return this.left_eye_top;
        }
        public void setLeft_eye_upper_left_quarter(Left_eye_upper_left_quarter left_eye_upper_left_quarter){
            this.left_eye_upper_left_quarter = left_eye_upper_left_quarter;
        }
        public Left_eye_upper_left_quarter getLeft_eye_upper_left_quarter(){
            return this.left_eye_upper_left_quarter;
        }
        public void setLeft_eye_upper_right_quarter(Left_eye_upper_right_quarter left_eye_upper_right_quarter){
            this.left_eye_upper_right_quarter = left_eye_upper_right_quarter;
        }
        public Left_eye_upper_right_quarter getLeft_eye_upper_right_quarter(){
            return this.left_eye_upper_right_quarter;
        }
        public void setLeft_eyebrow_left_corner(Left_eyebrow_left_corner left_eyebrow_left_corner){
            this.left_eyebrow_left_corner = left_eyebrow_left_corner;
        }
        public Left_eyebrow_left_corner getLeft_eyebrow_left_corner(){
            return this.left_eyebrow_left_corner;
        }
        public void setLeft_eyebrow_lower_left_quarter(Left_eyebrow_lower_left_quarter left_eyebrow_lower_left_quarter){
            this.left_eyebrow_lower_left_quarter = left_eyebrow_lower_left_quarter;
        }
        public Left_eyebrow_lower_left_quarter getLeft_eyebrow_lower_left_quarter(){
            return this.left_eyebrow_lower_left_quarter;
        }
        public void setLeft_eyebrow_lower_middle(Left_eyebrow_lower_middle left_eyebrow_lower_middle){
            this.left_eyebrow_lower_middle = left_eyebrow_lower_middle;
        }
        public Left_eyebrow_lower_middle getLeft_eyebrow_lower_middle(){
            return this.left_eyebrow_lower_middle;
        }
        public void setLeft_eyebrow_lower_right_quarter(Left_eyebrow_lower_right_quarter left_eyebrow_lower_right_quarter){
            this.left_eyebrow_lower_right_quarter = left_eyebrow_lower_right_quarter;
        }
        public Left_eyebrow_lower_right_quarter getLeft_eyebrow_lower_right_quarter(){
            return this.left_eyebrow_lower_right_quarter;
        }
        public void setLeft_eyebrow_right_corner(Left_eyebrow_right_corner left_eyebrow_right_corner){
            this.left_eyebrow_right_corner = left_eyebrow_right_corner;
        }
        public Left_eyebrow_right_corner getLeft_eyebrow_right_corner(){
            return this.left_eyebrow_right_corner;
        }
        public void setLeft_eyebrow_upper_left_quarter(Left_eyebrow_upper_left_quarter left_eyebrow_upper_left_quarter){
            this.left_eyebrow_upper_left_quarter = left_eyebrow_upper_left_quarter;
        }
        public Left_eyebrow_upper_left_quarter getLeft_eyebrow_upper_left_quarter(){
            return this.left_eyebrow_upper_left_quarter;
        }
        public void setLeft_eyebrow_upper_middle(Left_eyebrow_upper_middle left_eyebrow_upper_middle){
            this.left_eyebrow_upper_middle = left_eyebrow_upper_middle;
        }
        public Left_eyebrow_upper_middle getLeft_eyebrow_upper_middle(){
            return this.left_eyebrow_upper_middle;
        }
        public void setLeft_eyebrow_upper_right_quarter(Left_eyebrow_upper_right_quarter left_eyebrow_upper_right_quarter){
            this.left_eyebrow_upper_right_quarter = left_eyebrow_upper_right_quarter;
        }
        public Left_eyebrow_upper_right_quarter getLeft_eyebrow_upper_right_quarter(){
            return this.left_eyebrow_upper_right_quarter;
        }
        public void setMouth_left_corner(Mouth_left_corner mouth_left_corner){
            this.mouth_left_corner = mouth_left_corner;
        }
        public Mouth_left_corner getMouth_left_corner(){
            return this.mouth_left_corner;
        }
        public void setMouth_lower_lip_bottom(Mouth_lower_lip_bottom mouth_lower_lip_bottom){
            this.mouth_lower_lip_bottom = mouth_lower_lip_bottom;
        }
        public Mouth_lower_lip_bottom getMouth_lower_lip_bottom(){
            return this.mouth_lower_lip_bottom;
        }
        public void setMouth_lower_lip_left_contour1(Mouth_lower_lip_left_contour1 mouth_lower_lip_left_contour1){
            this.mouth_lower_lip_left_contour1 = mouth_lower_lip_left_contour1;
        }
        public Mouth_lower_lip_left_contour1 getMouth_lower_lip_left_contour1(){
            return this.mouth_lower_lip_left_contour1;
        }
        public void setMouth_lower_lip_left_contour2(Mouth_lower_lip_left_contour2 mouth_lower_lip_left_contour2){
            this.mouth_lower_lip_left_contour2 = mouth_lower_lip_left_contour2;
        }
        public Mouth_lower_lip_left_contour2 getMouth_lower_lip_left_contour2(){
            return this.mouth_lower_lip_left_contour2;
        }
        public void setMouth_lower_lip_left_contour3(Mouth_lower_lip_left_contour3 mouth_lower_lip_left_contour3){
            this.mouth_lower_lip_left_contour3 = mouth_lower_lip_left_contour3;
        }
        public Mouth_lower_lip_left_contour3 getMouth_lower_lip_left_contour3(){
            return this.mouth_lower_lip_left_contour3;
        }
        public void setMouth_lower_lip_right_contour1(Mouth_lower_lip_right_contour1 mouth_lower_lip_right_contour1){
            this.mouth_lower_lip_right_contour1 = mouth_lower_lip_right_contour1;
        }
        public Mouth_lower_lip_right_contour1 getMouth_lower_lip_right_contour1(){
            return this.mouth_lower_lip_right_contour1;
        }
        public void setMouth_lower_lip_right_contour2(Mouth_lower_lip_right_contour2 mouth_lower_lip_right_contour2){
            this.mouth_lower_lip_right_contour2 = mouth_lower_lip_right_contour2;
        }
        public Mouth_lower_lip_right_contour2 getMouth_lower_lip_right_contour2(){
            return this.mouth_lower_lip_right_contour2;
        }
        public void setMouth_lower_lip_right_contour3(Mouth_lower_lip_right_contour3 mouth_lower_lip_right_contour3){
            this.mouth_lower_lip_right_contour3 = mouth_lower_lip_right_contour3;
        }
        public Mouth_lower_lip_right_contour3 getMouth_lower_lip_right_contour3(){
            return this.mouth_lower_lip_right_contour3;
        }
        public void setMouth_lower_lip_top(Mouth_lower_lip_top mouth_lower_lip_top){
            this.mouth_lower_lip_top = mouth_lower_lip_top;
        }
        public Mouth_lower_lip_top getMouth_lower_lip_top(){
            return this.mouth_lower_lip_top;
        }
        public void setMouth_right_corner(Mouth_right_corner mouth_right_corner){
            this.mouth_right_corner = mouth_right_corner;
        }
        public Mouth_right_corner getMouth_right_corner(){
            return this.mouth_right_corner;
        }
        public void setMouth_upper_lip_bottom(Mouth_upper_lip_bottom mouth_upper_lip_bottom){
            this.mouth_upper_lip_bottom = mouth_upper_lip_bottom;
        }
        public Mouth_upper_lip_bottom getMouth_upper_lip_bottom(){
            return this.mouth_upper_lip_bottom;
        }
        public void setMouth_upper_lip_left_contour1(Mouth_upper_lip_left_contour1 mouth_upper_lip_left_contour1){
            this.mouth_upper_lip_left_contour1 = mouth_upper_lip_left_contour1;
        }
        public Mouth_upper_lip_left_contour1 getMouth_upper_lip_left_contour1(){
            return this.mouth_upper_lip_left_contour1;
        }
        public void setMouth_upper_lip_left_contour2(Mouth_upper_lip_left_contour2 mouth_upper_lip_left_contour2){
            this.mouth_upper_lip_left_contour2 = mouth_upper_lip_left_contour2;
        }
        public Mouth_upper_lip_left_contour2 getMouth_upper_lip_left_contour2(){
            return this.mouth_upper_lip_left_contour2;
        }
        public void setMouth_upper_lip_left_contour3(Mouth_upper_lip_left_contour3 mouth_upper_lip_left_contour3){
            this.mouth_upper_lip_left_contour3 = mouth_upper_lip_left_contour3;
        }
        public Mouth_upper_lip_left_contour3 getMouth_upper_lip_left_contour3(){
            return this.mouth_upper_lip_left_contour3;
        }
        public void setMouth_upper_lip_right_contour1(Mouth_upper_lip_right_contour1 mouth_upper_lip_right_contour1){
            this.mouth_upper_lip_right_contour1 = mouth_upper_lip_right_contour1;
        }
        public Mouth_upper_lip_right_contour1 getMouth_upper_lip_right_contour1(){
            return this.mouth_upper_lip_right_contour1;
        }
        public void setMouth_upper_lip_right_contour2(Mouth_upper_lip_right_contour2 mouth_upper_lip_right_contour2){
            this.mouth_upper_lip_right_contour2 = mouth_upper_lip_right_contour2;
        }
        public Mouth_upper_lip_right_contour2 getMouth_upper_lip_right_contour2(){
            return this.mouth_upper_lip_right_contour2;
        }
        public void setMouth_upper_lip_right_contour3(Mouth_upper_lip_right_contour3 mouth_upper_lip_right_contour3){
            this.mouth_upper_lip_right_contour3 = mouth_upper_lip_right_contour3;
        }
        public Mouth_upper_lip_right_contour3 getMouth_upper_lip_right_contour3(){
            return this.mouth_upper_lip_right_contour3;
        }
        public void setMouth_upper_lip_top(Mouth_upper_lip_top mouth_upper_lip_top){
            this.mouth_upper_lip_top = mouth_upper_lip_top;
        }
        public Mouth_upper_lip_top getMouth_upper_lip_top(){
            return this.mouth_upper_lip_top;
        }
        public void setNose_contour_left1(Nose_contour_left1 nose_contour_left1){
            this.nose_contour_left1 = nose_contour_left1;
        }
        public Nose_contour_left1 getNose_contour_left1(){
            return this.nose_contour_left1;
        }
        public void setNose_contour_left2(Nose_contour_left2 nose_contour_left2){
            this.nose_contour_left2 = nose_contour_left2;
        }
        public Nose_contour_left2 getNose_contour_left2(){
            return this.nose_contour_left2;
        }
        public void setNose_contour_left3(Nose_contour_left3 nose_contour_left3){
            this.nose_contour_left3 = nose_contour_left3;
        }
        public Nose_contour_left3 getNose_contour_left3(){
            return this.nose_contour_left3;
        }
        public void setNose_contour_lower_middle(Nose_contour_lower_middle nose_contour_lower_middle){
            this.nose_contour_lower_middle = nose_contour_lower_middle;
        }
        public Nose_contour_lower_middle getNose_contour_lower_middle(){
            return this.nose_contour_lower_middle;
        }
        public void setNose_contour_right1(Nose_contour_right1 nose_contour_right1){
            this.nose_contour_right1 = nose_contour_right1;
        }
        public Nose_contour_right1 getNose_contour_right1(){
            return this.nose_contour_right1;
        }
        public void setNose_contour_right2(Nose_contour_right2 nose_contour_right2){
            this.nose_contour_right2 = nose_contour_right2;
        }
        public Nose_contour_right2 getNose_contour_right2(){
            return this.nose_contour_right2;
        }
        public void setNose_contour_right3(Nose_contour_right3 nose_contour_right3){
            this.nose_contour_right3 = nose_contour_right3;
        }
        public Nose_contour_right3 getNose_contour_right3(){
            return this.nose_contour_right3;
        }
        public void setNose_left(Nose_left nose_left){
            this.nose_left = nose_left;
        }
        public Nose_left getNose_left(){
            return this.nose_left;
        }
        public void setNose_right(Nose_right nose_right){
            this.nose_right = nose_right;
        }
        public Nose_right getNose_right(){
            return this.nose_right;
        }
        public void setNose_tip(Nose_tip nose_tip){
            this.nose_tip = nose_tip;
        }
        public Nose_tip getNose_tip(){
            return this.nose_tip;
        }
        public void setRight_eye_bottom(Right_eye_bottom right_eye_bottom){
            this.right_eye_bottom = right_eye_bottom;
        }
        public Right_eye_bottom getRight_eye_bottom(){
            return this.right_eye_bottom;
        }
        public void setRight_eye_center(Right_eye_center right_eye_center){
            this.right_eye_center = right_eye_center;
        }
        public Right_eye_center getRight_eye_center(){
            return this.right_eye_center;
        }
        public void setRight_eye_left_corner(Right_eye_left_corner right_eye_left_corner){
            this.right_eye_left_corner = right_eye_left_corner;
        }
        public Right_eye_left_corner getRight_eye_left_corner(){
            return this.right_eye_left_corner;
        }
        public void setRight_eye_lower_left_quarter(Right_eye_lower_left_quarter right_eye_lower_left_quarter){
            this.right_eye_lower_left_quarter = right_eye_lower_left_quarter;
        }
        public Right_eye_lower_left_quarter getRight_eye_lower_left_quarter(){
            return this.right_eye_lower_left_quarter;
        }
        public void setRight_eye_lower_right_quarter(Right_eye_lower_right_quarter right_eye_lower_right_quarter){
            this.right_eye_lower_right_quarter = right_eye_lower_right_quarter;
        }
        public Right_eye_lower_right_quarter getRight_eye_lower_right_quarter(){
            return this.right_eye_lower_right_quarter;
        }
        public void setRight_eye_pupil(Right_eye_pupil right_eye_pupil){
            this.right_eye_pupil = right_eye_pupil;
        }
        public Right_eye_pupil getRight_eye_pupil(){
            return this.right_eye_pupil;
        }
        public void setRight_eye_right_corner(Right_eye_right_corner right_eye_right_corner){
            this.right_eye_right_corner = right_eye_right_corner;
        }
        public Right_eye_right_corner getRight_eye_right_corner(){
            return this.right_eye_right_corner;
        }
        public void setRight_eye_top(Right_eye_top right_eye_top){
            this.right_eye_top = right_eye_top;
        }
        public Right_eye_top getRight_eye_top(){
            return this.right_eye_top;
        }
        public void setRight_eye_upper_left_quarter(Right_eye_upper_left_quarter right_eye_upper_left_quarter){
            this.right_eye_upper_left_quarter = right_eye_upper_left_quarter;
        }
        public Right_eye_upper_left_quarter getRight_eye_upper_left_quarter(){
            return this.right_eye_upper_left_quarter;
        }
        public void setRight_eye_upper_right_quarter(Right_eye_upper_right_quarter right_eye_upper_right_quarter){
            this.right_eye_upper_right_quarter = right_eye_upper_right_quarter;
        }
        public Right_eye_upper_right_quarter getRight_eye_upper_right_quarter(){
            return this.right_eye_upper_right_quarter;
        }
        public void setRight_eyebrow_left_corner(Right_eyebrow_left_corner right_eyebrow_left_corner){
            this.right_eyebrow_left_corner = right_eyebrow_left_corner;
        }
        public Right_eyebrow_left_corner getRight_eyebrow_left_corner(){
            return this.right_eyebrow_left_corner;
        }
        public void setRight_eyebrow_lower_left_quarter(Right_eyebrow_lower_left_quarter right_eyebrow_lower_left_quarter){
            this.right_eyebrow_lower_left_quarter = right_eyebrow_lower_left_quarter;
        }
        public Right_eyebrow_lower_left_quarter getRight_eyebrow_lower_left_quarter(){
            return this.right_eyebrow_lower_left_quarter;
        }
        public void setRight_eyebrow_lower_middle(Right_eyebrow_lower_middle right_eyebrow_lower_middle){
            this.right_eyebrow_lower_middle = right_eyebrow_lower_middle;
        }
        public Right_eyebrow_lower_middle getRight_eyebrow_lower_middle(){
            return this.right_eyebrow_lower_middle;
        }
        public void setRight_eyebrow_lower_right_quarter(Right_eyebrow_lower_right_quarter right_eyebrow_lower_right_quarter){
            this.right_eyebrow_lower_right_quarter = right_eyebrow_lower_right_quarter;
        }
        public Right_eyebrow_lower_right_quarter getRight_eyebrow_lower_right_quarter(){
            return this.right_eyebrow_lower_right_quarter;
        }
        public void setRight_eyebrow_right_corner(Right_eyebrow_right_corner right_eyebrow_right_corner){
            this.right_eyebrow_right_corner = right_eyebrow_right_corner;
        }
        public Right_eyebrow_right_corner getRight_eyebrow_right_corner(){
            return this.right_eyebrow_right_corner;
        }
        public void setRight_eyebrow_upper_left_quarter(Right_eyebrow_upper_left_quarter right_eyebrow_upper_left_quarter){
            this.right_eyebrow_upper_left_quarter = right_eyebrow_upper_left_quarter;
        }
        public Right_eyebrow_upper_left_quarter getRight_eyebrow_upper_left_quarter(){
            return this.right_eyebrow_upper_left_quarter;
        }
        public void setRight_eyebrow_upper_middle(Right_eyebrow_upper_middle right_eyebrow_upper_middle){
            this.right_eyebrow_upper_middle = right_eyebrow_upper_middle;
        }
        public Right_eyebrow_upper_middle getRight_eyebrow_upper_middle(){
            return this.right_eyebrow_upper_middle;
        }
        public void setRight_eyebrow_upper_right_quarter(Right_eyebrow_upper_right_quarter right_eyebrow_upper_right_quarter){
            this.right_eyebrow_upper_right_quarter = right_eyebrow_upper_right_quarter;
        }
        public Right_eyebrow_upper_right_quarter getRight_eyebrow_upper_right_quarter(){
            return this.right_eyebrow_upper_right_quarter;
        }
    }

    public class Faces
    {
        private Attributes attributes;

        private Face_rectangle face_rectangle;

        private String face_token;

        private Landmark landmark;

        public void setAttributes(Attributes attributes){
            this.attributes = attributes;
        }
        public Attributes getAttributes(){
            return this.attributes;
        }
        public void setFace_rectangle(Face_rectangle face_rectangle){
            this.face_rectangle = face_rectangle;
        }
        public Face_rectangle getFace_rectangle(){
            return this.face_rectangle;
        }
        public void setFace_token(String face_token){
            this.face_token = face_token;
        }
        public String getFace_token(){
            return this.face_token;
        }
        public void setLandmark(Landmark landmark){
            this.landmark = landmark;
        }
        public Landmark getLandmark(){
            return this.landmark;
        }

        @Override
        public String toString() {
            return "Faces{" +
                    "attributes=" + attributes +
                    ", face_rectangle=" + face_rectangle +
                    ", face_token='" + face_token + '\'' +
                    ", landmark=" + landmark +
                    '}';
        }
    }
}
