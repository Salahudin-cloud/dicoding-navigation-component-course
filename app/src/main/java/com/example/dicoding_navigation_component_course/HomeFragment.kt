package com.example.dicoding_navigation_component_course

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.dicoding_navigation_component_course.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var _binding: FragmentHomeBinding
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCategory.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_category_frament)
        )

        binding.btnProfile.setOnClickListener{
            view.findNavController().navigate(R.id.action_homeFragment_to_profileActivity2)
        }
    }


}