package com.konekoconnection.konekoconnection.navigation.main

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.konekoconnection.konekoconnection.navigation.Screens

fun NavGraphBuilder.contentGraph(navHostController: NavHostController) {
    navigation(route = Screens.Content.route, startDestination = Screens.Content.Home.route) {
        composable(Screens.Content.Home.route) {
            HomeScreen()
        }
        composable(Screens.Content.Search.route) {
            SearchScreen()
        }
    }
}