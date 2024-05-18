package com.company.medicareapp.API

data class UserInfoItem(
    val Block: Int,
    val DateOfAccountCreation: String,
    val PinCode: String,
    val address: String,
    val approved: Int,
    val email: String,
    val id: Int,
    val level: Int,
    val name: String,
    val password: String,
    val phone: String,
    val user_id: String
)