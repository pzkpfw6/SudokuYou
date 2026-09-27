
package com.galaxyrio.sudokusolver.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
// Important: Import the R class to access res/font/
import com.galaxyrio.sudokusolver.R 

// 1. Declare your custom font
val CustomFont = FontFamily(
    Font(R.google_sans_rounded_regular)
)

// 2. Fetch the default Material 3 typography
val defaultTypography = Typography()

// 3. Override all styles to use your custom font
val Typography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = CustomFont),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = CustomFont),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = CustomFont),
    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = CustomFont),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = CustomFont),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = CustomFont),
    titleLarge = defaultTypography.titleLarge.copy(fontFamily = CustomFont),
    titleMedium =
