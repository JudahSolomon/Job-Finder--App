package com.example.jobfinder_app.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.example.jobfinder_app.ui.theme.PrimaryTextColor


@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    text: String,
    trailingIcon: Painter? = null,
    leadingIcon: Painter? = null
) {
    OutlinedTextField(
        value = "", onValueChange = {},
        placeholder = {
            Text(
                text = text,
                color = PrimaryTextColor

            )
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = PrimaryTextColor
            )
        },
        trailingIcon = {
            if (trailingIcon != null) {

                Icon(painter = trailingIcon, contentDescription = null)

            }
        },

        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(
                color = Color.White,
                shape = RoundedCornerShape(12.dp)
            ),

        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.LightGray,
            unfocusedBorderColor = Color.White,
            cursorColor = Color.LightGray,
            trailingIconColor = Black
        )
    )
}