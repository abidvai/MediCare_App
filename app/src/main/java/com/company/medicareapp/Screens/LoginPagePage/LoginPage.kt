package com.company.medicareapp.Screens.LoginPagePage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.medicareapp.R
import com.company.medicareapp.ui.theme.bgcolor

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPage() {
    var userEmail by remember {
        mutableStateOf("")
    }
    var userPassword by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(bgcolor)
            .padding(top = 100.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.medicine), contentDescription = "App_Logo",
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Medicare Vendor store",
            fontSize = 25.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(80.dp))

        Column(modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
                )
        {
            OutlinedTextField(value = userEmail, onValueChange = {
                userEmail = it
            },
                label = {
                    Text(text = "Email")
                },
                leadingIcon = {
                    Icon(imageVector =  Icons.Filled.Email, contentDescription = "Email")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))

            OutlinedTextField(
                value = userPassword,
                onValueChange = {
                    userPassword = it
                },
                label = {
                    Text(text = "Password")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Lock, contentDescription = "Password")
                },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    containerColor = Color.LightGray
                ),
                elevation = ButtonDefaults.elevatedButtonElevation(10.dp)
            ) {
                Text(text = "Login")
            }

            Row(modifier = Modifier.padding(top = 40.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Don't have an account?",
                    Modifier.padding(end = 10.dp))
                Text(text = "Sign Up",
                    color = Color.Blue,
                    textDecoration = TextDecoration.Underline,
                    fontWeight = FontWeight.Bold
                    )
            }


        }
    }
}