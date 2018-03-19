package com.yuqiaotech.facepp.retrofit;


import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * (用一句话描述类的主要功能)
 * Created by yun on 2018/3/19.
 */
public interface IPost {

    @POST("detect")
    Observable<String> login(@QueryMap HashMap<String, String> paramsMap);

    @GET("users/{user}/repos")
    Call<List<String>> listRepos(@Path("user") String user);
}
