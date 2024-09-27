package com.arun.composetemplate.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

enum class Screens(val route: String, val title: String? = null, val navIcon: ImageVector? = null) {
    Home("/home", "Home", Icons.Default.Home)
}