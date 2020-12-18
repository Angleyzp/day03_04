package com.example.day03_04.Conctract;

import com.example.day03_04.Net.MyCallBack;
import com.example.day03_04.bean.NewsBean;

public class Contract {
    public interface ModleContract{
        <T> void GetData(String url, MyCallBack<T> callBack);

    }
    public interface ViewContract{
        void getdd(NewsBean newsBean);

    }
    public interface PresenterContract{
        void initData();
    }
}
