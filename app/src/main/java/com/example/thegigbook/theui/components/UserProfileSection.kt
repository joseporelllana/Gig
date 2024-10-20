package com.example.thegigbook.theui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thegigbook.models.UserProfile

@Composable
fun UserProfileSection(profile: UserProfile) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Placeholder for Profile Picture (if you want to add later)
            Spacer(modifier = Modifier.height(16.dp)) // Space where the image would go

            // User Name
            Text(
                text = profile.name,
                fontSize = 20.sp,
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(4.dp))

            // User Bio (if any)
            profile.bio?.let {
                Text(
                    text = it,
                    fontSize = 14.sp,
                    style = MaterialTheme.typography.bodySmall
                )
            } ?: run {
                // Optional: Display a default message if no bio is provided
                Text(
                    text = "No bio available",
                    fontSize = 14.sp,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}
