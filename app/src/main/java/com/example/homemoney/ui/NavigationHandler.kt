package com.example.homemoney.ui

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.example.homemoney.ui.analytics.AnalyticsActivity
import com.example.homemoney.ui.expense.ExpenseActivity
import com.example.homemoney.ui.history.HistoryActivity
import com.example.homemoney.ui.menu.MenuActivity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NavigationHandler @Inject constructor(private val context: Context) {

    fun navigateToExpenseScreen() {
        val intent = Intent(context, ExpenseActivity::class.java)
        context.startActivity(intent)
    }

    fun navigateToHistoryScreen() {
        val intent = Intent(context, HistoryActivity::class.java)
        context.startActivity(intent)
    }

    fun navigateToAnalyticsScreen() {
        val intent = Intent(context, AnalyticsActivity::class.java)
        context.startActivity(intent)
    }

    fun navigateToMenuScreen() {
        val intent = Intent(context, MenuActivity::class.java)
        context.startActivity(intent)
    }

    fun exitApp() {
        (context as Activity).finish()
    }
}