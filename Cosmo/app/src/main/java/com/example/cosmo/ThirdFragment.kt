package com.example.cosmo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.button.MaterialButton


class ThirdFragment : Fragment() {
    private
    lateinit var btnSecond: MaterialButton
    lateinit var btnFirst: MaterialButton


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View=inflater.inflate(R.layout.fragment_third,container,false)

        btnSecond=view.findViewById(R.id.second)
        btnFirst=view.findViewById(R.id.first)

        btnSecond.setOnClickListener{
            val fragment= SecondFragment()
            val transaction=fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer,fragment)?.commit()
        }


        btnFirst.setOnClickListener{
            val fragment= FirstFragment()
            val transaction=fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer,fragment)?.commit()
        }
        return view;

    }


}