package com.example.planetskmp.data

import kotlinx.coroutines.flow.MutableStateFlow

interface PlanetRepository {
    fun getPlanets(): MutableStateFlow<List<Planet>>

}
