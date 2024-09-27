package com.arun.composetemplate.repository.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

inline fun <reified T> RetrofitClient(baseUrl: String): T {
    val retrofitClient = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    return retrofitClient.create(T::class.java)
}
