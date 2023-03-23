package com.finny.designsystem.components.label

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.finny.designsystem.theme.FinnyTheme

@Composable
fun Label(
    text: String,
    labelType: LabelType,
    labelColor: LabelColor,
    modifier: Modifier = Modifier,
    fontWeight: FontWeight = FontWeight.Normal,
    fontStyle: FontStyle = FontStyle.Normal,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        text = text,
        modifier = modifier,
        style = labelType.textStyle,
        fontWeight = fontWeight,
        fontStyle = fontStyle,
        color = labelColor.color,
        textAlign = textAlign,
        maxLines = maxLines
    )
}

@Preview
@Composable
fun PreviewLabel() {
    FinnyTheme {
        Column {
            Label(
                text = "Gino lo mama",
                LabelType.DisplayLarge,
                LabelColor.Primary,
                fontStyle = FontStyle.Italic
            )
            Label(
                text = "Gino lo mama",
                LabelType.LabelSmall,
                LabelColor.Warning,
                fontWeight = FontWeight.Bold
            )
        }
    }
}


