package com.company.medicareapp.Screens.SignUpPage

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.company.medicareapp.API.RetrofitInstance
import com.company.medicareapp.API.State
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SignUpPageViewModel: ViewModel() {

    var state =
        mutableStateOf("")

    init {
        state.value = State.DEFAULT.name
    }

    @OptIn(DelicateCoroutinesApi::class)
    fun GetUsers(
        name: String,
        password: String,
        address: String,
        email: String,
        phone: String,
        pincode: String
    ) {
        state.value = State.LOADING.name
        GlobalScope.launch {
            val result = RetrofitInstance.api.createUser(name, password, address, email, phone, pincode)
            if(result.isSuccessful){
                if(result.body()?.success == 200){
                    state.value = State.SUCCESS.name
                }else{
                    state.value = State.FAILED.name
                }
            }
            else{
                state.value = State.FAILED.name
            }
        }
    }

}