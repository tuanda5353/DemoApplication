package com.tuanda.demoapplication.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.tuanda.demoapplication.R
import com.tuanda.demoapplication.data.model.Result
import com.tuanda.demoapplication.databinding.ActivityMainBinding
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel.result.observe(this, Observer {
            when (it) {
                is Result.Success -> {
                    binding.include.weatherResponse = it.data
                    binding.loading = false
                }
                is Result.Error -> {
                    binding.error = it.exception
                    binding.loading = false
                }
                is Result.Loading -> binding.loading = true
            }
        })
    }
}
