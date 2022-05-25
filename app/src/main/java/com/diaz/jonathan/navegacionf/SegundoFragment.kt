package com.diaz.jonathan.navegacionf

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SegundoFragment : Fragment() {
    lateinit var btnB: Button
    lateinit var btnF: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val vistaB= inflater.inflate(R.layout.fragment_segundo, container, false)
        btnB = vistaB.findViewById(R.id.btn_B)
        btnB.setOnClickListener {
            findNavController().navigate(R.id.action_segundoFragment_to_primerFragment)
        }
        btnF = vistaB.findViewById(R.id.btn_F)
        btnF.setOnClickListener {
            findNavController().navigate(R.id.action_segundoFragment_to_tercerFragment)
        }

        return vistaB
    }
}