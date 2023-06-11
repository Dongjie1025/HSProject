package com.hs.hsproject.activity

import com.hs.hsproject.base.BaseViewBindingActivity
import com.hs.hsproject.databinding.ActivityMainBinding

class MainViewBindingActivity : BaseViewBindingActivity<ActivityMainBinding>() {

    override fun getViewBinding(): ActivityMainBinding  = ActivityMainBinding.inflate(layoutInflater)

}