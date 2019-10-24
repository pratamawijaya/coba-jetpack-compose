package com.pratamawijaya.demojetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.layout.*
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

class ComposableFunctionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sapa("Pratama")
        }
    }

}

@Composable
fun Sapa(name:String) {
    val img = +imageResource(R.drawable.zombieland)
    Column(crossAxisSize = LayoutSize.Expand, modifier = Spacing(4.dp)) {
        Container(expanded = true, height = 170.dp){
            DrawImage(image = img)
        }
        HeightSpacer(height = 16.dp)
        Text(text = "Hi $name")
        Text(text = "Text kedua")
        Text("Text ketiga")
    }

}

@Preview
@Composable
fun PreviewSapa(){
    Sapa(name = "Droid")
}