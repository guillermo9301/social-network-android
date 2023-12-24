package com.ga.social_media_app.view

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun nameImputAction(name: String, onNameChange: (String) -> Unit, onAddClick: () -> Unit, modifier: Modifier = Modifier) {

    Row (
        modifier = Modifier.fillMaxWidth()
    ) {
        OutlinedTextField(
            value = name,
            onValueChange = { text ->
                onNameChange(text)
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = Color.Magenta,
                textColor = Color.Black
            ),
            modifier = Modifier
                .weight(1f)

        )
        Spacer(modifier = Modifier.width(6.dp))
        Button(onClick = {
            onAddClick()
        }) {
            Text("add")
        }
    }
}