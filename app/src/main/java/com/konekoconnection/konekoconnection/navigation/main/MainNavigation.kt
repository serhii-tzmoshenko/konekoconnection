package com.konekoconnection.konekoconnection.navigation.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.konekoconnection.konekoconnection.navigation.Screens

@Composable
fun MainNavigation(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Screens.Content.route) {
        contentGraph(navHostController = navHostController)
        photoGraph(navHostController = navHostController)
        userGraph(navHostController = navHostController)
    }
}