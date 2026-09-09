package com.example.planetskmp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.planetskmp.data.Planet

@Composable
fun PlanetListScreen(
    planets: List<Planet>,
    modifier: Modifier = Modifier
) {

    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
        topBar = {
            TopAppBar(
                title = { Text(text = "Solar System Planets") }
            )
        },
        content = { innerPadding ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                items(planets) { planet ->
                    Text(
                        text = planet.name,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    )
                }
            }
        }
    )
}

@Composable
@Preview()
fun PlanetListScreenPreview() {
    MaterialTheme {
        PlanetListScreen(
            planets = listOf(
                Planet(1, "Mercury"),
                Planet(2, "Venus"),
                Planet(3, "Earth"),
                Planet(4, "Mars"),
                Planet(5, "Jupiter"),
                Planet(6, "Saturn"),
                Planet(7, "Uranus"),
                Planet(8, "Neptune"),
            ),
        )
    }
}