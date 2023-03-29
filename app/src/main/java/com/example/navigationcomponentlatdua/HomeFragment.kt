package com.example.navigationcomponentlatdua

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentlatdua.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getNama = arguments?.getString("nama")
        binding.tvTitle.setText("Hello, $getNama")

        binding.ivProfile.setOnClickListener {
            val nama = binding.tvTitle.text.toString()
            val action = HomeFragmentDirections.actionHomeFragment2ToProfileFragment3(nama)
            findNavController().navigate(action)

        }

    }
}