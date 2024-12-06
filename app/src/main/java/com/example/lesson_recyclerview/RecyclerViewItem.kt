package com.example.lesson_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Класс адаптера для RecyclerView
class RecyclerViewItem(private val names: List<String>) :
    RecyclerView.Adapter<RecyclerViewItem.MyViewHolder>() {

    // Внутренний класс ViewHolder, который будет содержать ссылки на элементы UI для каждого элемента RecyclerView
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val largeTextView: TextView = itemView.findViewById(R.id.textViewLarge)
        val smallTextView: TextView = itemView.findViewById(R.id.textViewSmall)
    }

    // Метод для создания нового ViewHolder, который будет содержать представление для одного элемента RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Создание xml разметки списка
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_view_item, parent, false)
        return MyViewHolder(itemView)
    }

    // Связывание данных с элементами в ViewHolder
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.largeTextView.text = names[position]
        holder.smallTextView.text = "Some text"
    }

    // Возврат общего количества элементов списка
    override fun getItemCount(): Int {
        return names.size
    }
}