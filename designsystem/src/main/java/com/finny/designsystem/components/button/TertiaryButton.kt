package com.finny.designsystem.components.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.finny.designsystem.theme.FinnyColors
import com.finny.designsystem.theme.FinnyTheme

@Composable
fun TertiaryButton(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    GenericButton(
        text = text,
        type = ButtonType.Tertiary,
        modifier = modifier,
        enabled = enabled,
        onClick = onClick
    )
}

@Preview
@Composable
fun PreviewTertiaryButton() {
    FinnyTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 5.dp, end = 5.dp)
                .background(FinnyColors.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            TertiaryButton(
                text = "Button example",
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .fillMaxWidth(),
            ) {}
            TertiaryButton(
                text = "Button example",
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .fillMaxWidth(),
                enabled = false
            ) {}
        }
    }
}