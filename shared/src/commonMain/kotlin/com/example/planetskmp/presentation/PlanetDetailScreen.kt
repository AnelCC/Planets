package com.example.planetskmp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.planetskmp.data.Planet
import org.jetbrains.compose.resources.painterResource

@Composable
fun PlanetDetailScreen(
    planet: Planet,
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text(planet.name) },
                navigationIcon = {
                    Text(
                        text = "<",
                        modifier = Modifier
                            .clickable { onBackClick() }
                            .padding(16.dp),
                        style = MaterialTheme.typography.headlineMedium
                    )
                }
            )
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 32.dp, vertical = 24.dp),
        ) {
            Image(
                painter = painterResource(planet.imageResource()),
                contentDescription = planet.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier.height(24.dp))
            Text(
                text = planet.description,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = "Distance: ${planet.distanceFromSun}",
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text ="Diameter: ${planet.diameter}",
                style = MaterialTheme.typography.titleMedium
            )
            Text(text = "Moons: ${planet.moons}",
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

@Composable
@Preview()
fun PlanetDetailScreenPreview() {
    PlanetDetailScreen(
        Planet(
            id = 1,
            name = "Mercury",
            description = "The closest planet to the Sun.",
            distanceFromSun = "57.9 million km",
            diameter = "4,879 km",
            moons = 0
        )
    ) { }
}


