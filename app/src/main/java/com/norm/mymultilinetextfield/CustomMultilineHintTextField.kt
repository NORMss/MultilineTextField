package com.norm.mymultilinetextfield

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle

@Composable
fun CustomMultilineHintTextField(
    value: String,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    hintText: String = "",
    textStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    maxLines: Int = 4,
) {
    BasicTextField(
        value = value,
        onValueChange = onValueChanged,
        textStyle = textStyle,
        minLines = maxLines,
        decorationBox = { innerTextField ->
            Box(
                modifier = modifier
            ) {
                if (value.isEmpty()) {
                    Text(
                        text = hintText,
                        color = MaterialTheme.colorScheme.onTertiaryContainer
                    )
                }
                innerTextField()
            }
        }
    )
}
