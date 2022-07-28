package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavController(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(
            Screen.HomeScreen.route
        ) {
            HomeScreen(navController)
        }
        composable(
            Screen.DetailScreen.route
        ) {
            DetailScreen()
        }
    }

}