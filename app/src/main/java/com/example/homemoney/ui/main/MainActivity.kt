package com.example.homemoney.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.homemoney.ui.menu.MenuActivity
import com.example.homemoney.databinding.ActivityMainBinding
import com.example.homemoney.ui.NavigationHandler

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    private val navigationHandler: NavigationHandler by lazy {
        NavigationHandler(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
        observeViewModel()
    }

    private fun setupUI() {
        binding.btnStart.setOnClickListener {
            viewModel.onStartButtonClicked()
        }
    }

    private fun observeViewModel() {
        viewModel.navigateToMenuScreenEvent.observe(this, Observer {
            if (it) {
                navigationHandler.navigateToMenuScreen()
                viewModel.doneNavigatingToMenuScreen()
            }
        })
    }
}