package com.example.planetskmp.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.planetskmp.data.Planet
import com.example.planetskmp.data.PlanetRepositoryImpl

@Composable
fun PlanetListRoute(
    viewModel: PlanetListViewModel = viewModel {
        PlanetListViewModel(
            repository = PlanetRepositoryImpl()
        )
    }
) {
    val planets by viewModel.getPlanets().collectAsState()
    var selectedPlanetId by rememberSaveable { mutableStateOf<Int?>(null) }

    val selectedPlanet = selectedPlanetId?.let { viewModel.getPlanet(it) }

    if (selectedPlanet == null) {
        PlanetListScreen(
            planets = planets,
            onPlanetClick = { planet ->
                selectedPlanetId = planet.id
            }
        )
    } else {
        PlanetDetailScreen(
            planet = selectedPlanet,
            onBackClick = {
                selectedPlanetId = null
            }
        )
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    PlanetListRoute()
}