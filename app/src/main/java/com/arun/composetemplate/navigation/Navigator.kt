package com.arun.composetemplate.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arun.composetemplate.composables.screens.HomeScreen
import com.arun.composetemplate.navigation.com.arun.composetemplate.AppScaffold

const val DEFAULT_TITLE = ""

@Composable
fun Navigator() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.Home.route) {
        composable(Screens.Home.route) {
            AppScaffold(title = Screens.Home.title ?: DEFAULT_TITLE, navIcon = Screens.Home.navIcon) {
                HomeScreen()
            }
        }
    }
}