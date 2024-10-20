package com.example.thegigbook.theui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.thegigbook.ui.theme.GradientBackground

@Composable
fun LoadingScreen(navController: NavController) {
    // Gradient background for the loading screen
    GradientBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // App Logo/Image
            Image(
                painter = rememberAsyncImagePainter("https://example.com/logo.png"), // Placeholder logo URL
                contentDescription = "GigBook Logo",
                modifier = Modifier.size(100.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Loading Text
            Text(
                text = "Loading...",
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Progress Indicator
            CircularProgressIndicator(
                modifier = Modifier.size(50.dp),
                strokeWidth = 4.dp
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Navigate to another screen after loading
            LaunchedEffect(Unit) {
                // Simulate a delay for the loading screen
                kotlinx.coroutines.delay(3000) // 3 seconds delay
                navController.navigate("gigbook") // Ensure this matches NavigationGraph destination
            }
        }
    }
}


