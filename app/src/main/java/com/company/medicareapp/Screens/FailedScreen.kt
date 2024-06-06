package com.company.medicareapp.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.company.medicareapp.Navigation.Routes
import com.company.medicareapp.ui.theme.Pink80
import com.company.medicareapp.ui.theme.RainyGrayFont


@Composable
fun FailedScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Pink80),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Something went wrong", style = TextStyle(
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        )
        Spacer(modifier = Modifier.height(16.dp))

        Icon(
            imageVector = Icons.Default.Refresh,
            contentDescription = null,
            modifier = Modifier.padding(end = 4.dp)
        )


        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(onClick = {
            navController.navigate(Routes.SignUp.name)
        },
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Blue,
                containerColor = Color.LightGray
            ),
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Text(text = "Try Again ->")
        }

    }
}