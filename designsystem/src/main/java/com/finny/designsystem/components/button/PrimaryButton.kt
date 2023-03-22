package com.finny.designsystem.components.button

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.finny.designsystem.theme.FinnyTheme

@Composable
fun PrimaryButton(
    onClick: () -> Unit
) {
    Button(
        onClick = onClick
    ) {
        Text(text = "Botoncito")
    }
}

@Preview
@Composable
fun Example() {
    FinnyTheme {
        PrimaryButton {

        }
    }
}

