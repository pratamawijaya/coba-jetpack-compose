package com.pratamawijaya.demojetpackcompose.composable

import androidx.compose.Composable
import androidx.ui.material.MaterialTheme

@Composable
fun MyApp(child: @Composable() () -> Unit) {
    MaterialTheme {
        child()
    }
}