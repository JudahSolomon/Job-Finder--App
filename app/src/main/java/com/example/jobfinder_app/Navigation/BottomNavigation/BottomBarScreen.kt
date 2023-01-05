package com.example.jobfinder_app.Navigation.BottomNavigation

import com.example.jobfinder_app.R

sealed class BottomBarScreen(
    val route: String,
    val icon: Int
) {
    object Home : BottomBarScreen(
        route = "home",
        icon = R.drawable.bt_nav_home
    )

    object Like : BottomBarScreen(
        route = "like",
        icon = R.drawable.bt_nav_like
    )

    object Message : BottomBarScreen(
        route = "message",
        icon = R.drawable.bt_nav_message
    )

    object Profile : BottomBarScreen(
        route = "profile",
        icon = R.drawable.bt_nav_profile
    )

}
