package com.example.demosession

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DemoListRecyclerAdapter: RecyclerView.Adapter<DemoListRecyclerAdapter.DemoViewHolder>() {

    var demoDataList = arrayListOf<DemoUser>()

    inner class DemoViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val nameTv = view.findViewById<TextView>(R.id.tvName)
        val userTv = view.findViewById<TextView>(R.id.tvUserId)
        fun bindData() {
            demoDataList.get(adapterPosition).let {
                nameTv.text = it.name
                userTv.text = it.userId
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DemoViewHolder {
        return DemoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_demo_list, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return demoDataList.size
    }

    override fun onBindViewHolder(holder: DemoViewHolder, position: Int) {
        holder.bindData()
    }
}