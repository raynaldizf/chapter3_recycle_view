package com.example.chapter3_recycle_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class StudentADapterDifUtilActivity() : RecyclerView.Adapter<StudentADapterDifUtilActivity.ViewHolder>(){


    private var diffCallback = object  : DiffUtil.ItemCallback<ListStudent>(){
        override fun areItemsTheSame(oldItem: ListStudent, newItem: ListStudent): Boolean {
            return oldItem.nim == newItem.nim
        }
        override fun areContentsTheSame(oldItem: ListStudent, newItem: ListStudent): Boolean {
          return oldItem.hashCode() == newItem.hashCode()
        }

    }

    var differ = AsyncListDiffer(this,diffCallback)

    fun submitData(value : ArrayList<ListStudent>){
        differ.submitList(value)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var nama = itemView.findViewById<TextView>(R.id.studentName)
        var nim = itemView.findViewById<TextView>(R.id.studentNim)
        var image = itemView.findViewById<ImageView>(R.id.studentImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentADapterDifUtilActivity.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = differ.currentList[position]
        holder.nama.text = data.nama
        holder.nim.text = data.nim
        holder.image.setImageResource(data.image)

    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}