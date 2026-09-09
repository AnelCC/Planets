package com.example.planetskmp.presentation

import androidx.lifecycle.ViewModel
import com.example.planetskmp.data.Planet
import com.example.planetskmp.data.PlanetRepository
import kotlinx.coroutines.flow.MutableStateFlow

class PlanetListViewModel(
    private val repository: PlanetRepository
) : ViewModel() {

    fun getPlanets(): MutableStateFlow<List<Planet>> {
        return repository.getPlanets()
    }

}
