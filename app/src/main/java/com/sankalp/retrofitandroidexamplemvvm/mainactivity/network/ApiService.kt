package com.sankalp.retrofitandroidexamplemvvm.mainactivity.network

import com.sankalp.retrofitandroidexamplemvvm.mainactivity.models.ToDos
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("todos")
    suspend fun getToDoList():Response<ToDos>
}