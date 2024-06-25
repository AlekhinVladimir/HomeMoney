package com.example.homemoney.ui.menu

import androidx.lifecycle.ViewModel
import com.example.homemoney.ui.NavigationHandler
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MenuViewModel @Inject constructor(private val navigationHandler: NavigationHandler) : ViewModel() {

    fun onExpenseScreenClicked() {
        navigationHandler.navigateToExpenseScreen()
    }

    fun onHistoryScreenClicked() {
        navigationHandler.navigateToHistoryScreen()
    }

    fun onAnalyticsScreenClicked() {
        navigationHandler.navigateToAnalyticsScreen()
    }

    fun onExitClicked() {
        navigationHandler.exitApp()
    }
}