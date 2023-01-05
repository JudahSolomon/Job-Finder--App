package com.example.jobfinder_app.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobfinder_app.Components.JobCard
import com.example.jobfinder_app.Components.SearchBar
import com.example.jobfinder_app.R
import com.example.jobfinder_app.ui.theme.BgColor
import com.example.jobfinder_app.ui.theme.Black
import com.example.jobfinder_app.ui.theme.ButtonBg
import com.example.jobfinder_app.ui.theme.White


@Preview(showBackground = true)
@Composable
fun FindDreamJob() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BgColor)
            .padding(horizontal = 20.dp)
            .padding(top = 30.dp)
    ) {

        Box(modifier = Modifier.fillMaxWidth()) {


            Surface(
                shape = RoundedCornerShape(12.dp),
                elevation = 6.dp,
                color = ButtonBg,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(190.dp)
                    .padding(top = 20.dp)

            )
            {


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    Column(horizontalAlignment = Alignment.Start)
                    {
                        Text(
                            text = "Find your\n" +
                                    "dream Job",
                            fontSize = 34.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = White,
                            modifier = Modifier
                                .padding(top = 20.dp, bottom = 30.dp)
                        )
                    }


//                Image(
//                    painter = painterResource(id = R.drawable.pattern),
//                    contentDescription = null,
//                    modifier = Modifier.size(300.dp),
//                    contentScale = ContentScale.Crop
//                )
                }
            }

            SearchBar(
                text = "UX/UI Designer",
                modifier = Modifier
                    .padding(
                        top = 160.dp,
                        start = 10.dp, end = 10.dp
                    ),
//                trailingIcon = painterResource(id = R.drawable.close)
            )

        }

        Text(
            text = "Hey! See what we find for you...",
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            color = Black,
            modifier = Modifier.padding(bottom = 20.dp, top = 30.dp)
        )

        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(vertical = 10.dp)
        ) {
            item {
//
                JobCard(
                    companyLogo = R.drawable.figma_logo,
                    companyName = "Figma.Co",
                    payment = "$32/h",
                    field = "Marketing"
                )

            }

            //
            item {
//
                JobCard(
                    companyLogo = R.drawable.spotify_logo,
                    companyName = "Spotify",
                    payment = "$30/h",
                    field = "Technical"
                )

            }

            //

            item {
//
                JobCard(
                    companyLogo = R.drawable.slack_logo,
                    companyName = "Slack Technologies",
                    payment = "$32/h",
                    field = "Marketing"
                )

            }
            //

            item {
//
                JobCard(
                    companyLogo = R.drawable.trello_logo,
                    companyName = "Trello",
                    payment = "$17/h",
                    field = "Technical"
                )

            }

            item {
//
                JobCard(
                    companyLogo = R.drawable.slack_logo,
                    companyName = "Slack Technologies",
                    payment = "$32/h",
                    field = "Marketing"
                )

            }
            //

            item {
//
                JobCard(
                    companyLogo = R.drawable.trello_logo,
                    companyName = "Trello",
                    payment = "$17/h",
                    field = "Technical"
                )

            }


        }
    }
}
