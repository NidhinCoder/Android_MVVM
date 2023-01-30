package com.interview.kmvvm.authentication

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel:ViewModel() {

    var email:String? = null
    var password:String? = null
    var authListener:authenticationListener?=null

    fun onBtnLoginClick(view:View)
    {
        authListener?.onStarted()
        if(email.isNullOrEmpty() || password.isNullOrEmpty())
        {
            return
        }
        authListener?.onSuccess()
    }
}