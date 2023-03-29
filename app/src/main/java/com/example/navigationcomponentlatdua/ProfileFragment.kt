package com.example.navigationcomponentlatdua

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentlatdua.databinding.FragmentProfileBinding
import com.example.navigationcomponentlatdua.databinding.FragmentRegisterBinding

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getNama = arguments?.getString("nama")
        binding.profileName.setText(getNama)

        binding.logoutButton.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment3_to_loginFragment2)
        }
    }
}