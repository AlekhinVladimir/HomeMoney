package com.example.homemoney.ui.menu

import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.homemoney.R
import com.example.homemoney.ui.NavigationHandler

class MenuActivity:AppCompatActivity() {
    private val viewModel: MenuViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        initListeners()
    }
    private fun initListeners() {
        // Настройка обработчиков нажатий на кнопки
        findViewById<Button>(R.id.btn_to_expense_screen).setOnClickListener {
            viewModel.onExpenseScreenClicked()
        }
        findViewById<Button>(R.id.btn_to_history_screen).setOnClickListener {
            viewModel.onHistoryScreenClicked()
        }
        findViewById<Button>(R.id.btn_to_analytics_screen).setOnClickListener {
            viewModel.onAnalyticsScreenClicked()
        }
        findViewById<Button>(R.id.btn_exit).setOnClickListener {
            viewModel.onExitClicked()
        }
    }
}