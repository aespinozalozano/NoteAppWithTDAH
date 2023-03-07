package com.example.noteappwithtdah.ui.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.noteappwithtdah.R
import com.example.noteappwithtdah.databinding.FragmentEditNotesBinding

class EditNotesFragment : Fragment() {

    val notes by navArgs<EditNotesFragmentArgs>()
    lateinit var binding: FragmentEditNotesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding= FragmentEditNotesBinding.inflate(layoutInflater,container,false)

        binding.edTittle.setText(notes.data.title)
        binding.edSubTittle.setText(notes.data.subTitle)
        binding.edNotes.setText(notes.data.notes)

        return binding.root
    }

}