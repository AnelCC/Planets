package com.example.planetskmp.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
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

    PlanetListScreen(
        planets = planets
    )
}

@Preview
@Composable
fun AppAndroidPreview() {
    PlanetListRoute()
}