package com.hs.hsproject.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding> : Fragment() {

    // 因为fragment生命周期与activity不同，可以超出其视图的生命周期，比如fragment隐藏的时候，不置空有可能引起内存泄露
    private var _binding : VB ?=null
    protected val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = getViewBinding(inflater,container)
        return binding.root
    }

    protected abstract fun getViewBinding(inflater: LayoutInflater,container: ViewGroup?) : VB

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}