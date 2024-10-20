package com.example.thegigbook.theui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.thegigbook.models.ConcertEntry
import com.example.thegigbook.models.UserProfile
import com.example.thegigbook.theui.components.ConcertEntryCard
import com.example.thegigbook.theui.components.NavigationBar
import com.example.thegigbook.theui.components.UserProfileSection
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star

@Composable
fun GigBookScreen(navController: NavController, userProfile: UserProfile, concertEntries: List<ConcertEntry>) {
    var entries by remember { mutableStateOf(concertEntries) } // State for concert entries
    var newConcertName by remember { mutableStateOf("") }
    var newConcertLocation by remember { mutableStateOf("") }
    var newConcertArtist by remember { mutableStateOf("") }
    var newConcertRating by remember { mutableIntStateOf(1) }

    Scaffold(
        bottomBar = { NavigationBar(navController) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(Color(0xFFEDE7F6)) // Light background for visibility
        ) {
            UserProfileScreen(profile = userProfile)

            Spacer(modifier = Modifier.height(16.dp))

            // Add New Concert Entry Section
            Text("Add New Concert Entry", fontSize = 20.sp, modifier = Modifier.padding(8.dp))
            TextField(
                value = newConcertName,
                onValueChange = { newConcertName = it },
                label = { Text("Concert Name") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = newConcertLocation,
                onValueChange = { newConcertLocation = it },
                label = { Text("Location") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = newConcertArtist,
                onValueChange = { newConcertArtist = it },
                label = { Text("Artist Name") },
                modifier = Modifier.fillMaxWidth()
            )
            // Rating selection (1 to 5)
            Row {
                for (i in 1..5) {
                    IconButton(onClick = { newConcertRating = i }) {
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "Rating $i",
                            tint = if (i <= newConcertRating) Color.Yellow else Color.Gray
                        )
                    }
                }
            }

            Button(onClick = {
                // Add new concert entry
                val newEntry = ConcertEntry(
                    name = newConcertName,
                    venue = newConcertLocation,
                    artist = newConcertArtist,
                    rating = newConcertRating
                )
                entries = entries + newEntry
                newConcertName = ""
                newConcertLocation = ""
                newConcertArtist = ""
                newConcertRating = 1
            }) {
                Text("Add Concert Entry")
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Display Concert Entries in a swipable format
            Text("Concert Entries", fontSize = 20.sp, modifier = Modifier.padding(8.dp))

            LazyRow {
                items(entries.take(4)) { entry ->
                    ConcertEntryCard(entry)
                }
            }
        }
    }
}

@Composable
fun UserProfileScreen(profile: UserProfile) {
    UserProfileSection(profile = profile)
}

