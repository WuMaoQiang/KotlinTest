package com.kotlintest;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

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
    TextView tv_alert;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.javamain);
        tv_alert = findViewById(R.id.tv_alert);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("尊敬的用户");
        builder.setMessage("你真的要卸载我吗？");
        builder.setPositiveButton("残忍卸载", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                tv_alert.setText("虽然依依不舍，但是只能离开了");
            }

        });
        builder.setNegativeButton("我再想想", new DialogInterface.OnClickListener() {
            @Override


            public void onClick(DialogInterface dialog, int which) {
                tv_alert.setText("让我再陪你三百六十五个日夜");
            }

        });
        AlertDialog alert = builder.create();
        alert.show();

    }


}
