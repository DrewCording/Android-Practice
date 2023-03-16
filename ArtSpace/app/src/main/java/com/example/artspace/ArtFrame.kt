package com.example.artspace


import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun ArtFrame(
    imageResource: Int,
    imageDescription: String
) {
    Image(
        painter = painterResource(id = imageResource),
        contentDescription = imageDescription
    )
}