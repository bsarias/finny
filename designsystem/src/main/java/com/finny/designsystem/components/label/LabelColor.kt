package com.finny.designsystem.components.label

import androidx.compose.ui.graphics.Color
import com.finny.designsystem.theme.FinnyColors

sealed class LabelColor(
    val color: Color
) {
    object Primary : LabelColor(FinnyColors.TextPrimary)
    object Secondary : LabelColor(FinnyColors.TextSecondary)
    object Success : LabelColor(FinnyColors.TextSuccess)
    object Danger : LabelColor(FinnyColors.TextDanger)
    object Warning : LabelColor(FinnyColors.TextWarning)
    object Info : LabelColor(FinnyColors.TextInfo)
    object Light : LabelColor(FinnyColors.TextLight)
}