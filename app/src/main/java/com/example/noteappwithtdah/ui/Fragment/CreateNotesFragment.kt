package com.example.noteappwithtdah.ui.Fragment

import android.os.Bundle
import android.text.format.DateFormat
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.noteappwithtdah.Model.Notes
import com.example.noteappwithtdah.R
import com.example.noteappwithtdah.ViewModel.NotesViewModel
import com.example.noteappwithtdah.databinding.FragmentCreateNotesBinding

import java.util.Date

class CreateNotesFragment : Fragment() {

    lateinit var binding: FragmentCreateNotesBinding
    var priority: String = "1"
    private val viewModel: NotesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentCreateNotesBinding.inflate(layoutInflater, container, false)

        binding.pGreen.setImageResource(R.drawable.baseline_add_24)

        binding.pGreen.setOnClickListener{
            priority= "1"
            binding.pGreen.setImageResource(R.drawable.baseline_add_24)
            binding.pRed.setImageResource(0)
            binding.pYellow.setImageResource(0)
        }
        binding.pYellow.setOnClickListener{
            priority= "2"
            binding.pYellow.setImageResource(R.drawable.baseline_add_24)
            binding.pRed.setImageResource(0)
            binding.pGreen.setImageResource(0)
        }
        binding.pRed.setOnClickListener{
            priority= "3"
            binding.pRed.setImageResource(R.drawable.baseline_add_24)
            binding.pGreen.setImageResource(0)
            binding.pYellow.setImageResource(0)
        }

        binding.btnSavedNotes.setOnClickListener{
            createNotes(it)
        }

        return binding.root
    }

    private fun createNotes(it: View?) {
        val title=binding.edTittle.text.toString()
        val subTitle=binding.edSubTittle.text.toString()
        val notes=binding.edNotes.text.toString()
        val d = Date()
        val notesDate: CharSequence = DateFormat.format("MMMM d, yyyy ", d.time)

        val data = Notes(
            null,
            title = title,
            subTitle=subTitle,
            notes=notes,
            date = notesDate.toString(),
            priority
            )
        viewModel.addNotes(data)

        Toast.makeText(requireContext(), "Notes Created Successfully", Toast.LENGTH_SHORT).show()

        Navigation.findNavController(it!!).navigate(R.id.action_createNotesFragment_to_homeFragment)

    }

}