package com.lee.webviewprocess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lee.common.autoservice.SingleWebViewService
import com.lee.common.utils.WebServiceLoader
import com.lee.webviewprocess.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val loaderService = WebServiceLoader.load(SingleWebViewService::class.java)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnStart.setOnClickListener {
            loaderService?.startWebViewActivity(this, "https://www.baidu.com")
        }
    }

}