package com.xcool.coroexecutorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xcool.coroexecutorapp.databinding.ActivityMainBinding
import com.xcool.coroexecutorapp.samples.download.ActivityDownload
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
  
  private var _binding: ActivityMainBinding? = null
  private val binding get() = _binding!!
  
  @ExperimentalCoroutinesApi
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    // setContentView(R.layout.activity_main)
    _binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
    
    binding.btnSampleDownload.setOnClickListener {
      startActivity(Intent(this, ActivityDownload::class.java))
    }
  }
}