package com.company.medicareapp.Screens.SignUpPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.medicareapp.ui.theme.bgcolor

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpPage() {
    var userName by rememberSaveable { mutableStateOf("") }
    var userEmail by rememberSaveable { mutableStateOf("") }
    var userPhoneNo by rememberSaveable { mutableStateOf("") }
    var userAddress by rememberSaveable { mutableStateOf("") }
    var userPincode by rememberSaveable { mutableStateOf("") }
    var userPassword by rememberSaveable { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .background(bgcolor)
        .padding(top = 40.dp))
    {
        Image(painter = painterResource(id = com.company.medicareapp.R.drawable.medicine), contentDescription = "",
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.CenterHorizontally)
                .padding(vertical = 10.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Medicare Vendor store",
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Monospace,
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = userName,
            onValueChange = {
                userName = it
        },
            label = {
                Text(text = "Name")
            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "")
            },
            singleLine = true
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = "", onValueChange = {

        },
            label = {
                Text(text = "Email")
            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "")
            },
            singleLine = true
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = "", onValueChange = {

        },
            label = {
                Text(text = "Phone No.")
            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Call, contentDescription = "")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = "", onValueChange = {

        },
            label = {
                Text(text = "Address")
            },
            minLines = 1,
            maxLines = 2,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.LocationOn, contentDescription = "")
            }
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = "", onValueChange = {

        },
            label = {
                Text(text = "Pin Code")
            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Star, contentDescription = "")
            },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = "", onValueChange = {

        },
            label = {
                Text(text = "Password")
            },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Lock, contentDescription = "")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password))

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp),
            elevation = ButtonDefaults.elevatedButtonElevation(5.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 40.dp)
        ){
            Text(text = "Sign Up")
        }

        Row {
            Text(text = "Already Hava an account?",
                modifier = Modifier.padding(top = 30.dp, start = 70.dp))

            Text(text = "Login",
                modifier = Modifier
                    .padding(top = 30.dp, start = 10.dp)
                    .clickable { },
                color = Color.Blue,
                fontWeight = FontWeight.Bold
            )
        }
    }
}