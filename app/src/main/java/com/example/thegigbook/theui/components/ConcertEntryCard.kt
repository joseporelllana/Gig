package com.example.thegigbook.theui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star

import com.example.thegigbook.models.ConcertEntry

@Composable
fun ConcertEntryCard(entry: ConcertEntry) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .width(200.dp), // Set a fixed width for better layout
        elevation = CardDefaults.elevation(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White) // Card background color
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .background(Color(0xFFE3F2FD)), // Light blue background for card content
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = entry.name, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = entry.venue, fontSize = 14.sp, color = Color.Gray)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "Artist: ${entry.artist}", fontSize = 14.sp)
            Spacer(modifier = Modifier.height(4.dp))

            // Star rating
            Row {
                for (i in 1..5) {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "Rating $i",
                        tint = if (i <= entry.rating) Color.Yellow else Color.Gray
                    )
                }
            }
        }
    }
}
