package com.finny.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColorScheme(
    primary = FinnyColors.Primary,
    onPrimary = FinnyColors.onPrimary,
    secondary = FinnyColors.Secondary,
    onSecondary = FinnyColors.onSecondary,
    tertiary = FinnyColors.Tertiary,
    onTertiary = FinnyColors.onTertiary,
    background = FinnyColors.White
)

@Composable
fun FinnyTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorPalette,
        shapes = FinnyShapes.RegularShapes,
        typography = FinnyTypography.PoppinsRegular,
        content = content
    )
}