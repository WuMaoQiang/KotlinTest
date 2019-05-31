package com.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.startActivity

/**
 * author:  cc
 * TODO
 * date:   On  2019/5/29
 */
class ActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        init()
    }

    private fun init() {
        actwo.setOnClickListener {
            actwo.text = "点击了"
            longToast("w我打toast")
            startActivity<javaMain>()
        }
    }

}