package com.example.planetskmp

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PlanetScreen(
    modifier: Modifier = Modifier
) {
    Text(
        text = "Mercury",
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )
}

@Composable
@Preview(heightDp = 500, widthDp = 250)
fun PlanetScreenPreview() {
    MaterialTheme {
        PlanetScreen()
    }
}