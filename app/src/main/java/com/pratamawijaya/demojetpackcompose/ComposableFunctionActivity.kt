package com.pratamawijaya.demojetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.tooling.preview.Preview
import com.pratamawijaya.demojetpackcompose.composable.MyApp

class ComposableFunctionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                Sapa("Pratama")
            }
        }
    }
}

@Composable
fun Sapa(name: String) {
//    val img = +imageResource(R.drawable.zombieland)
//        Column(crossAxisSize = LayoutSize.Expand, modifier = Spacing(4.dp)) {
//            Container(expanded = true, height = 170.dp) {
//                Clip(shape = RoundedCornerShape(8.dp)) {
//                    DrawImage(image = img)
//                }
//            }
//            HeightSpacer(height = 16.dp)
//            Text(text = "Hi $name", style = +themeTextStyle { h6 })
//            Text(text = "Text kedua", style = +themeTextStyle { body2 })
//            Text("Text ketiga")
//        }
}

@Preview
@Composable
fun PreviewSapa() {
    Sapa(name = "Droid")
}