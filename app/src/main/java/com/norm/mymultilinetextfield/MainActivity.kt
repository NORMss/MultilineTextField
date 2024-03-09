package com.norm.mymultilinetextfield

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.norm.mymultilinetextfield.ui.theme.MyMultilineTextFieldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMultilineTextFieldTheme {
                var text by remember {
                    mutableStateOf("")
                }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        CustomMultilineHintTextField(
                            value = text,
                            onValueChanged = { text = it },
                            hintText = "Pls, enter text...\nPlease...\n...",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(16))
                                .background(MaterialTheme.colorScheme.secondaryContainer)
                                .padding(16.dp),
                            maxLines = 5,
                        )
                    }
                }
            }
        }
    }
}