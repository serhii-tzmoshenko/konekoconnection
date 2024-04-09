package com.konekoconnection.konekoconnection.navigation

sealed class Screens(val route: String) {
    data object Auth : Screens("auth") {
        data object Login : Screens("login")
        data object Register : Screens("register")
        data object Recovery : Screens("recovery")
    }

    data object HappyMainScreen : Screens("happy_main_screen")

    data object Content : Screens("content") {
        data object Home : Screens("home")
        data object Search : Screens("search")
    }

    data object Photo : Screens("photo") {
        data object Add : Screens("add")
        data object Edit : Screens("edit")
    }

    data object User : Screens("user") {
        data object Profile : Screens("profile")
        data object Details : Screens("details")
        data object Settings : Screens("settings")
    }
}