package com.finny.designsystem.components.label

import androidx.compose.ui.graphics.Color
import com.finny.designsystem.theme.FinnyColors

sealed class LabelColor(
    val color: Color
) {
    object Primary : LabelColor(FinnyColors.TextPrimary)
    object Disabled : LabelColor(FinnyColors.onDisabled)
    object Success : LabelColor(FinnyColors.Success)
    object Danger : LabelColor(FinnyColors.Danger)
    object Warning : LabelColor(FinnyColors.Warning)
    object Info : LabelColor(FinnyColors.Info)
    object Light : LabelColor(FinnyColors.Light)
}