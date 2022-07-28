package com.example.myapplication

sealed class Screen(val route : String) {
    object HomeScreen : Screen("home_Screen")
    object DetailScreen : Screen("detail_screen")
}
