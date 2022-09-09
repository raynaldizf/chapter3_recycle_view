package com.example.chapter3_recycle_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(private val studentList: ArrayList<ListStudent>) :
    RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val nama = itemView.findViewById<TextView>(R.id.studentName)!!
        val nim = itemView.findViewById<TextView>(R.id.studentNim)!!
        val image = itemView.findViewById<ImageView>(R.id.studentImage)!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_student,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nama.text = studentList[position].nama
        holder.nim.text = studentList[position].nim
        holder.image.setImageResource(studentList[position].image)

    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}