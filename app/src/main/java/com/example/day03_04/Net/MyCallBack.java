package com.example.day03_04.Net;

public interface MyCallBack<T> {
    void onSuccess(T t);
    void onFail(String error);
}
