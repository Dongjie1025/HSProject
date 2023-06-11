package com.hs.hsproject.utils

import android.content.Context
import android.content.res.Configuration

open class WindowUtil {

    /**
     * 是否竖屏
     */
    fun isScreenOrientationPortrait(ctx : Context) : Boolean{
        return ctx.resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT
    }

    /**
     * 是否横屏
     */
    fun isScreenOrientationLandscape(ctx :Context):Boolean{
        return ctx.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE
    }
}