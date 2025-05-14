package com.example.kotlin_mvvm_ex2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_mvvm_ex2.ui.theme.Kotlin_mvvm_ex2Theme
import com.example.kotlin_mvvm_ex2.view.HomePage
import com.example.kotlin_mvvm_ex2.viewmodel.CounterViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val counterViewModel = ViewModelProvider(this)[CounterViewModel::class]

        setContent {
            Kotlin_mvvm_ex2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomePage(modifier = Modifier.padding(innerPadding), counterViewModel)
                }
            }
        }
    }
}
