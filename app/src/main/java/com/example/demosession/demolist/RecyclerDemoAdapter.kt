package com.example.demosession.demolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demosession.DemoUser
import com.example.demosession.R

class RecyclerDemoAdapter: RecyclerView.Adapter<RecyclerDemoAdapter.RecyclerViewHolder>() {

    var dataList = arrayListOf<DemoUser>()

    inner class RecyclerViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val demoNameTv = view.findViewById<TextView>(R.id.demoNameTv)
        val demoNumberTv = view.findViewById<TextView>(R.id.demoContactTV)
        fun bindData() {
            dataList[adapterPosition].run {
                demoNameTv.text = name
                demoNumberTv.text = userId
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {

        return RecyclerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_demo, parent, false)
        )
    }

    override fun getItemCount() = dataList.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bindData()
    }
}