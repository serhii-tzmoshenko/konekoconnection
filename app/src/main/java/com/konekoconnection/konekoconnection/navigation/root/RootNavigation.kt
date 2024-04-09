package com.konekoconnection.konekoconnection.navigation.root

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.konekoconnection.konekoconnection.navigation.Screens

@Composable
fun RootNavigation(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Screens.Auth.route) {
        authGraph(navHostController = navHostController)
        composable(Screens.Main.route) {
            MainScreen()
        }
    }
}