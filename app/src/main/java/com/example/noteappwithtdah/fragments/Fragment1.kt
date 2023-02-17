package com.example.noteappwithtdah.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.example.noteappwithtdah.LoginActivity
import com.example.noteappwithtdah.R
import com.example.noteappwithtdah.databinding.Fragment1Binding
import com.example.noteappwithtdah.utils.viewBinding

class Fragment1 : Fragment(R.layout.fragment1) {


    private val binding by viewBinding(Fragment1Binding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btn1.setOnClickListener {
            //findNavController(R.id.nav_host_fragment).navigate(R.id.action_fragment1_to_fragment2)

            findNavController(this@Fragment1).navigate(R.id.action_fragment1_to_fragment2)

        }

        binding.btnOmitir1.setOnClickListener {
            activity?.finish()
            startActivity(Intent(activity, LoginActivity::class.java))
        }



    }
}