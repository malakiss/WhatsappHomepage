package com.example.whatsapphomepage

import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class ViewModel: ViewModel() {
     lateinit var navController: NavController

    val onButtonClick: View.OnClickListener = View.OnClickListener {
        Toast.makeText(it.context, "Archive button clicked", Toast.LENGTH_SHORT).show()
    }
    fun onChatClick(chatItem: ChatItem): View.OnClickListener {
        return View.OnClickListener {
            navController.navigate(
                HomeFragmentDirections.actionHomeFragmentToChatFragment(
                    chatItem.username,
                    chatItem.profilePictureResId,
                    chatItem.dateText
                )
            )
        }
    }
    val  toNavigateUp : View.OnClickListener=View.OnClickListener {
        navController.navigateUp()

    }



}