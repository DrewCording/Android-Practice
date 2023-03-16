package com.example.artspace2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ArtFrame(
    modifier: Modifier = Modifier,
    imageResource: Int,
    imageDescription: String
) {
    Image(
        modifier = modifier
            .fillMaxWidth()
            .size(400.dp)
            .border(
                color = Color.Gray,
                width = 5.dp
            )
            .background(Color.White)
            .padding(25.dp),
        contentScale = ContentScale.Crop,
        painter = painterResource(id = imageResource),
        contentDescription = imageDescription
    )
}