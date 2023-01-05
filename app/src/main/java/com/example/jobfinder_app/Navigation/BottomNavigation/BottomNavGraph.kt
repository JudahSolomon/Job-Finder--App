package com.example.jobfinder_app.Navigation.BottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jobfinder_app.Screens.HomeScreen
import com.example.jobfinder_app.Screens.LikeScreen
import com.example.jobfinder_app.Screens.MessageScreen
import com.example.jobfinder_app.Screens.ProfileScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {

        composable(route = BottomBarScreen.Home.route) {
            HomeScreen(navController = navController)
        }

        composable(route = BottomBarScreen.Like.route) {
            LikeScreen()
        }

        composable(route = BottomBarScreen.Message.route) {
            MessageScreen()
        }

        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }

        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
    }



}