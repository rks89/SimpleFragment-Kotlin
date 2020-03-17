package com.nfinfratech.simplefragment_kotlin.fragmentsss

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nfinfratech.simplefragment_kotlin.AnimalAdapter
import com.nfinfratech.simplefragment_kotlin.R


class SecondFragments : Fragment()
{
    private val animals: ArrayList<String> = ArrayList()

    private lateinit var mListRecyclerView: RecyclerView

    override fun onAttach(context: Context) {
        super.onAttach(context)

        println("Fragments onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("Fragments onCreate")

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?): View? {
        println("Fragments onCreateView")

        var view=inflater.inflate(R.layout.second_fragments,container,false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("Fragments onViewCreated")

        addAnimals()

        mListRecyclerView = view.findViewById(R.id.rv_animal_list);
        mListRecyclerView.layoutManager = LinearLayoutManager(activity)
        mListRecyclerView.itemAnimator = DefaultItemAnimator()
        mListRecyclerView.adapter = AnimalAdapter(animals)
    }
    override fun onStart() {
        super.onStart()
        println("Fragments onStart")

    }
    override fun onResume() {
        super.onResume()
        println("Fragments onResume")

    }
    override fun onPause() {
        super.onPause()
        println("Fragments onPause")

    }

    override fun onStop() {
        super.onStop()
        println("Fragments onStop")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("Fragments onDestroyView")

    }

    override fun onDestroy() {
        super.onDestroy()
        println("Fragments onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        println("Fragments onDetach")

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        println("Fragments onActivityCreated")

    }


    // Adds animals to the empty animals ArrayList
    fun addAnimals()
    {
        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
        animals.add("raccoon")
        animals.add("bird")
        animals.add("snake")
        animals.add("lizard")
        animals.add("hamster")
        animals.add("bear")
        animals.add("lion")
        animals.add("tiger")
        animals.add("horse")
        animals.add("frog")
        animals.add("fish")
        animals.add("shark")
        animals.add("turtle")
        animals.add("elephant")
        animals.add("cow")
        animals.add("beaver")
        animals.add("bison")
        animals.add("porcupine")
        animals.add("rat")
        animals.add("mouse")
        animals.add("goose")
        animals.add("deer")
        animals.add("fox")
        animals.add("moose")
        animals.add("buffalo")
        animals.add("monkey")
        animals.add("penguin")
        animals.add("parrot")
    }

}