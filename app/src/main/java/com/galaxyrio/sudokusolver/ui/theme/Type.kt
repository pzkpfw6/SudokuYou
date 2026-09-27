package com.galaxyrio.sudokusolver.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.galaxyrio.sudokusolver.R

// 1. Declare your custom font family
val AppFont = FontFamily(
    Font(R.font.google_sans_rounded_regular)
)

// 2. Grab the default Material 3 styles to use as a baseline
private val baseline = Typography()

// 3. Override every default text style to use your new font
val Typography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = AppFont),
    displayMedium = baseline.displayMedium.copy(fontFamily = AppFont),
    displaySmall = baseline.displaySmall.copy(fontFamily = AppFont),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = AppFont),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = AppFont),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = AppFont),
    titleLarge = baseline.titleLarge.copy(fontFamily = AppFont),
    titleMedium = baseline.titleMedium.copy(fontFamily = AppFont),
    titleSmall = baseline.titleSmall.copy(fontFamily = AppFont),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = AppFont),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = AppFont),
    bodySmall = baseline.bodySmall.copy(fontFamily = AppFont),
    labelLarge = baseline.labelLarge.copy(fontFamily = AppFont),
    labelMedium = baseline.labelMedium.copy(fontFamily = AppFont),
    labelSmall = baseline.labelSmall.copy(fontFamily = AppFont)
)