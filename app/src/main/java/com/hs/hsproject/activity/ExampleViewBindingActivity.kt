package com.hs.hsproject.activity

import com.hs.hsproject.base.BaseViewBindingActivity
import com.hs.hsproject.databinding.ActivityExampleBinding

class ExampleViewBindingActivity : BaseViewBindingActivity<ActivityExampleBinding>(){

    override fun getViewBinding(): ActivityExampleBinding = ActivityExampleBinding.inflate(layoutInflater)


}