package com.example.planetskmp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import planetskmp.shared.generated.resources.Res
import planetskmp.shared.generated.resources.earth
import planetskmp.shared.generated.resources.jupiter
import planetskmp.shared.generated.resources.mars
import planetskmp.shared.generated.resources.mercury
import planetskmp.shared.generated.resources.neptune
import planetskmp.shared.generated.resources.saturn
import planetskmp.shared.generated.resources.uranus
import planetskmp.shared.generated.resources.venus

@Composable
fun PlanetListScreen(
    planets: List<Planet>,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text("Solar System Planets")
                }
            )
        }
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            items(planets) { planet ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp, vertical = 24.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(planet.imageResource()),
                        contentDescription = planet.name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(end = 16.dp)
                            .size(60.dp)
                    )
                    Text(
                        text = planet.name,
                        modifier = Modifier.weight(7f),
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Text(
                        text = ">",
                        modifier = Modifier.weight(1f),
                        style = MaterialTheme.typography.headlineMedium
                    )
                }
            }
        }
    }
}

fun Planet.imageResource() = when (name) {
    "Mercury" -> Res.drawable.mercury
    "Venus" -> Res.drawable.venus
    "Earth" -> Res.drawable.earth
    "Mars" -> Res.drawable.mars
    "Jupiter" -> Res.drawable.jupiter
    "Saturn" -> Res.drawable.saturn
    "Uranus" -> Res.drawable.uranus
    "Neptune" -> Res.drawable.neptune
    else -> Res.drawable.mercury
}

@Composable
@Preview()
fun PlanetListScreenPreview() {
    MaterialTheme {
        PlanetListScreen(
            planets =
                listOf(
                    Planet(
                        id = 1,
                        name = "Mercury",
                    ),
                    Planet(
                        id = 2,
                        name = "Venus",
                    ),
            ),
        )
    }
}