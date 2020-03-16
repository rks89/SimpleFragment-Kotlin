package com.nfinfratech.simplefragment_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nfinfratech.simplefragment_kotlin.fragmentsss.FirstFragments
import com.nfinfratech.simplefragment_kotlin.fragmentsss.SecondFragments


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val newFragment = FirstFragments()
        // create a FragmentManager
        /*val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.layout, newFragment);
        fragmentTransaction.commit()*/


        val secondFragments=SecondFragments()

        val fragmentManager2=supportFragmentManager
        val tranFragments=fragmentManager2.beginTransaction()
        tranFragments.replace(R.id.layout,secondFragments)
        tranFragments.commit()
    }
}
