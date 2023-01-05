package com.example.jobfinder_app.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobfinder_app.Components.JobListedCard
import com.example.jobfinder_app.Components.SearchBar
import com.example.jobfinder_app.Navigation.HomeScreenBottomNav
import com.example.jobfinder_app.R
import com.example.jobfinder_app.ui.theme.BgColor
import com.example.jobfinder_app.ui.theme.Black
import com.example.jobfinder_app.ui.theme.PrimaryTextColor
import com.example.jobfinder_app.ui.theme.White

@Preview(showBackground = true)
@Composable
fun HomeScreenUI() {

    Scaffold(
        content = {
            LazyColumn (){
                item {
                    HomeScreen()
                }
            }
        },
        bottomBar = {
            HomeScreenBottomNav()
        }
    )
}


@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BgColor)
            .padding(start = 20.dp, bottom = 10.dp)
            .padding(top = 0.dp)
    ) {

        Box(modifier = Modifier.fillMaxWidth())
        {


            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "Get Jobs",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = "Hello Kim",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Normal,
                        color = Black

                    )

                }

                Image(
                    painter = painterResource(id = R.drawable.job_search),
                    contentDescription = null,
                    modifier = Modifier
                        .size(height = 280.dp, width = 300.dp)
                        .weight(2f),
                    contentScale = ContentScale.Crop,

                    )
            }

            SearchBar(
                text = "Find your dream job",
                modifier = Modifier.padding(top = 210.dp, end = 20.dp)
            )

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 28.dp)
        ) {
            Text(
                text = "Hey! What you just find...",
                fontSize = 17.sp,
                fontWeight = FontWeight.Normal,
                color = Black,
                modifier = Modifier.padding(bottom = 20.dp)
            )

            LazyRow(

                ) {
                item {
                    JobListedCard(
                        "UX/UI \n" +
                                "Designer",
                        "Design",
                        "213 results",
                        onClick = {


                        }
                    )
                }
                item {
                    JobListedCard(
                        "Software\n" +
                                "Engineer", "Engineering",
                        "628 results",
                        onClick = {


                        }
                    )
                }
                item {

                    JobListedCard(
//                        modifier = Modifier.padding(start = 20.dp),
                        text = "Sale", job = "Finance",
                        results = "421 results",
                        onClick = {


                        }
                    )
                }

                item {
                    JobListedCard(
//                        modifier = Modifier.padding(start = 20.dp),
                        job = "Graphic\n Designer", text = "Designer",
                        results = "358 results",
                        onClick = {

                        }
                    )
                }

            }

            Text(
                text = "Suggest for you",
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                modifier = Modifier.padding(top = 10.dp)
            )

        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                .padding(end = 20.dp,)
                .background(White),
            shape = RoundedCornerShape(12.dp),
            elevation = 6.dp
        )
        {


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Text(
                        text = "More new \n" +
                                "jobs for you!",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 10.dp)
                    )

                    Text(
                        text = "View more",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Normal,
                        color = PrimaryTextColor,
                        modifier = Modifier.padding(top = 10.dp)
                    )

                }

                Spacer(modifier = Modifier.width(90.dp))

                Image(
                    painter = painterResource(id = R.drawable.character2),
                    contentDescription = null,
                    modifier = Modifier
                        .size(
                            height = 600.dp,
                            width = 300.dp
                        ),
                    contentScale = ContentScale.FillHeight
                )
            }
        }
    }
}

