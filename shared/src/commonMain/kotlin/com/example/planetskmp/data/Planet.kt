package com.example.planetskmp.data

import kotlinx.coroutines.flow.MutableStateFlow

data class Planet(
    val id: Int,
    val name: String,
)


val planets = MutableStateFlow(
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
