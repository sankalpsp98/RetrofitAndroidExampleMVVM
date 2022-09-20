package com.sankalp.retrofitandroidexamplemvvm.mainactivity.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView
import com.sankalp.retrofitandroidexamplemvvm.R
import com.sankalp.retrofitandroidexamplemvvm.mainactivity.models.ToDos
import com.sankalp.retrofitandroidexamplemvvm.mainactivity.models.ToDosItem

class ToDoAdapter:RecyclerView.Adapter<ToDoAdapter.MyViewHolder>() {

   private var toDos : ToDos?= null
    fun SetToDosList(toDos: ToDos)
    {
        this.toDos = toDos
    }

    class MyViewHolder(view:View):RecyclerView.ViewHolder(view)
    {
        var title = view.findViewById<TextView>(R.id.textView)
        var status = view.findViewById<LottieAnimationView>(R.id.animation_view)

        fun bind(todo: ToDosItem)
        {
            title.text = todo.title
            if (todo.completed==true) status.setAnimation(R.raw.success) else status.setAnimation(R.raw.alert)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.todo_layout,parent,false)
        return  MyViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(toDos!!.get(position))
    }

    override fun getItemCount(): Int {
       return  if (toDos!=null) toDos!!.size else 0
    }
}