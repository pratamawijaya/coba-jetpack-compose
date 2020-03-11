package com.pratamawijaya.demojetpackcompose.view

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.layout.*
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontFamily
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.koduok.compose.glideimage.GlideImage

@Composable
fun NewsCardItem(title: String, imgUrl: String) {
    Row {
        Container(width = 80.dp, height = 80.dp) {
            GlideImage(model = imgUrl)
        }
        Spacer(modifier = LayoutWidth(16.dp))
        Column {
            Text(
                text = title,
                style = TextStyle(fontFamily = FontFamily.SansSerif, fontSize = 18.sp)
            )
            Spacer(modifier = LayoutHeight(8.dp))
            Text(text = "Description")
        }
    }
}
