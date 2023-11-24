package com.example.jawzrsizescreens.models

import android.provider.ContactsContract.CommonDataKinds.Email

data class User(
    val __val :Int,
    val _id: String,
    val createdAt: String,
    val email: String,
    val updateAt: String,
    val username: String
)