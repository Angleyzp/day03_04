package com.example.day03_04.Net;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface APiService {

    @GET
    Observable<ResponseBody> getDatas(@Url String url);
}
