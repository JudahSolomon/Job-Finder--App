package com.example.jobfinder_app.Navigation.ScreenNavigation

sealed class Screen(
    val route: String
)

object HomeScreen : Screen("home_screen")
object UiUxDesigner : Screen("uiux_screen")
object GraphicDesigner : Screen("graphic_designer_screen")
object SoftwareEngineer : Screen("software_screen")
