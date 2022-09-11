package com.example.ugdnyakawan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ugdnyakawan.entity.ListMinuman

class FragmentMinuman : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_minuman, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        val adapter : RVMinumanAdapter = RVMinumanAdapter(ListMinuman.listOfMinuman)

        val rvMahasiswa : RecyclerView = view.findViewById(R.id.rv_minuman)

        rvMahasiswa.layoutManager = layoutManager

        rvMahasiswa.setHasFixedSize(true)
        rvMahasiswa.adapter = adapter
    }
}