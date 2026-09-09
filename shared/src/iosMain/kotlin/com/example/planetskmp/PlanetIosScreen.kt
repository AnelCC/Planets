package com.example.planetskmp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun PlanetIosScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        Text(
            text = "Marte",
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp)
        )
    }
}

@Composable
@Preview(heightDp = 500, widthDp = 250)
fun PlanetIosScreenPreview() {
    MaterialTheme {
        PlanetIosScreen()
    }
}