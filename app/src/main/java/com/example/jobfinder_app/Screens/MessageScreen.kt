package com.example.jobfinder_app.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jobfinder_app.ui.theme.Black

@Preview(showBackground = true)
@Composable
fun MessageScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Message Screen Under Construction",
            fontSize = 34.sp,
            textAlign = TextAlign.Center,
            color = Black,
            fontWeight = FontWeight.Bold
        )
    }
}