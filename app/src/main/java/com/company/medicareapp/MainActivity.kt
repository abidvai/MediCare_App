package com.company.medicareapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.company.medicareapp.API.CreateUserRepoImpl
import com.company.medicareapp.API.RetrofitInstance
import com.company.medicareapp.Screens.LoginPagePage.LoginPage
import com.company.medicareapp.Screens.SignUpPage.SignUpPage
import com.company.medicareapp.ui.theme.MediCareAppTheme
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
   private  lateinit var createUserRepoImpl: CreateUserRepoImpl
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        createUserRepoImpl = CreateUserRepoImpl(RetrofitInstance.api)
        setContent {
            MediCareAppTheme {
                Scaffold { innerpadding ->
                        SignUpPage()

                }
                GlobalScope.launch {
                    Log.d("User_data","${RetrofitInstance.api.UserInfo()}")
                }
            }

        }
    }
}
