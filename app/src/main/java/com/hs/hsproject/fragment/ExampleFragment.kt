package com.hs.hsproject.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.hs.hsproject.base.BaseFragment
import com.hs.hsproject.databinding.FragmentExampleBinding

/**
 * 范例类 继承base fragment使用
 */
class ExampleFragment : BaseFragment<FragmentExampleBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentExampleBinding = FragmentExampleBinding.inflate(layoutInflater)
}