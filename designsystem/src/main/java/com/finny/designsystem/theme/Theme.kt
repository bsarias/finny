package com.finny.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColorScheme(
    primary = FinnyColors.Primary,
    onPrimary = FinnyColors.PrimaryDark,
    secondary = FinnyColors.Secondary,
    onSecondary = FinnyColors.SecondaryDark,
    background = FinnyColors.White
)

@Composable
fun FinnyTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorPalette,
        shapes = FinnyShapes.RegularShapes,
        typography = FinnyTypography.TextTypography,
        content = content
    )
}