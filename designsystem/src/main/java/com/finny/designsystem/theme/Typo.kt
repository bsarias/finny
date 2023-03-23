package com.finny.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object FinnyTypography {
    val PoppinsRegular = Typography(
        displayLarge = FinnyTypographyStyles.DisplayLarge,
        displayMedium = FinnyTypographyStyles.DisplayMedium,
        displaySmall = FinnyTypographyStyles.DisplaySmall,
        headlineLarge = FinnyTypographyStyles.HeadlineLarge,
        headlineMedium = FinnyTypographyStyles.HeadlineMedium,
        headlineSmall = FinnyTypographyStyles.HeadlineSmall,
        titleLarge = FinnyTypographyStyles.TitleLarge,
        titleMedium = FinnyTypographyStyles.TitleMedium,
        titleSmall = FinnyTypographyStyles.TitleSmall,
        bodyLarge = FinnyTypographyStyles.BodyLarge,
        bodyMedium = FinnyTypographyStyles.BodyMedium,
        bodySmall = FinnyTypographyStyles.BodySmall,
        labelLarge = FinnyTypographyStyles.LabelLarge,
        labelMedium = FinnyTypographyStyles.LabelMedium,
        labelSmall = FinnyTypographyStyles.LabelSmall,
    )
}

private object FinnyTypographyStyles {
    val BodyLarge =
        TextStyle(
            fontFamily = FinnyFontConstants.BodyLargeFont,
            fontWeight = FinnyFontConstants.BodyLargeWeight,
            fontSize = FinnyFontConstants.BodyLargeSize,
            lineHeight = FinnyFontConstants.BodyLargeLineHeight,
            letterSpacing = FinnyFontConstants.BodyLargeTracking,
        )
    val BodyMedium =
        TextStyle(
            fontFamily = FinnyFontConstants.BodyMediumFont,
            fontWeight = FinnyFontConstants.BodyMediumWeight,
            fontSize = FinnyFontConstants.BodyMediumSize,
            lineHeight = FinnyFontConstants.BodyMediumLineHeight,
            letterSpacing = FinnyFontConstants.BodyMediumTracking,
        )
    val BodySmall =
        TextStyle(
            fontFamily = FinnyFontConstants.BodySmallFont,
            fontWeight = FinnyFontConstants.BodySmallWeight,
            fontSize = FinnyFontConstants.BodySmallSize,
            lineHeight = FinnyFontConstants.BodySmallLineHeight,
            letterSpacing = FinnyFontConstants.BodySmallTracking,
        )
    val DisplayLarge =
        TextStyle(
            fontFamily = FinnyFontConstants.DisplayLargeFont,
            fontWeight = FinnyFontConstants.DisplayLargeWeight,
            fontSize = FinnyFontConstants.DisplayLargeSize,
            lineHeight = FinnyFontConstants.DisplayLargeLineHeight,
            letterSpacing = FinnyFontConstants.DisplayLargeTracking,
        )
    val DisplayMedium =
        TextStyle(
            fontFamily = FinnyFontConstants.DisplayMediumFont,
            fontWeight = FinnyFontConstants.DisplayMediumWeight,
            fontSize = FinnyFontConstants.DisplayMediumSize,
            lineHeight = FinnyFontConstants.DisplayMediumLineHeight,
            letterSpacing = FinnyFontConstants.DisplayMediumTracking,
        )
    val DisplaySmall =
        TextStyle(
            fontFamily = FinnyFontConstants.DisplaySmallFont,
            fontWeight = FinnyFontConstants.DisplaySmallWeight,
            fontSize = FinnyFontConstants.DisplaySmallSize,
            lineHeight = FinnyFontConstants.DisplaySmallLineHeight,
            letterSpacing = FinnyFontConstants.DisplaySmallTracking,
        )
    val HeadlineLarge =
        TextStyle(
            fontFamily = FinnyFontConstants.HeadlineLargeFont,
            fontWeight = FinnyFontConstants.HeadlineLargeWeight,
            fontSize = FinnyFontConstants.HeadlineLargeSize,
            lineHeight = FinnyFontConstants.HeadlineLargeLineHeight,
            letterSpacing = FinnyFontConstants.HeadlineLargeTracking,
        )
    val HeadlineMedium =
        TextStyle(
            fontFamily = FinnyFontConstants.HeadlineMediumFont,
            fontWeight = FinnyFontConstants.HeadlineMediumWeight,
            fontSize = FinnyFontConstants.HeadlineMediumSize,
            lineHeight = FinnyFontConstants.HeadlineMediumLineHeight,
            letterSpacing = FinnyFontConstants.HeadlineMediumTracking,
        )
    val HeadlineSmall =
        TextStyle(
            fontFamily = FinnyFontConstants.HeadlineSmallFont,
            fontWeight = FinnyFontConstants.HeadlineSmallWeight,
            fontSize = FinnyFontConstants.HeadlineSmallSize,
            lineHeight = FinnyFontConstants.HeadlineSmallLineHeight,
            letterSpacing = FinnyFontConstants.HeadlineSmallTracking,
        )
    val LabelLarge =
        TextStyle(
            fontFamily = FinnyFontConstants.LabelLargeFont,
            fontWeight = FinnyFontConstants.LabelLargeWeight,
            fontSize = FinnyFontConstants.LabelLargeSize,
            lineHeight = FinnyFontConstants.LabelLargeLineHeight,
            letterSpacing = FinnyFontConstants.LabelLargeTracking,
        )
    val LabelMedium =
        TextStyle(
            fontFamily = FinnyFontConstants.LabelMediumFont,
            fontWeight = FinnyFontConstants.LabelMediumWeight,
            fontSize = FinnyFontConstants.LabelMediumSize,
            lineHeight = FinnyFontConstants.LabelMediumLineHeight,
            letterSpacing = FinnyFontConstants.LabelMediumTracking,
        )
    val LabelSmall =
        TextStyle(
            fontFamily = FinnyFontConstants.LabelSmallFont,
            fontWeight = FinnyFontConstants.LabelSmallWeight,
            fontSize = FinnyFontConstants.LabelSmallSize,
            lineHeight = FinnyFontConstants.LabelSmallLineHeight,
            letterSpacing = FinnyFontConstants.LabelSmallTracking,
        )
    val TitleLarge =
        TextStyle(
            fontFamily = FinnyFontConstants.TitleLargeFont,
            fontWeight = FinnyFontConstants.TitleLargeWeight,
            fontSize = FinnyFontConstants.TitleLargeSize,
            lineHeight = FinnyFontConstants.TitleLargeLineHeight,
            letterSpacing = FinnyFontConstants.TitleLargeTracking,
        )
    val TitleMedium =
        TextStyle(
            fontFamily = FinnyFontConstants.TitleMediumFont,
            fontWeight = FinnyFontConstants.TitleMediumWeight,
            fontSize = FinnyFontConstants.TitleMediumSize,
            lineHeight = FinnyFontConstants.TitleMediumLineHeight,
            letterSpacing = FinnyFontConstants.TitleMediumTracking,
        )
    val TitleSmall =
        TextStyle(
            fontFamily = FinnyFontConstants.TitleSmallFont,
            fontWeight = FinnyFontConstants.TitleSmallWeight,
            fontSize = FinnyFontConstants.TitleSmallSize,
            lineHeight = FinnyFontConstants.TitleSmallLineHeight,
            letterSpacing = FinnyFontConstants.TitleSmallTracking,
        )
}

private object FinnyFontConstants {
    val BodyLargeFont = FinnyFonts.Poppins
    val BodyLargeLineHeight = 24.0.sp
    val BodyLargeSize = 16.sp
    val BodyLargeTracking = 0.5.sp
    val BodyLargeWeight = FontWeight.Normal
    val BodyMediumFont = FinnyFonts.Poppins
    val BodyMediumLineHeight = 20.0.sp
    val BodyMediumSize = 14.sp
    val BodyMediumTracking = 0.2.sp
    val BodyMediumWeight = FontWeight.Normal
    val BodySmallFont = FinnyFonts.Poppins
    val BodySmallLineHeight = 16.0.sp
    val BodySmallSize = 12.sp
    val BodySmallTracking = 0.4.sp
    val BodySmallWeight = FontWeight.Normal
    val DisplayLargeFont = FinnyFonts.Poppins
    val DisplayLargeLineHeight = 64.0.sp
    val DisplayLargeSize = 57.sp
    val DisplayLargeTracking = (-0.2).sp
    val DisplayLargeWeight = FontWeight.Normal
    val DisplayMediumFont = FinnyFonts.Poppins
    val DisplayMediumLineHeight = 52.0.sp
    val DisplayMediumSize = 45.sp
    val DisplayMediumTracking = 0.0.sp
    val DisplayMediumWeight = FontWeight.Normal
    val DisplaySmallFont = FinnyFonts.Poppins
    val DisplaySmallLineHeight = 44.0.sp
    val DisplaySmallSize = 36.sp
    val DisplaySmallTracking = 0.0.sp
    val DisplaySmallWeight = FontWeight.Normal
    val HeadlineLargeFont = FinnyFonts.Poppins
    val HeadlineLargeLineHeight = 40.0.sp
    val HeadlineLargeSize = 32.sp
    val HeadlineLargeTracking = 0.0.sp
    val HeadlineLargeWeight = FontWeight.Normal
    val HeadlineMediumFont = FinnyFonts.Poppins
    val HeadlineMediumLineHeight = 36.0.sp
    val HeadlineMediumSize = 28.sp
    val HeadlineMediumTracking = 0.0.sp
    val HeadlineMediumWeight = FontWeight.Normal
    val HeadlineSmallFont = FinnyFonts.Poppins
    val HeadlineSmallLineHeight = 32.0.sp
    val HeadlineSmallSize = 24.sp
    val HeadlineSmallTracking = 0.0.sp
    val HeadlineSmallWeight = FontWeight.Normal
    val LabelLargeFont = FinnyFonts.Poppins
    val LabelLargeLineHeight = 20.0.sp
    val LabelLargeSize = 14.sp
    val LabelLargeTracking = 0.1.sp
    val LabelLargeWeight = FontWeight.Medium
    val LabelMediumFont = FinnyFonts.Poppins
    val LabelMediumLineHeight = 16.0.sp
    val LabelMediumSize = 12.sp
    val LabelMediumTracking = 0.5.sp
    val LabelMediumWeight = FontWeight.Medium
    val LabelSmallFont = FinnyFonts.Poppins
    val LabelSmallLineHeight = 16.0.sp
    val LabelSmallSize = 11.sp
    val LabelSmallTracking = 0.5.sp
    val LabelSmallWeight = FontWeight.Medium
    val TitleLargeFont = FinnyFonts.Poppins
    val TitleLargeLineHeight = 28.0.sp
    val TitleLargeSize = 22.sp
    val TitleLargeTracking = 0.0.sp
    val TitleLargeWeight = FontWeight.Normal
    val TitleMediumFont = FinnyFonts.Poppins
    val TitleMediumLineHeight = 24.0.sp
    val TitleMediumSize = 16.sp
    val TitleMediumTracking = 0.2.sp
    val TitleMediumWeight = FontWeight.Medium
    val TitleSmallFont = FinnyFonts.Poppins
    val TitleSmallLineHeight = 20.0.sp
    val TitleSmallSize = 14.sp
    val TitleSmallTracking = 0.1.sp
    val TitleSmallWeight = FontWeight.Medium
}