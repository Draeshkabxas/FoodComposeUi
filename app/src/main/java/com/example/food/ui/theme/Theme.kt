package com.example.food.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


 fun getColor(colorString: String): Color {
    return Color(android.graphics.Color.parseColor("#$colorString"))
}
val green =getColor("406A52")

private val DarkColorPalette = darkColors(
    primary = green,
    primaryVariant = green,
    secondary = green
)

private val LightColorPalette = lightColors(
    primary = green,
    primaryVariant = green,
    secondary = green

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun FoodTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
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