package com.lee.singlewebview

import android.content.Context
import android.content.Intent
import com.google.auto.service.AutoService
import com.lee.common.autoservice.SingleWebViewService

@AutoService(SingleWebViewService::class)
class SingleWebViewServiceImpl : SingleWebViewService {
    override fun startWebViewActivity(context: Context, url: String) {
        val intent = Intent(context,SingleWebViewActivity::class.java)
        intent.putExtra(URL,url)
        context.startActivity(intent)
    }
}