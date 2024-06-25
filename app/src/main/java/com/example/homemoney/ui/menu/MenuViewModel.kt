package com.example.homemoney.ui.menu

import androidx.lifecycle.ViewModel
import com.example.homemoney.ui.NavigationHandler
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MenuViewModel @Inject constructor(private val navigationHandler: NavigationHandler) : ViewModel() {
    /**
     * Вызывает метод NavigationHandler для перехода на экран затрат.
     */
    fun onExpenseScreenClicked() {
        navigationHandler.navigateToExpenseScreen()
    }
    /**
     * Вызывает метод NavigationHandler для перехода на экран истории.
     */
    fun onHistoryScreenClicked() {
        navigationHandler.navigateToHistoryScreen()
    }
    /**
     * Вызывает метод NavigationHandler для перехода на экран аналитики.
     */
    fun onAnalyticsScreenClicked() {
        navigationHandler.navigateToAnalyticsScreen()
    }
    /**
     * Вызывает метод NavigationHandler для выхода из приложения.
     */
    fun onExitClicked() {
        navigationHandler.exitApp()
    }
}