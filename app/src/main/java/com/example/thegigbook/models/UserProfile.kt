package com.example.thegigbook.models

data class UserProfile(
    val name: String,
    val bio: String? = null,
    val profilePicture: String? = null // Assuming you're using a URL or a local path for the picture
)

