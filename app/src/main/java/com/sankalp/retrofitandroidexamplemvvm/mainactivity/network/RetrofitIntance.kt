package com.sankalp.retrofitandroidexamplemvvm.mainactivity.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitIntance {

    val BASE = "https://jsonplaceholder.typicode.com/"

    fun getIntance(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}