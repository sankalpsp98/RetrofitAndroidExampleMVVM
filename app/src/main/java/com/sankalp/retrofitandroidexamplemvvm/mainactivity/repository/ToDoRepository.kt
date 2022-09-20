package com.sankalp.retrofitandroidexamplemvvm.mainactivity.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sankalp.retrofitandroidexamplemvvm.mainactivity.models.ToDos
import com.sankalp.retrofitandroidexamplemvvm.mainactivity.network.ApiService

class ToDoRepository(private var apiService: ApiService) {

    private val todoLiveData =MutableLiveData<ToDos>()

    val list:LiveData<ToDos>
        get() = todoLiveData

    suspend fun  getToDos(){
        val result = apiService.getToDoList()
        if (result.body()!=null)
        {
            todoLiveData.postValue(result.body())
        }
    }
}