package com.example.homemoney.ui.expense

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homemoney.databinding.ActivityExpenseBinding

class ExpenseActivity:AppCompatActivity() {
    private lateinit var binding: ActivityExpenseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityExpenseBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}