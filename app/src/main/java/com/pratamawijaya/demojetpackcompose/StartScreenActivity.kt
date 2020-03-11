package com.pratamawijaya.demojetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.core.content.ContextCompat.startActivity
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.material.Button

class StartScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

        }
    }
}

@Composable
fun StartScreen(){
    Column {
        Button(onClick = {

        }) {
        }
//        Button(text = "Data Flow", onClick = {
//
//        })
    }
}

//@Composable
//fun StartScreen()) {
//    Column {
//        Text(text = "Halaman State")
//        Counter(appState.counterState)
//    }
//}
