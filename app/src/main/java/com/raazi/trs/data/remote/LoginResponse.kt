package com.raazi.trs.data.remote

data class LoginResponse(
    val access_token: String,
    val account_type: String,
    val message: String
)