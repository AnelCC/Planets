package com.example.planetskmp.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun PlanetListRoute(
    viewModel: PlanetListViewModel = viewModel {
        PlanetListViewModel()
    }
) {
    val planets by viewModel.planets.collectAsState()

    PlanetListScreen(
        planets = planets
    )
}

@Preview
@Composable
fun AppAndroidPreview() {
    PlanetListRoute()
}