package com.example.jobfinder_app.Navigation.ScreenNavigation

import com.example.jobfinder_app.R

sealed class Screen(
    val route: String,
    val icon: Int
) {

    object Home : Screen("home", icon = R.drawable.bt_nav_home)
    object Like : Screen("like", icon = R.drawable.bt_nav_like)
    object Message : Screen("message", icon = R.drawable.bt_nav_message)
    object Profile : Screen("profile", icon = R.drawable.bt_nav_profile)
}