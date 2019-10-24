package com.pratamawijaya.demojetpackcompose

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import com.pratamawijaya.demojetpackcompose.view.NewsCardItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppKerenSaya {
                NewsCardItem("Hello")
            }
        }
    }
}

@Composable
fun AppKerenSaya(child: @Composable() () -> Unit) {
    MaterialTheme {
        child()
    }
}

@Composable
fun MyScreenContent() {
    Column {
        NewsCardItem(title = "Android")
        Divider()
        NewsCardItem(title = "Droid")
    }
}


@Preview("MyScreen preview")
@Composable
fun DefaultPreview() {
    AppKerenSaya {
      MyScreenContent()
    }
}
