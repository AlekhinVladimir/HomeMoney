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
// Инициализация обработчиков нажатий на кнопки
        initListeners()
    }
    /**
     * Инициализирует обработчики нажатий на кнопки меню.
     * При нажатии на кнопку вызывается соответствующий метод в ViewModel.
     */
    private fun initListeners() {
        // Обработчик нажатия на кнопку "Экран затрат"
        findViewById<Button>(R.id.btn_to_expense_screen).setOnClickListener {
            viewModel.onExpenseScreenClicked()
        }
        // Обработчик нажатия на кнопку "Экран истории"
        findViewById<Button>(R.id.btn_to_history_screen).setOnClickListener {
            viewModel.onHistoryScreenClicked()
        }
        // Обработчик нажатия на кнопку "Экран аналитики"
        findViewById<Button>(R.id.btn_to_analytics_screen).setOnClickListener {
            viewModel.onAnalyticsScreenClicked()
        }
        // Обработчик нажатия на кнопку "Выход"
        findViewById<Button>(R.id.btn_exit).setOnClickListener {
            viewModel.onExitClicked()
        }
    }
}