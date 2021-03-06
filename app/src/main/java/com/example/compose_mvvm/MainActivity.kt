package com.example.compose_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.compose_mvvm.navigation.navcompose.SetupNavigation
import com.example.compose_mvvm.ui.theme.ComposeMVVMTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    
    private lateinit var navController: NavHostController
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMVVMTheme {
                navController = rememberNavController()
                SetupNavigation(navController = navController)
            }
        }
    }
}

