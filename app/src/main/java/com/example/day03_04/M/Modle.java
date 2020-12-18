package com.example.day03_04.M;

import com.example.day03_04.Conctract.Contract;
import com.example.day03_04.Net.MyCallBack;
import com.example.day03_04.Net.RetrofitUtils;
import com.example.day03_04.Net.UrlContracr;
import com.example.day03_04.P.Presenter;
import com.example.day03_04.bean.NewsBean;

public class Modle implements Contract.ModleContract{
    private Contract.PresenterContract presenter;

    public Modle(Contract.PresenterContract presenter) {
        this.presenter = presenter;
    }


    @Override
    public <T> void GetData(String url, MyCallBack<T> callBack) {
            RetrofitUtils.getRetrofitUtils().getDesc(url,callBack);
    }
}
