package com.lee.common.autoservice

import android.content.Context

interface SingleWebViewService {
    fun startWebViewActivity(context: Context, url: String)
}