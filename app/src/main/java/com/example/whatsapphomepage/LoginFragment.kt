package com.example.whatsapphomepage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.whatsapphomepage.databinding.FragmentHomeBinding
import com.example.whatsapphomepage.databinding.LoginscreenBinding




class LoginFragment : Fragment() {
    private lateinit var binding: LoginscreenBinding
    val homeViewModel: com.example.whatsapphomepage.ViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<LoginscreenBinding>(
            inflater,
            R.layout.loginscreen, container, false
        )
        binding.loginButton.setOnClickListener{

            val phoneInput = binding.phoneInput.text.toString()
            val passwordInput = binding.passwordInput.text.toString()

            if (phoneInput == "1234" && passwordInput == "malak") {
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToHomeFragment())
            } else {
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToFailLoginFragment())


            }
        }
            val navController=findNavController()
        homeViewModel.navController=navController

        return binding.root
    }


}