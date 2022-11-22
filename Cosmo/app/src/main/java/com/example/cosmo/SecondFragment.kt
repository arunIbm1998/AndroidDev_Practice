package com.example.cosmo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.button.MaterialButton


class SecondFragment : Fragment() {
    private
    lateinit var btnFirst: MaterialButton
    lateinit var btnThird: MaterialButton


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View=inflater.inflate(R.layout.fragment_second,container,false)

        btnFirst=view.findViewById(R.id.first)
        btnThird=view.findViewById(R.id.third)

        btnFirst.setOnClickListener{
            val fragment= FirstFragment()
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