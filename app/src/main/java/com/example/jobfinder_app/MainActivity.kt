package com.example.jobfinder_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jobfinder_app.Navigation.BottomNavigation.BottomBar
import com.example.jobfinder_app.Screens.HomeScreen
import com.example.jobfinder_app.ui.theme.BgColor
import com.example.jobfinder_app.ui.theme.JobFinderAppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity(
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JobFinderAppTheme {
                // A surface container using the 'background' color from the theme


                val systemUiController = rememberSystemUiController()
                SideEffect {
                    systemUiController.setStatusBarColor(
                        color = BgColor,
                        darkIcons = false
                    )
//
                    systemUiController.setStatusBarColor(color = BgColor)
                }
                val navController = rememberNavController()

                Scaffold(
                    content = {
                        LazyColumn {
                            item {
                                HomeScreen(navController = navController)
                            }
                        }

                    },
                    bottomBar = {
                       BottomBar(navController = navController)
                    })
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        JobFinderAppTheme {
//            HomeScreen(navController = NavController)
        }
    }
}