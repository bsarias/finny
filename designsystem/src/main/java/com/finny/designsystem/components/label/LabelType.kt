package com.finny.designsystem.components.label

import androidx.compose.ui.text.TextStyle
import com.finny.designsystem.theme.FinnyTypography

sealed class LabelType(
    val textStyle: TextStyle
) {
    object DisplayLarge : LabelType(FinnyTypography.PoppinsRegular.displayLarge)
    object DisplayMedium : LabelType(FinnyTypography.PoppinsRegular.displayMedium)
    object DisplaySmall : LabelType(FinnyTypography.PoppinsRegular.displaySmall)
    object HeadlineLarge : LabelType(FinnyTypography.PoppinsRegular.headlineLarge)
    object HeadlineMedium : LabelType(FinnyTypography.PoppinsRegular.headlineMedium)
    object HeadlineSmall : LabelType(FinnyTypography.PoppinsRegular.headlineSmall)
    object TitleLarge : LabelType(FinnyTypography.PoppinsRegular.titleLarge)
    object TitleMedium : LabelType(FinnyTypography.PoppinsRegular.titleMedium)
    object TitleSmall : LabelType(FinnyTypography.PoppinsRegular.titleSmall)
    object BodyLarge : LabelType(FinnyTypography.PoppinsRegular.bodyLarge)
    object BodyMedium : LabelType(FinnyTypography.PoppinsRegular.bodyMedium)
    object BodySmall : LabelType(FinnyTypography.PoppinsRegular.bodySmall)
    object LabelLarge : LabelType(FinnyTypography.PoppinsRegular.labelLarge)
    object LabelMedium : LabelType(FinnyTypography.PoppinsRegular.labelMedium)
    object LabelSmall : LabelType(FinnyTypography.PoppinsRegular.labelSmall)
}