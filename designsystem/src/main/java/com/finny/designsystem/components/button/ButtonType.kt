package com.finny.designsystem.components.button

import androidx.compose.ui.graphics.Color
import com.finny.designsystem.components.label.LabelColor
import com.finny.designsystem.theme.FinnyColors

sealed class ButtonType(
    val containerColor: Color,
    val labelColor: LabelColor
) {
    object Primary : ButtonType(FinnyColors.Primary, LabelColor.Light)
    object Secondary : ButtonType(FinnyColors.Secondary, LabelColor.Light)
    object Tertiary : ButtonType(FinnyColors.Tertiary, LabelColor.Light)
}