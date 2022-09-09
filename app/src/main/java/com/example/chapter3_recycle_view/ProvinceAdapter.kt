package com.example.chapter3_recycle_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProvinceAdapter(private val listCity: ArrayList<ProvinceItems>): RecyclerView.Adapter<ProvinceAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val provinceName = itemView.findViewById<TextView>(R.id.provinceName)
        val cityName = itemView.findViewById<TextView>(R.id.cityName)
        val image = itemView.findViewById<ImageView>(R.id.cityImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_city,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.provinceName.text = listCity[position].provinceName
        holder.cityName.text = listCity[position].cityName
        holder.image.setImageResource(listCity[position].image)
    }

    override fun getItemCount(): Int {
        return listCity.size
    }
}