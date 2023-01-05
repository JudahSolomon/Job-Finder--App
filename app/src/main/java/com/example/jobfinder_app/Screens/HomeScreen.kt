package com.example.jobfinder_app.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jobfinder_app.Components.JobListedCard
import com.example.jobfinder_app.Components.SearchBar
import com.example.jobfinder_app.Navigation.ScreenNavigation.SoftwareEngineer
import com.example.jobfinder_app.Navigation.ScreenNavigation.UiUxDesigner
import com.example.jobfinder_app.R
import com.example.jobfinder_app.ui.theme.BgColor
import com.example.jobfinder_app.ui.theme.Black
import com.example.jobfinder_app.ui.theme.PrimaryTextColor
import com.example.jobfinder_app.ui.theme.White


@Composable
fun HomeScreen(navController: NavController) {

    val navController = rememberNavController()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BgColor)
            .padding(start = 20.dp, bottom = 100.dp)
            .padding(top = 30.dp)
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
                        text = "Good Jobs",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = "Have a nice day!",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Normal,
                        color = Black

                    )

                }

                Image(
                    painter = painterResource(id = R.drawable.character1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(height = 250.dp, width = 300.dp)
                        .weight(2f),
                    contentScale = ContentScale.Crop,

                    )
            }

            SearchBar(
                text = "Find your dream is come true",
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
                modifier = Modifier,

                ) {
                item {
                    JobListedCard(
                        "UX/UI \n" +
                                "Designer",
                        "Design",
                        "213 results",
                        onClick = {
                            navController.navigate(route = UiUxDesigner.route)

                        }
                    )
                }
                item {
                    JobListedCard(
                        "Software\n" +
                                "Engineer", "Engineering",
                        "628 results",
                        onClick = {
                            navController.navigate(route = SoftwareEngineer.route)

                        }
                    )
                }
                item {
                    JobListedCard(
                        "Telephone\n Sale", "Finance",
                        "421 results",
                        onClick = {


                        }
                    )
                }

                item {
                    JobListedCard(
                        "Graphic\n Designer", "Designer",
                        "358 results",
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
                modifier = Modifier.padding(top = 20.dp)
            )

        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                .padding(top = 20.dp, bottom = 0.dp)
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
                        modifier = Modifier.padding(top = 20.dp)
                    )

                    Text(
                        text = "View more",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Normal,
                        color = PrimaryTextColor,
                        modifier = Modifier.padding(top = 30.dp)
                    )

                }

                Spacer(modifier = Modifier.width(90.dp))

                Image(
                    painter = painterResource(id = R.drawable.character2),
                    contentDescription = null,
                    modifier = Modifier.size(height = 600.dp, width = 300.dp),
                    contentScale = ContentScale.FillHeight
                )
            }
        }
    }
}

