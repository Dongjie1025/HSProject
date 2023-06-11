package com.hs.hsproject.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseViewBindingActivity<VB :ViewBinding> : AppCompatActivity(){

    private lateinit var _binding: VB
    protected val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = getViewBinding()
        setContentView(binding.root)

        initData()
        initAction()
    }

    protected abstract fun getViewBinding() :VB
    open fun initData(){}
    open fun initAction(){}
}