package com.example.whatsapphomepage
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.whatsapphomepage.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding
     val homeViewModel: com.example.whatsapphomepage.ViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(
            inflater,
            R.layout.fragment_home, container, false
        )
 val chatItems: List<ChatItem> = listOf(
            ChatItem(dateText = "6:23 pm", username = "Malak", R.drawable.woman1),
            ChatItem(dateText = "7:45 am", username = "Nour", R.drawable.woman2),
            ChatItem(dateText = "6:23 pm", username = "Yasmine", R.drawable.woman1),
            ChatItem(dateText = "5:45 am", username = "Ahmed", R.drawable.man1),
            ChatItem(dateText = "6:23 pm", username = "Omar", R.drawable.man2),
        )

        val navHostFragment = requireActivity().supportFragmentManager.findFragmentById(R.id.myNavHostFragment) as NavHostFragment
        val navController: NavController = navHostFragment.navController
        homeViewModel.navController=navController
        binding.viewModel=homeViewModel
        binding.chatItems = chatItems

  return binding.root
}
}


