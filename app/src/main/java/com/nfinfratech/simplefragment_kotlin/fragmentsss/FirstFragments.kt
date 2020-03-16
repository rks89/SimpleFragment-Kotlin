package com.nfinfratech.simplefragment_kotlin.fragmentsss

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.nfinfratech.simplefragment_kotlin.R

class FirstFragments : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View?
    {

        val view: View = inflater.inflate(R.layout.fragment, container, false)
        val activity = activity as Context
       //val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
       //recyclerView.layoutManager = GridLayoutManager(activity, 2)
       // recyclerView.adapter = DogListAdapter(activity)
        return view
    }
}