package com.example.day03_04.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<V> extends AppCompatActivity {
        public V per;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        if (per==null){
            per=getPer();
        }
        initView();
        initData();
    }

    protected abstract void initView();
    protected abstract void initData();
    protected abstract int getLayoutID();
    public abstract V getPer();
}
