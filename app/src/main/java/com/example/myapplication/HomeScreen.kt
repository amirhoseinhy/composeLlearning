package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController : NavController){
    Box(modifier = Modifier.fillMaxSize().background(MaterialTheme.colors.background),
    contentAlignment = Alignment.Center) {
            Text(text = stringResource(id = R.string.home_screen),
            fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable {
                    navController.navigate(route = Screen.DetailScreen.route)
                }.background(MaterialTheme.colors.primary)
            )
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(
        rememberNavController()
    )
}

