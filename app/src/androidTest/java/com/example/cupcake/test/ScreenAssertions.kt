package com.example.cupcake.test

import androidx.navigation.NavController
import com.example.cupcake.CupcakeScreen
import org.junit.Assert.assertEquals
import org.junit.Test

fun NavController.assertCurrentRouteName(expectedRouteName: String) {
    assertEquals(expectedRouteName, currentBackStackEntry?.destination?.route)
}