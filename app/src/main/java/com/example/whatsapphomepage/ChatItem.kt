package com.example.whatsapphomepage

import android.graphics.drawable.Drawable
import android.os.Parcel
import android.os.Parcelable

data class ChatItem(
    val dateText: String,
    val username: String,
    val profilePictureResId: Int
)

