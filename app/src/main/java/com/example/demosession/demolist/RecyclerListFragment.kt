package com.example.demosession.demolist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.demosession.DemoUser
import com.example.demosession.R

class RecyclerListFragment: Fragment() {

    lateinit var demoViewModel: DemoViewModel
    lateinit var recyclerDemoAdapter: RecyclerDemoAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list_recyler, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        demoViewModel = ViewModelProvider(this)[DemoViewModel::class.java]
        recyclerDemoAdapter = RecyclerDemoAdapter()
        val recyclerView = view.findViewById<RecyclerView>(R.id.demoListView)
        recyclerView.adapter = recyclerDemoAdapter

        demoViewModel.userListLiveData.observe(viewLifecycleOwner) {
            recyclerDemoAdapter.dataList = it as ArrayList<DemoUser>
            recyclerDemoAdapter.notifyDataSetChanged()
        }

        demoViewModel.getUserDemoData()
    }
}