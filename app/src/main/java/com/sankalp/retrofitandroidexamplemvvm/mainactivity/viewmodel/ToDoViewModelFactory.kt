package com.sankalp.retrofitandroidexamplemvvm.mainactivity.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sankalp.retrofitandroidexamplemvvm.mainactivity.repository.ToDoRepository

class ToDoViewModelFactory(private val repository: ToDoRepository):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ToDoViewModel(repository) as T
    }

}