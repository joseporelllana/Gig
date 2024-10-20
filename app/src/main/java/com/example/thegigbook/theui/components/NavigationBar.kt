package com.example.thegigbook.theui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings

@Composable
fun NavigationBar(navController: NavController) {
    BottomAppBar(
        modifier = Modifier
            .height(56.dp)
            .background(Color(0xFF4A148C)), // Dark purple background
        contentColor = Color.White // This is the color for the text (if any) in the BottomAppBar
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { navController.navigate("home") }) {
                Icon(Icons.Filled.Home, contentDescription = "Home", tint = Color(0xFF9C27B0)) // Purple icon color
            }
            IconButton(onClick = { navController.navigate("profile") }) {
                Icon(Icons.Filled.Person, contentDescription = "Profile", tint = Color(0xFF9C27B0)) // Purple icon color
            }
            IconButton(onClick = { navController.navigate("settings") }) {
                Icon(Icons.Filled.Settings, contentDescription = "Settings", tint = Color(0xFF9C27B0)) // Purple icon color
            }
        }
    }
}


