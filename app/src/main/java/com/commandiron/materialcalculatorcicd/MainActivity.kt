package com.commandiron.materialcalculatorcicd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.commandiron.materialcalculatorcicd.presentation.CalculatorScreen
import com.commandiron.materialcalculatorcicd.ui.theme.MaterialCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Constants.BASE_URL
        setContent {
            MaterialCalculatorTheme {
                CalculatorScreen()
            }
        }
    }
}