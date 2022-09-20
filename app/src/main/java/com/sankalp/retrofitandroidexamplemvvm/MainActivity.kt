package com.sankalp.retrofitandroidexamplemvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sankalp.retrofitandroidexamplemvvm.mainactivity.adapter.ToDoAdapter
import com.sankalp.retrofitandroidexamplemvvm.mainactivity.network.ApiService
import com.sankalp.retrofitandroidexamplemvvm.mainactivity.network.RetrofitIntance
import com.sankalp.retrofitandroidexamplemvvm.mainactivity.repository.ToDoRepository
import com.sankalp.retrofitandroidexamplemvvm.mainactivity.viewmodel.ToDoViewModel
import com.sankalp.retrofitandroidexamplemvvm.mainactivity.viewmodel.ToDoViewModelFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var toDoAdapter: ToDoAdapter
    lateinit var toDoViewModel: ToDoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)

        val apiService  = RetrofitIntance.getIntance().create(ApiService::class.java)
        val repository = ToDoRepository(apiService)

        toDoViewModel = ViewModelProvider(this, ToDoViewModelFactory(repository)).get(ToDoViewModel::class.java)

        recyclerView.apply {
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            DividerItemDecoration(applicationContext,RecyclerView.VERTICAL)
            toDoAdapter = ToDoAdapter()
            recyclerView.adapter = toDoAdapter
        }

        toDoViewModel.ToDos.observe(this, Observer {
            toDoAdapter.SetToDosList(it)
            toDoAdapter.notifyDataSetChanged()
        })
    }
}