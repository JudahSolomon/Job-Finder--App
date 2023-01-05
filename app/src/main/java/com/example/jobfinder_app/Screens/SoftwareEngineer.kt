package com.example.jobfinder_app.Screens.Ux

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobfinder_app.Components.JobCategoryButton
import com.example.jobfinder_app.R
import com.example.jobfinder_app.ui.theme.*

@Preview(showBackground = true)
@Composable
fun SoftwareEngineer() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BgColor)
    ) {

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .background(White),
            shape = RoundedCornerShape(20.dp),
            elevation = 5.dp

        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(top = 30.dp)

            ) {
                Text(
                    text = "UX/UI Designer",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Black,
                )

                Image(
                    painter = painterResource(id = R.drawable.slack_logo),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(60.dp)
                )


            }

            Row(
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(top = 120.dp)

            ) {
                JobCategoryButton(text = "Engineering")

                Text(
                    text = "10 May 2020 ",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = Black,
                    modifier = Modifier.padding(start = 20.dp, top = 20.dp, end = 80.dp)
                )


                Icon(
                    painter = painterResource(id = R.drawable.bt_nav_like),
                    contentDescription = null,
                    tint = PrimaryTextColor,
                    modifier = Modifier
                        .size(60.dp)
                        .padding(top = 20.dp)
                )
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(top = 220.dp, bottom = 30.dp),
                shape = RoundedCornerShape(12.dp),
                backgroundColor = BgColor
            ) {

                Row() {
                    Column {
                        Text(
                            text = "$50",
                            fontSize = 35.sp,
                            fontWeight = FontWeight.Bold,
                            color = Black,
                            modifier = Modifier
                                .padding(start = 20.dp, top = 20.dp, end = 80.dp)
                        )

                        Text(
                            text = "20 March 2020 ",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryTextColor,
                            modifier = Modifier.padding(start = 20.dp, top = 40.dp, end = 80.dp)
                        )
                    }

                    Image(
                        painter = painterResource(id = R.drawable.character3),
                        contentDescription = null,
                        modifier = Modifier
                            .size(height = 250.dp, width = 300.dp)
                            .weight(2f),
                        contentScale = ContentScale.Crop,

                        )
                }

            }

        }

        Column(

            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 30.dp,
                    vertical = 20.dp,
                ),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.job_descripton),
                fontSize = 14.sp,
                lineHeight = 23.sp,
                letterSpacing = (-0.05).sp
            )

            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = ButtonBg,
                    contentColor = White
                ),
                modifier = Modifier
                    .padding(top = 40.dp)
                    .padding(horizontal = 20.dp)
                    .fillMaxWidth()
                    .heightIn(56.dp),
                shape = RoundedCornerShape(12.dp)
            ) {

                Text(
                    text = "Apply",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Black,
                )
            }
        }
    }
}