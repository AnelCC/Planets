package com.example.planetskmp.data

data class Planet(
    val id: Int,
    val name: String,
)


val planets = listOf(
    Planet(
        id = 1,
        name = "Mercury",
    ),
    Planet(
        id = 2,
        name = "Venus",
    ),
    Planet(
        id = 2,
        name = "Earth",
    )
)
