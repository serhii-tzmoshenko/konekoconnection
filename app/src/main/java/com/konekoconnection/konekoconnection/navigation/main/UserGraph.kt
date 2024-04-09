package com.konekoconnection.konekoconnection.navigation.main

import androidx.compose.ui.layout.ScaleFactor
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.konekoconnection.konekoconnection.navigation.Screens

fun NavGraphBuilder.userGraph(navHostController: NavHostController) {
    navigation(route = Screens.User.route, startDestination = Screens.User.Profile.route) {
        composable(Screens.User.Profile.route) {
            ProfileScreen()
        }
        composable(Screens.User.Details.route) {
            DetailsScreen()
        }
        composable(Screens.User.Settings.route) {
            SettingsScreen()
        }
    }
}