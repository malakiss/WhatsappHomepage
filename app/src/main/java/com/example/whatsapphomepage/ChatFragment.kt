package com.example.whatsapphomepage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.whatsapphomepage.databinding.FragmentChatBinding
import com.example.whatsapphomepage.databinding.FragmentHomeBinding

class ChatFragment : Fragment(R.layout.fragment_chat) {
    private lateinit var binding: FragmentChatBinding// Replace with your actual binding clas
    val homeViewModel: com.example.whatsapphomepage.ViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentChatBinding>(
            inflater,
            R.layout.fragment_chat, container, false
        )
        val args = ChatFragmentArgs.fromBundle(requireArguments())
        val chatItem = ChatItem(args.dateText,args.username,args.profilePictureResId)
        binding.chatItem=chatItem
        val navHostFragment = requireActivity().supportFragmentManager.findFragmentById(R.id.myNavHostFragment) as NavHostFragment
         val navController: NavController = navHostFragment.navController
        homeViewModel.navController=navController
        binding.viewModel=homeViewModel
        return binding.root
}
}

