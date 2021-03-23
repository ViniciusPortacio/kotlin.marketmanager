package com.example.orgmarket.framework.authentication

import android.text.Editable

class idGenerator(username: String) {

    fun idGenerator(username: String) : Int{
        val hash = username.hashCode()
        return hash
    }
}