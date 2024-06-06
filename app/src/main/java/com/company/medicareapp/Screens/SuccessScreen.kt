package com.company.medicareapp.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.company.medicareapp.Navigation.Routes
import com.company.medicareapp.R
import com.company.medicareapp.ui.theme.CloudyGrayFont
import com.company.medicareapp.ui.theme.RainyBlueBackground


@Composable
fun SuccessScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(RainyBlueBackground),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Successfully Created Your Account", style = TextStyle(
            color = CloudyGrayFont,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        ))
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = R.drawable.failed),
            contentDescription = "Success",
            modifier = Modifier.size(128.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(onClick = {
            navController.navigate(Routes.Home.name)
        },
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Green,
                containerColor = CloudyGrayFont
            ),
            border = BorderStroke(1.dp, Color.Black)
            ) {
            Text(text = "Home ->")
        }

    }

}

