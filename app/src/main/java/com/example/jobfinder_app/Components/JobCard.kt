package com.example.jobfinder_app.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobfinder_app.ui.theme.Black
import com.example.jobfinder_app.ui.theme.White


@Composable
fun JobCard(
    modifier: Modifier = Modifier,
    companyLogo: Int,
    companyName: String,
    payment: String,
    field: String,

    ) {
    Surface(
        shape = RoundedCornerShape(12.dp),
        elevation = 2.dp,
        color = White,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp)


    )
    {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp, horizontal = 20.dp)

        ) {


            Image(
                painterResource(id = companyLogo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .size(70.dp)
                    .padding(10.dp)
            )


            Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

                Text(
                    text = companyName,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Black,
                )

                JobCategoryButton(text = field)
            }

            Text(
                text = payment.toString(),
                fontSize = 13.sp,
                fontWeight = FontWeight.Normal,
                color = Black,

                )

        }
    }
}