package com.example.planetskmp.presentation

import androidx.lifecycle.ViewModel
import com.example.planetskmp.data.Planet
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class PlanetListViewModel(
) : ViewModel() {
    private val _planets = MutableStateFlow(
        listOf(
            Planet(1, "Mercury"),
            Planet(2, "Venus"),
            Planet(3, "Earth"),
            Planet(4, "Mars"),
            Planet(5, "Jupiter"),
            Planet(6, "Saturn"),
            Planet(7, "Uranus"),
            Planet(8, "Neptune")
        )
    )

    val planets: StateFlow<List<Planet>> = _planets
}
