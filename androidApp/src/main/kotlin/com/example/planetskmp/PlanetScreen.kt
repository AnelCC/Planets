package com.example.planetskmp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PlanetScreen(
    modifier: Modifier = Modifier
) {
    Box(modifier = Modifier
        .fillMaxSize()
    ) {
        Text(
            text = "Mercury",
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .padding(16.dp)
        )
    }
}

@Composable
@Preview(heightDp = 500, widthDp = 250)
fun PlanetScreenPreview() {
    MaterialTheme {
        PlanetScreen()
    }
}