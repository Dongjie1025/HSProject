package com.hs.hsproject.widht

import android.graphics.Typeface
import android.widget.TextView

/**
 * kotlin 拓展函数类
 */
class ExtensionFunction {

    /**
     * 设置 TextView的字体加粗方式
     * true 中粗(比加粗细一点)
     * false 加粗
     */
    fun TextView.setBoldType(isFakeBold: Boolean) {
        if (isFakeBold) {
            paint.isFakeBoldText = true
        } else {
            typeface = Typeface.DEFAULT_BOLD
        }


    }
}