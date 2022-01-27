package com.lee.singlewebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.lee.singlewebview.databinding.ActivitySingleWebViewBinding

const val URL = "url"

class SingleWebViewActivity : AppCompatActivity() {
    private lateinit var bing: ActivitySingleWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bing = ActivitySingleWebViewBinding.inflate(layoutInflater)
        setContentView(bing.root)
        val stringExtra = intent.getStringExtra(URL)
        Log.d("TAG001", "onCreate: $stringExtra")
        bing.webActivity.settings.javaScriptEnabled = true
        bing.webActivity.loadUrl(stringExtra ?: "https://www.baidu.com")
    }
}