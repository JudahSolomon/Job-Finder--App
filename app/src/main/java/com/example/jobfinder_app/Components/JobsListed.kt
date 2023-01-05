package com.example.jobfinder_app.Components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.jobfinder_app.ui.theme.ButtonBg
import com.example.jobfinder_app.ui.theme.PrimaryTextColor
import com.example.jobfinder_app.ui.theme.White

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun JobListedCard(
    job: String,
    text: String,
    results: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,

    ) {
    val navController = rememberNavController()


    Card(
        modifier = modifier
            .size(width = 170.dp, height = 186.dp)
            .padding(start = 20.dp),

        shape = RoundedCornerShape(12.dp),

    ) {
        Column(
            modifier = modifier.padding(start = 20.dp, top = 10.dp)
        ) {
            Text(
                text = job,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )

            JobCategoryButton(text)

            Text(
                text = results,
                fontSize = 13.sp,
                fontWeight = FontWeight.Normal,
                color = PrimaryTextColor,
                modifier = modifier.padding(top = 50.dp)
            )

        }
    }
}

@Composable
fun JobCategoryButton(
    text: String
) {
    Button(
        onClick = {

        },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = ButtonBg,
            contentColor = Color.White
        ),
        modifier = Modifier.padding(top = 10.dp),
        shape = RoundedCornerShape(12.dp)
    ) {

        Text(
            text = text,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            color = White,
        )
    }

}