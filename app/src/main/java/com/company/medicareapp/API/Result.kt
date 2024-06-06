package com.company.medicareapp.API

sealed class State(var name: String) {

    object DEFAULT : State("default")
    object FAILED : State("failed")
    object SUCCESS : State("success")
    object LOADING : State("loading")
}