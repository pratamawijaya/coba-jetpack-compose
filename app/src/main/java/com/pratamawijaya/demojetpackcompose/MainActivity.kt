package com.pratamawijaya.demojetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.AdapterList
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.unit.dp
import com.pratamawijaya.demojetpackcompose.view.NewsCardItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppKerenSaya {
                CreateListView()
            }
        }
    }
}

@Composable
fun CreateListWithAdapter() {
    val img = "https://picsum.photos/200"
    AdapterList(data = listOf("Hello", "anda", "namanya", "siapa")) {
        NewsCardItem(title = it, imgUrl = img)
    }
}

@Composable
fun CreateListView() {
    val img = "https://picsum.photos/200"
    VerticalScroller {
        Column {
            (0..10).forEach { _ ->
                NewsCardItem(title = "Jon Snow", imgUrl = img)
                Divider(color = Color.Black, height = 2.dp)
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