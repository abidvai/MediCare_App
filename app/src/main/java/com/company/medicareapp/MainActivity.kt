package com.company.medicareapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.Scaffold
import com.company.medicareapp.Navigation.NavGraph
import com.company.medicareapp.Screens.LoginPagePage.LoginPageViewModel
import com.company.medicareapp.ui.theme.MediCareAppTheme


class MainActivity : ComponentActivity() {
  val viewModel : LoginPageViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MediCareAppTheme {
                Scaffold { innerpadding ->
                    NavGraph(viewModel)
                }
            }

        }
    }
}
