package com.example.thegigbook.theui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.thegigbook.models.ConcertEntry
import com.example.thegigbook.models.UserProfile
import com.example.thegigbook.theui.screens.GigBookScreen
import com.example.thegigbook.theui.screens.LoadingScreen
import com.example.thegigbook.theui.screens.LoginScreen
import com.example.thegigbook.theui.screens.SignUpScreen
import com.example.thegigbook.theui.screens.WelcomePage

@Composable
fun NavigationGraph() {
    val navController = rememberNavController() // Remember the NavController
    NavHost(navController, startDestination = "loading") {
        composable("loading") { LoadingScreen(navController) }
        composable("welcome") { WelcomePage(navController) }
        composable("login") { LoginScreen(navController) }
        composable("signup") { SignUpScreen(navController) }

        // GigBookScreen without navArgument
        composable("gigBook") {
            // Create a default UserProfile and empty concert list
            val userProfile = UserProfile(name = "Guest") // Replace with actual user data
            val concertEntries = listOf<ConcertEntry>() // Default empty list
            GigBookScreen(navController, userProfile, concertEntries)
        }
    }
}








