package com.kotlintest

import android.graphics.Color
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.RelativeLayout
import com.kotlintest.R.id.*
import com.safframework.log.L
import kotlinx.android.synthetic.main.activity.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import java.text.SimpleDateFormat
import java.util.*

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

//        Canshu() //可變參數
//        var myan = Animal(this, "class", 0)
//        addNewView(RelativeLayout.ABOVE, R.id.tv_origin)//动态使用relativeLayout
//        Dialog()
//        spinnertest()

//        loadProgress()// 进度条dialog


    }

    private fun loadProgress() {
//        val dialog = indeterminateProgressDialog("正在努力加载页面", "请稍候")
//        dialog.setCanceledOnTouchOutside(false)
//        dialog.show()

        val dialog = progressDialog("正在努力加载页面", "请稍候")
        dialog.max=120
        dialog.progress = 80
        dialog.show()
    }

    private fun spinnertest() {
        val satellites = listOf("水星", "金星", "地球", "火星", "木星", "土星")
        tv_spinner.text = satellites[0]
        tv_spinner.setOnClickListener {
            selector("请选择行星", satellites) { dialog,i ->
                tv_spinner.text = satellites[i]
                toast("你选择的行星是${tv_spinner.text}")
            }
        }
    }
        fun Dialog() {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("尊敬的用户")
            builder.setMessage("你真的要卸载我吗？")
            builder.setPositiveButton("残忍卸载") { dialog, which -> tv_origin.text = "虽然依依不舍，还是只能离开了" }
            builder.setNegativeButton("我再想想") { dialog, which -> tv_origin.text = "让我再陪你三百六十五个日夜" }
            val alert = builder.create()
            alert.show()

            alert("dd", "sdsd") {
                positiveButton("asfa") { tv_origin.text = "虽然依依不舍，还是只能离开了" }
                negativeButton("asf") { tv_origin.text = "虽然依依不舍，asf" }
            }

        }

        private fun Canshu() {

            btn_char.setOnClickListener {

                val fourBug = FourBug("奧指數", "dfas", "asaf", "sdfsd")
                L.i(fourBug)
            }

        }

        fun FourBug(first: String = "bala", vararg other: String?): String {

            var answer = "四大发明${first},"

            for ((i, v) in other.withIndex()) {
                answer = if (i == 2) "${answer} ${v}." else "${answer}  ${v},"
            }
            return answer


        }

        //根据参照物与方位类型添加下级视图
        private fun addNewView(align: Int, referId: Int) {
            var v = View(this)
            v.setBackgroundColor(Color.GREEN)
            val rl_params = RelativeLayout.LayoutParams(100, 100)
            rl_params.addRule(align, referId)
            v.layoutParams = rl_params
            v.setOnLongClickListener { v -> content.removeView(v); true }
            content.addView(v)
        }

        //Kotlin允许定义全局函数，即函数可在类外面单独定义，然后其他类也能直接调用
        fun <T> appendString(tag: String, vararg otherInfo: T?): String {
            var str: String = "$tag："
            for (item in otherInfo) {
                str = "$str${item.toString()}，"
            }
            return str
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
            val findFixPoint = findFixPoint()
            L.i("${findFixPoint}...${Date().getNowDateTime()}")

        }

        tailrec fun findFixPoint(x: Double = 1.0): Double = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

        fun Date.getNowDateTime(): String {
            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            return sdf.format(this)
        }

    }
