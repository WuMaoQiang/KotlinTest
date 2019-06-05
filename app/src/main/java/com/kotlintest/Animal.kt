package com.kotlintest

import android.content.Context
import com.safframework.log.L.init
import org.jetbrains.anko.toast

/**
 * author:  cc
 * TODO
 * date:   On  2019/6/3
 */
class Animal constructor(contes: Context, name: String) {
    init {
        contes.toast(name)
    }

    constructor(contes: Context, name: String, sex: Int) : this(contes, name) {
        contes.toast("这只${name}是${sex}的")
    }


}

//类的主构造函数使用了默认参数
class AnimalDefault(var context: Context, var name: String, var sex: Int = 0) {

    init {
        context.toast("asd")
    }

    fun aaa() {
        context.toast("asd")
        name = "asdaf"
        sex = 123
    }

}