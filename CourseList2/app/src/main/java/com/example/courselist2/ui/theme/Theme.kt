package com.example.courselist2.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

@SuppressLint("ConflictingOnColor")
private val DarkColorPalette = darkColors(
    background = Grey900,
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200,
    surface = Grey800,
    onSurface = Grey100
)

private val LightColorPalette = lightColors(
    background = Grey50,
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200
)

@Composable
fun CourseList2Theme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}