package com.zm.mypocketschool.ui.assignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.zm.mypocketschool.databinding.FragmentAssignmentsBinding


class AssignmentFragment : Fragment() {

    private lateinit var assignmentViewModel: AssignmentViewModel
    private var _binding: FragmentAssignmentsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        assignmentViewModel =
            ViewModelProvider(this).get(assignmentViewModel::class.java)

        _binding = FragmentAssignmentsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAssignment
        assignmentViewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}