package com.example.catalogia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.catalogia.ui.theme.CatalogiaTheme

enum class CatalogiaScreen {
    Welcome,
    Grid,
    Detail
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CatalogiaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var currentScreen by remember { mutableStateOf(CatalogiaScreen.Welcome) }
                    var selectedLibro by remember { mutableStateOf<Libro?>(null) }

                    Crossfade(targetState = currentScreen, label = "ScreenTransition") { screen ->
                        when (screen) {
                            CatalogiaScreen.Welcome -> {
                                LibroWelcomeScreen(
                                    onNavigateToGrid = {
                                        currentScreen = CatalogiaScreen.Grid
                                    }
                                )
                            }
                            CatalogiaScreen.Grid -> {
                                LibroGridScreen(
                                    onBack = {
                                        currentScreen = CatalogiaScreen.Welcome
                                    },
                                    onItemClick = { libro ->
                                        selectedLibro = libro
                                        currentScreen = CatalogiaScreen.Detail
                                    }
                                )
                            }
                            CatalogiaScreen.Detail -> {
                                selectedLibro?.let { libro ->
                                    LibroDetailScreen(
                                        libro = libro,
                                        onBack = {
                                            currentScreen = CatalogiaScreen.Grid
                                        }
                                    )
                                } ?: run {
                                    currentScreen = CatalogiaScreen.Grid
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


