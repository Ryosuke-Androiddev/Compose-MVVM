package com.example.compose_mvvm.navigation.navcompose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.compose_mvvm.navigation.Screens
import com.example.compose_mvvm.navigation.navcompose.destination.listComposable
import com.example.compose_mvvm.navigation.navcompose.destination.taskComposable
import com.example.compose_mvvm.utility.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController
){
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN )
    {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}