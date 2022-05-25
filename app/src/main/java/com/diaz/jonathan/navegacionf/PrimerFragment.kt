package com.diaz.jonathan.navegacionf

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class PrimerFragment : Fragment() {
    lateinit var btnA: Button
    lateinit var btnD: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val vistaA= inflater.inflate(R.layout.fragment_primer, container, false)
        btnA = vistaA.findViewById(R.id.btn_A)
        btnA.setOnClickListener {
            findNavController().navigate(R.id.action_primerFragment_to_segundoFragment)
        }

        btnD = vistaA.findViewById(R.id.btn_D)
        btnD.setOnClickListener {
            findNavController().navigate(R.id.action_primerFragment_to_tercerFragment)
        }
        return vistaA
    }
}