package com.company.medicareapp.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.company.medicareapp.Screens.FailedScreen
import com.company.medicareapp.Screens.HomePage.HomeScreen
import com.company.medicareapp.Screens.LoginPagePage.LoginPage
import com.company.medicareapp.Screens.SignUpPage.SignUpPage
import com.company.medicareapp.Screens.SignUpPage.SignUpPageViewModel
import com.company.medicareapp.Screens.SuccessScreen

@Composable
fun NavGraph(viewModel: SignUpPageViewModel) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Login.name){

        composable(Routes.Login.name){
            LoginPage(navController)
        }
        composable(Routes.SignUp.name){
            SignUpPage(navController, SignUpPageViewModel())
        }
        composable(Routes.Home.name){
            HomeScreen(navController)
        }
        composable(Routes.Success.name){
            SuccessScreen(navController)
        }
        composable(Routes.Failed.name){
            FailedScreen(navController)
        }
    }
}