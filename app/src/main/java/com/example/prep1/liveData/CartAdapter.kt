package com.example.prep1.liveData

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prep1.R

class CartAdapter(var activity:Activity, var list: List<ItemResult>) : RecyclerView.Adapter<CartAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var inflater=LayoutInflater.from(parent.context)
        var view=inflater.inflate(R.layout.singlemovie,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    }

     fun setItems(list: List<ItemResult>) {
        this.list = list
        notifyDataSetChanged()
    }
}