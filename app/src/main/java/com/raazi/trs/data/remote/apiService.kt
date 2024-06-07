package com.raazi.trs.data.remote

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface ApiService{

    suspend fun loginUser(): Response<LoginResponse>
}