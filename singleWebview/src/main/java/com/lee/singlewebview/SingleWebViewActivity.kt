package com.lee.singlewebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val URL = "url"
class SingleWebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_web_view)
        val stringExtra = intent.getStringExtra(URL)
        Log.d("TAG001", "onCreate: $stringExtra")
    }
}