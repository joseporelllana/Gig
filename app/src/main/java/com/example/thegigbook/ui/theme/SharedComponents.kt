package com.example.thegigbook.ui.theme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun GradientBackground(content: @Composable () -> Unit) {
    val gradientColors = listOf(
        Color(0xFF7B1FA2), // Purple 700
        Color(0xFF9C27B0), // Purple 500
        Color(0xFFE1BEE7)  // Light Purple
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.verticalGradient(colors = gradientColors))
    ) {
        content()
    }
}
