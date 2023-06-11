package com.hs.hsproject.kotlin

/**
 * kotlin 语法学习记录
 */
class KotlinGrammarRecord {

    private fun let() {

    }

    private fun apply() {

    }

    /**
     * for循环的两种写法
     * 1. 两边闭环的循环
     * 2. 左闭环的循环
     * 3. step 相当于i++
     * 4. downTo 相当于i-
     */
    private fun ktFor() {
        for (i in 0..10) {
        }
        for (i in 0 until 10) {
        }
        for (i in 0..10 step 1) {
        }
        for (i in 10 downTo 1) {
        }
    }


}