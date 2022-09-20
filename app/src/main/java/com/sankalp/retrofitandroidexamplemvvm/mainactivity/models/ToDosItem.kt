package com.sankalp.retrofitandroidexamplemvvm.mainactivity.models

data class ToDosItem(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)