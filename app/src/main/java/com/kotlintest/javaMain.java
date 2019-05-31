package com.kotlintest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * author:  cc
 * TODO
 * date:   On  2019/5/30
 */
public class javaMain extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.javamain);

        int[] arr=new int[]{1,2,3,4};
        Log.i("xiaoqiang", "onCreate: "+arr);

        List<String> list=new ArrayList<>();
        list.add("aa");
        list.add("bb");
        Log.i("xiaoqiang", "onCreate: "+list);
    }
}
