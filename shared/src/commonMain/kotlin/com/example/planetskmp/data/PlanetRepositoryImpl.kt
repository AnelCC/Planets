package com.example.planetskmp.data

import kotlinx.coroutines.flow.MutableStateFlow

class PlanetRepositoryImpl : PlanetRepository {
    override fun getPlanets(): MutableStateFlow<List<Planet>> = planets

}