package com.example.dreamteamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.dreamteamapp.ui.theme.DreamTeamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DreamTeamTheme {
                val navController = rememberNavController()
                AppNav(navController)
            }
        }
    }
}
