package com.commandiron.materialcalculatorcicd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.commandiron.materialcalculatorcicd.ui.theme.MaterialCalculatorCICDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialCalculatorCICDTheme {

            }
        }
    }
}