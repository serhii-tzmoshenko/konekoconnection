package com.konekoconnection.konekoconnection.navigation.main

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.konekoconnection.konekoconnection.navigation.Screens

fun NavGraphBuilder.photoGraph(navHostController: NavHostController) {
    navigation(route = Screens.Photo.route, startDestination = Screens.Photo.Add.route) {
        composable(Screens.Photo.Add.route) {
            AddPhotoSreen()
        }
        composable(Screens.Photo.Edit.route) {
            EditPhotoScreen()
        }
    }
}