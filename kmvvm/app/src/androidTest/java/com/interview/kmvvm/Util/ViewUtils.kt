package com.interview.kmvvm.Util

import android.content.Context
import android.widget.Toast

public fun Context.toast(message:String)
{
    Toast.makeText(this,message,Toast.LENGTH_LONG).show()
}
