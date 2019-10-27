package com.pratamawijaya.demojetpackcompose

import android.app.Activity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.material.Button
import com.pratamawijaya.demojetpackcompose.composable.MyApp

class DataFlowActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyApp {
                DataFlowScreen()
            }
        }
    }
}


@Composable
fun DataFlowScreen(appState: DataScreenState = DataScreenState()) {
    Column {
        Text(text = "Halaman State")
        Counter(appState.counterState)
    }
}

@Composable
fun Counter(state: CounterState) {
    Button(text = "Saya sudah klik ${state.count} kali", onClick = {
        state.count++
    })
}

@Model
class CounterState(var count: Int = 0)

class DataScreenState(val counterState: CounterState = CounterState())