package com.interview.kmvvm.authentication


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ViewUtils
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.interview.kmvvm.R
import com.interview.kmvvm.authentication.authenticationListener
import com.interview.kmvvm.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() , authenticationListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel
        viewModel.authListener = this
    }

    override fun onStarted() {
        Toast.makeText(this,"Login onStarted",Toast.LENGTH_LONG).show()
    }

    override fun onSuccess() {
        Toast.makeText(this,"Login onSuccess",Toast.LENGTH_LONG).show()
    }

    override fun onFailure(message: String) {
        Toast.makeText(this,"Login onFailure",Toast.LENGTH_LONG).show()
    }
}