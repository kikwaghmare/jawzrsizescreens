package com.example.jawzrsizescreens.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.jawzrsizescreens.R

class RegisterFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_register, container, false)
//        val txtRedirect = view.findViewById<TextView>(R.id.txtRedirect)
//        txtRedirect.setOnClickListener{
//            findNavController().navigate(R.id.action_registerFragment_to_loginFragment3)
//        }

        return view
    }

    companion object {

    }
}