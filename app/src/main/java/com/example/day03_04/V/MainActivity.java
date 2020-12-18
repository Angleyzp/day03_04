package com.example.day03_04.V;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.day03_04.Adapter.Adapter;
import com.example.day03_04.Conctract.Contract;
import com.example.day03_04.P.Presenter;
import com.example.day03_04.R;
import com.example.day03_04.base.BaseActivity;
import com.example.day03_04.bean.NewsBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<Presenter> implements Contract.ViewContract {

    //yzp分支修改推送

    private RecyclerView recy;
    private ArrayList<NewsBean.NewsDTO> list;
    private Adapter adapter;

    @Override
    protected void initView() {
        recy = findViewById(R.id.recy);
        list = new ArrayList<>();
        recy.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this,list);
        recy.setAdapter(adapter);

    }

    @Override
    protected void initData() {
        per.initData();
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public Presenter getPer() {
        return new Presenter(this);
    }

    @Override
    public void getdd(NewsBean newsBean) {
        List<NewsBean.NewsDTO> news = newsBean.getNews();
        list.addAll(news);
        adapter.notifyDataSetChanged();
    }
}