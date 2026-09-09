package com.example.planetskmp

import androidx.compose.ui.Modifier
import androidx.compose.ui.window.ComposeUIViewController
import com.example.planetskmp.data.Planet
import com.example.planetskmp.presentation.PlanetListScreen

fun MainViewController() = ComposeUIViewController {
    PlanetListScreen(
        modifier = Modifier,
        planets = listOf(
            Planet(1, "Mercury"),
            Planet(2, "Venus"),
            Planet(3, "Earth"),
            Planet(4, "Mars"),
            Planet(5, "Jupiter"),
            Planet(6, "Saturn"),
            Planet(7, "Uranus"),
            Planet(8, "Neptune"),
        ),
    )
}