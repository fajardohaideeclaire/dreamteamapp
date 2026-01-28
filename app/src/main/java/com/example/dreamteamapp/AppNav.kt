package com.example.dreamteamapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dreamteamapp.bios.*

@Composable
fun AppNav(navController: NavHostController) {
    NavHost(navController, startDestination = "main") {
        composable("main") { MainScreen(navController) }
        composable("bio1") { BioStudent1Screen() }
        composable("bio2") { BioStudent2Screen() }
        composable("bio3") { BioStudent3Screen() }
        composable("bio4") { BioStudent4Screen() }
        composable("bio5") { BioStudent5Screen() }
    }
}
