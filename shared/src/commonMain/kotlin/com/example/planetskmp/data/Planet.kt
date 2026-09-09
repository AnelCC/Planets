package com.example.planetskmp.data

import kotlinx.coroutines.flow.MutableStateFlow

data class Planet(
    val id: Int,
    val name: String,
    val description: String,
    val distanceFromSun: String,
    val diameter: String,
    val moons: Int
)


val planets = MutableStateFlow(
    listOf(
        Planet(
            id = 1,
            name = "Mercury",
            description = "The closest planet to the Sun.",
            distanceFromSun = "57.9 million km",
            diameter = "4,879 km",
            moons = 0
        ),
        Planet(
            id = 2,
            name = "Venus",
            description = "The hottest planet in the Solar System.",
            distanceFromSun = "108.2 million km",
            diameter = "12,104 km",
            moons = 0
        ),
        Planet(
            id = 3,
            name = "Earth",
            description = "Our home planet and the only known planet with life.",
            distanceFromSun = "149.6 million km",
            diameter = "12,742 km",
            moons = 1
        ),
        Planet(
            id = 4,
            name = "Mars",
            description = "Known as the Red Planet.",
            distanceFromSun = "227.9 million km",
            diameter = "6,779 km",
            moons = 2
        ),
        Planet(
            id = 5,
            name = "Jupiter",
            description = "The largest planet in the Solar System.",
            distanceFromSun = "778.5 million km",
            diameter = "139,820 km",
            moons = 115
        ),
        Planet(
            id = 6,
            name = "Saturn",
            description = "Known for its large and visible ring system.",
            distanceFromSun = "1.43 billion km",
            diameter = "116,460 km",
            moons = 293
        ),
        Planet(
            id = 7,
            name = "Uranus",
            description = "An ice giant that rotates on its side.",
            distanceFromSun = "2.87 billion km",
            diameter = "50,724 km",
            moons = 29
        ),
        Planet(
            id = 8,
            name = "Neptune",
            description = "The farthest planet from the Sun.",
            distanceFromSun = "4.50 billion km",
            diameter = "49,244 km",
            moons = 16
        )
    )
)
