package com.company.medicareapp.Navigation

import kotlinx.serialization.Serializable

sealed class Routes(val name: String) {
    @Serializable
    object Home : Routes("home")
    @Serializable
    object SignUp : Routes("signup")

    @Serializable
    object Login : Routes("login")

    @Serializable
    object Success : Routes("success")

    @Serializable
    object Failed : Routes("failed")


}