package com.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.safframework.log.L

class MainActivity : AppCompatActivity() {
    var a: Int = 12
    var b: Char = 's'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        L.init("xiaoqiang")
        initView()
        ArrayAndLIst()


    }

    private fun ArrayAndLIst() {

        var mutablelist: MutableList<String> = mutableListOf("s", "ss")
        var list2: List<String> = listOf("aa", "bb")
        mutablelist.add("sd")
        mutablelist.add("aa")


        mutablelist.forEach { L.i(it) }
    }

    private fun initView() {

    }


}
