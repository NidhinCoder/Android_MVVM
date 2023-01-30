package com.interview.kmvvm.authentication

interface authenticationListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message:String)

}