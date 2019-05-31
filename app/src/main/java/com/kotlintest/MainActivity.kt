package com.kotlintest

import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import com.kotlintest.R.id.*
import com.safframework.log.L
import kotlinx.android.synthetic.main.activity.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    var a: Int = 12
    var b: Char = 's'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        L.init("xiaoqiang")
        initView()
//        ArrayAndLIst()//list 容器的遍历
//        ifElse()//条件分之
//        whenElse()//when-else

//        checkNull() //判断是否为null


//        forXunHuan()//循環

        Canshu()


    }

    private fun Canshu() {

        btn_char.setOnClickListener {

            val fourBug = FourBug("奧指數")
            L.i(fourBug)
        }

    }

    fun FourBug(first: String, vararg other: String?): String {

        var answer = "四大发明${first},"

        for ((i, v) in other.withIndex()) {
            answer = if (i == 2) "${answer} ${v}." else "${answer}  ${v},"
        }
        return answer


    }

    private fun checkNull() {

        var strB: String? = "asf"
        var length: Int?

        btn_boolean.setOnClickListener {
            strB

            length = if (strB.isNullOrBlank()) -1 else strB?.length
            length = strB?.length ?: -1

            tv_origin.text = "使用?:得到字符串B的长度为$length"
        }

    }

    private fun forXunHuan() {

        val poemArray: Array<String?> = arrayOf("朝辞白帝彩云间", "千里江陵一日还", "两岸猿声啼不住", "轻舟已过万重山")

        btn_double.setOnClickListener {
            var poem: String = ""
//            for (i in poemArray.indices) {
//                if (i%2 == 0) {
//                    poem = "$poem${poemArray[i]}，\n"
//                } else {
//                    poem = "$poem${poemArray[i]}。\n"
//                }
//            }
            for ((i, v) in poemArray.withIndex()) {

                if (i % 2 == 0) {
                    poem = "$poem${v}，\n"
                } else {
                    poem = "$poem${v}。\n"
                }

            }
            tv_origin.text = poem
        }

    }

    private fun whenElse() {
        var countType: Number;
        var count = 3
        btn_float.setOnClickListener {
            count = (count + 1) % 3
            countType = when (count) {
                0 -> count.toLong();
                1 -> count.toDouble()
                else -> count.toFloat()
            }
            tv_origin.text = when (countType) {
                is Long -> "此恨绵绵无绝期"
                is Double -> "树上的鸟儿成双对"
                else -> "门泊东吴万里船"
            }
        }
    }

    private fun ifElse() {
        var is_odd: Boolean = true;
        tv_origin.text = "凉风有信，秋月无边。打二字"
        btn_int.setOnClickListener {
            tv_origin.text = if (is_odd == true) {
                "凉风有信的谜底是“讽”"
            } else {
                "秋月无边的谜底是“二”"
            }
            is_odd = !is_odd
        }
    }


    private fun ArrayAndLIst() {
        var map = mutableMapOf<String, String>(Pair("aa", "aaa"), Pair("bb", "bbb"))
        map.put("cc", "ccc")
        val iterator = map.iterator()
        while (iterator.hasNext()) {
            val next = iterator.next()
            L.i("${next.key}...${next.value}")
        }

    }

    private fun initView() {

        tv_origin.setOnClickListener { startActivity<javaMain>() }

    }


}
