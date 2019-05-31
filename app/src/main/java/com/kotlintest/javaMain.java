package com.kotlintest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

        List<String> list=new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.set(1,"123");
        Log.i("xiaoqiang", "onCreate: "+list);


        Set<String> strings=new HashSet<>();
        strings.add("asd");

        Map<String,String> map=new HashMap<>();
        map.put("a","s");
        Set<String> strings1 = map.keySet();

    }
}
