package com.example.jobfinder_app.Navigation

import LikeScreen
import ProfileScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.jobfinder_app.Navigation.ScreenNavigation.Screen
import com.example.jobfinder_app.Screens.HomeScreen
import com.example.jobfinder_app.Screens.MessageScreen
import com.example.jobfinder_app.ui.theme.ButtonBg
import com.example.jobfinder_app.ui.theme.White

@Composable
fun HomeScreenBottomNav() {
    val navController = rememberNavController()

    val screens = listOf(
        Screen.Home,
        Screen.Like,
        Screen.Message,
        Screen.Profile
    )

    Scaffold(bottomBar = {
        BottomNavigation {

            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination

            screens.forEach { screen ->

                BottomNavigationItem(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(ButtonBg),
                    icon = {
                        Icon(
                            painterResource(id = screen.icon),
                            contentDescription = "Navigation Icon",
                            modifier = Modifier
                                .fillMaxWidth()
                                .size(40.dp),
                            tint = White
                        )
                    },
                    selected = currentDestination?.hierarchy?.any {
                        it.route == screen.route
                    } == true,
                    onClick = {
                        navController.navigate(screen.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true

                            restoreState = true
                        }
                    },
                    unselectedContentColor = LocalContentColor.current
                        .copy(alpha = ContentAlpha.disabled),

                    selectedContentColor = White,

                    )
            }

        }
    }) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            NavHost(
                navController = navController,
                startDestination = Screen.Home.route
            ) {

                composable(Screen.Home.route) { HomeScreen() }
                composable(Screen.Like.route) { LikeScreen() }
                composable(Screen.Message.route) { MessageScreen() }
                composable(Screen.Profile.route) { ProfileScreen() }
            }

        }
    }

}

