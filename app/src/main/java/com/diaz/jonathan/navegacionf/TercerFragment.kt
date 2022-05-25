package com.diaz.jonathan.navegacionf

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class TercerFragment : Fragment() {
    lateinit var btnB: Button
    lateinit var btnC: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val vistaA= inflater.inflate(R.layout.fragment_tercer, container, false)

        btnB = vistaA.findViewById(R.id.btn_B)
        btnB.setOnClickListener {
            findNavController().navigate(R.id.action_tercerFragment_to_primerFragment)
        }

        btnC = vistaA.findViewById(R.id.btn_c)
        btnC.setOnClickListener {
            findNavController().navigate(R.id.action_tercerFragment_to_segundoFragment)
        }
        return vistaA
    }
}