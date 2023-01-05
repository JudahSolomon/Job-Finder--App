package com.example.jobfinder_app.Navigation.ScreenNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = HomeScreen.route) {

    }
}