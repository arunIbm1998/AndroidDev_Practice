package com.example.cosmo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.button.MaterialButton

class FirstFragment : Fragment() {
    private
    lateinit var btnSecond: MaterialButton
    lateinit var btnThird: MaterialButton


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View=inflater.inflate(R.layout.fragment_first,container,false)

        btnSecond=view.findViewById(R.id.second)
        btnThird=view.findViewById(R.id.third)

        btnSecond.setOnClickListener{
            val fragment= SecondFragment()
            val transaction=fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer,fragment)?.commit()
        }


        btnThird.setOnClickListener{
            val fragment= ThirdFragment()
            val transaction=fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer,fragment)?.commit()
        }
        return view;

    }


}