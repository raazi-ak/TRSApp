package com.raazi.trs.di

import com.raazi.trs.data.remote.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    @Provides
    @Singleton
    fun apiProvider(): ApiService {
        return Retrofit.Builder()
            .baseUrl("http://192.168.10.103:5000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create((ApiService::class.java))
    }
}