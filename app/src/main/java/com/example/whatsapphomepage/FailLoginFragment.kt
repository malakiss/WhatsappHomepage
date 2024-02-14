package com.example.whatsapphomepage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.whatsapphomepage.databinding.FragmentChatBinding
import com.example.whatsapphomepage.databinding.FragmentFailLoginBinding
import com.example.whatsapphomepage.databinding.FragmentHomeBinding

class FailLoginFragment : Fragment() {

    private lateinit var binding: FragmentFailLoginBinding
    val homeViewModel: com.example.whatsapphomepage.ViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentFailLoginBinding>(
            inflater,
            R.layout.fragment_fail_login, container, false
        )
        val navHostFragment = requireActivity().supportFragmentManager.findFragmentById(R.id.myNavHostFragment) as NavHostFragment
        val navController: NavController = navHostFragment.navController

        binding.loginButton.setOnClickListener{

            val phoneInput = binding.phoneInput.text.toString()
            val passwordInput = binding.passwordInput.text.toString()

            // Check if phone and password are equal to expected values
            if (phoneInput == "1234" && passwordInput == "malak") {
                // Navigate to home fragment
                navController.navigate(FailLoginFragmentDirections.actionFailLoginFragmentToHomeFragment())
            } else {
                navController.navigate(FailLoginFragmentDirections.actionFailLoginFragmentSelf())


            }
        }
         homeViewModel.navController=navController
       // binding.viewModel=homeViewModel
        return binding.root

    }
}