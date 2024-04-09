package com.konekoconnection.konekoconnection.navigation.root

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.konekoconnection.konekoconnection.navigation.Screens

fun NavGraphBuilder.authGraph(navHostController: NavHostController) {
    navigation(route = Screens.Auth.route, startDestination = Screens.Auth.Login.route) {
        composable(Screens.Auth.Login.route) {
            LoginScreen()
        }
        composable(Screens.Auth.Register.route) {
            RegisterScreen()
        }
        composable(Screens.Auth.Recovery.route) {
            RecoveryScreen()
        }
    }
}