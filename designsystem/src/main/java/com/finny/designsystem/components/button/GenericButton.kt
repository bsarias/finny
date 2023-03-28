package com.finny.designsystem.components.button

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.finny.designsystem.components.label.Label
import com.finny.designsystem.components.label.LabelColor
import com.finny.designsystem.components.label.LabelType
import com.finny.designsystem.theme.FinnyColors
import com.finny.designsystem.theme.FinnyShapes

@Composable
internal fun GenericButton(
    text: String,
    type: ButtonType,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = FinnyShapes.RegularShapes.extraLarge,
        colors = ButtonDefaults.buttonColors(
            containerColor = type.containerColor,
            disabledContainerColor = FinnyColors.Disabled
        ),
        enabled = enabled
    ) {
        Label(
            text = text,
            labelType = LabelType.BodyMedium,
            labelColor = if (enabled) type.labelColor else LabelColor.Disabled
        )
    }
}

