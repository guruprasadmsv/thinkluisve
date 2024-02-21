package com.example.demosession

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class DemoListAdapter(var demoList: ArrayList<DemoUser>):BaseAdapter() {

    override fun getCount(): Int {
        return demoList.size
    }

    override fun getItem(position: Int): DemoUser {
        return demoList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflater = LayoutInflater.from(parent!!.context)
        val viewHolder:ViewHolder
        val view =  if (convertView == null) {
            val tempView = layoutInflater.inflate(R.layout.item_demo_list, parent, false)
            viewHolder = ViewHolder(tempView)
            tempView.tag = viewHolder
            tempView
        } else {
            viewHolder = convertView.tag as ViewHolder
            convertView
        }
        viewHolder.bindData(demoList[position])
        return view
    }

    class ViewHolder(val view: View) {
        val tvName = view.findViewById<TextView>(R.id.tvName)
        val tvUserId = view.findViewById<TextView>(R.id.tvUserId)
        fun bindData(demo: DemoUser) {
            tvName.text = demo.name
            tvUserId.text = demo.userId
        }
    }

}