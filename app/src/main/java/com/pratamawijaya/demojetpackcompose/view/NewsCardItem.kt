package com.pratamawijaya.demojetpackcompose.view

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Modifier
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Image
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.HeightSpacer
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import com.pratamawijaya.demojetpackcompose.R

@Composable
fun NewsCardItem(title: String) {
    val img = +imageResource(R.drawable.zombieland)
    Column {
        Container(expanded = true, height = 170.dp) {
            Clip(shape = RoundedCornerShape(8.dp)) {
                DrawImage(image = img)
            }
        }
        HeightSpacer(height = 16.dp)
        Text(text = title)
        HeightSpacer(height = 16.dp)
    }

}


@Preview
@Composable
fun previewNewsCardItem() {
    NewsCardItem(title = "John Snow Menang")
}