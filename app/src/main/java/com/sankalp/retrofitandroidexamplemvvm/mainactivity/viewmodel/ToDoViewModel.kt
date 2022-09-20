package com.sankalp.retrofitandroidexamplemvvm.mainactivity.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sankalp.retrofitandroidexamplemvvm.mainactivity.models.ToDos
import com.sankalp.retrofitandroidexamplemvvm.mainactivity.repository.ToDoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ToDoViewModel(private var repository: ToDoRepository): ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getToDos()
        }
    }

    val ToDos:LiveData<ToDos>
        get() = repository.list

}