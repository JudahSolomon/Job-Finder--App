package com.example.jobfinder_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jobfinder_app.Screens.HomeScreenUI
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

                    systemUiController.setStatusBarColor(color = BgColor)
                }


                    Surface(modifier = Modifier.fillMaxSize()) {

                        HomeScreenUI()
                    }

            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        JobFinderAppTheme {
        }
    }
}