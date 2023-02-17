package com.example.noteappwithtdah.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.noteappwithtdah.LoginActivity
import com.example.noteappwithtdah.R
import com.example.noteappwithtdah.databinding.Fragment3Binding
import com.example.noteappwithtdah.utils.viewBinding

class Fragment3 : Fragment(R.layout.fragment3) {

    private val binding by viewBinding(Fragment3Binding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btn3.setOnClickListener {
            activity?.finish()
            startActivity(Intent(activity, LoginActivity::class.java))
        }

    }
}