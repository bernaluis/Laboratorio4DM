package com.example.laboratorio3bm101219

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

interface MyDestination {
    val icon: ImageVector
    val route:String
}
object First:MyDestination {
    override val icon: ImageVector = Icons.Filled.Check
    override val route: String = "FirstCompose"
}
object Second:MyDestination{
    override val icon: ImageVector = Icons.Filled.Check
    override val route: String = "SecondCompose"
}
val myListOfIdDestinations= listOf(First,Second)

fun NavGraphBuilder.mainGraph(navController:NavHostController){
    composable(First.route){
        FirstCompose(
            onClickNavigateTo = {
                navController.navigateSingleTopTo(Second.route)
            }
        )
    }
    composable(Second.route) {
        SecondCompose {

        }
    }
}
fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) {
        popUpTo(
            this@navigateSingleTopTo.graph.findStartDestination().id
        ) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }