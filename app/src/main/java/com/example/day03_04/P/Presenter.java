package com.example.day03_04.P;

import com.example.day03_04.Conctract.Contract;
import com.example.day03_04.M.Modle;
import com.example.day03_04.Net.MyCallBack;
import com.example.day03_04.Net.UrlContracr;
import com.example.day03_04.V.MainActivity;
import com.example.day03_04.bean.NewsBean;

public class Presenter implements Contract.PresenterContract{
    private Contract.ViewContract viewContract;
    private Contract.ModleContract modleContract;


    public Presenter(Contract.ViewContract viewContract) {
        modleContract=new Modle(this);
        this.viewContract = viewContract;
    }


    @Override
    public void initData() {
            modleContract.GetData(UrlContracr.NEWSURL, new MyCallBack<NewsBean>() {
                @Override
                public void onSuccess(NewsBean newsBean) {
                    viewContract.getdd(newsBean);
                }

                @Override
                public void onFail(String error) {

                }
            });
    }
}
