package com.example.noteappwithtdah.ui.Fragment

import android.os.Bundle
import android.text.format.DateFormat
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.noteappwithtdah.R
import com.example.noteappwithtdah.databinding.FragmentCreateNotesBinding

import java.util.Date

class CreateNotesFragment : Fragment() {

    lateinit var binding:FragmentCreateNotesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentCreateNotesBinding.inflate(layoutInflater, container, false)

        binding.pGreen.setOnClickListener{
            binding.pGreen.setImageResource(R.drawable.baseline_add_24)
        }
        binding.pYellow.setOnClickListener{
            binding.pYellow.setImageResource(R.drawable.baseline_add_24)
        }
        binding.pRed.setOnClickListener{
            binding.pRed.setImageResource(R.drawable.baseline_add_24)
        }

        binding.btnSavedNotes.setOnClickListener{
            createNotes(it)
        }

        return binding.root
    }

    private fun createNotes(it: View?) {
        val title=binding.edTittle.text
        val subTitle=binding.edSubTittle.text
        val notes=binding.edNotes.text
        val d = Date()
        val notesDate: CharSequence = DateFormat.format("MMMM d, yyyy ", d.time)
    }

}