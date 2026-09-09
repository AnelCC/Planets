package com.example.planetskmp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.planetskmp.data.Planet
import com.example.planetskmp.presentation.PlanetListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            PlanetListScreen(
                modifier = Modifier,
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
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}