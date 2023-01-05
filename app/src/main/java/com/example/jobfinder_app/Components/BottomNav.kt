package com.example.jobfinder_app.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jobfinder_app.R
import com.example.jobfinder_app.ui.theme.BgColor
import com.example.jobfinder_app.ui.theme.White

//@Preview(showBackground = true)
//@Composable
//fun BottomNav() {
//    Row(
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(
//                horizontal = 10.dp,
//                vertical = 10.dp
//            )
//
//    ) {
//        Icon(
//            painter = painterResource(id = R.drawable.bt_nav_home),
//            contentDescription = null,
//            modifier = Modifier
//                .size(30.dp)
//                .clickable { },
//            tint = White
//        )
//        Icon(
//            painter = painterResource(id = R.drawable.bt_nav_like),
//            contentDescription = null,
//            modifier = Modifier
//                .size(30.dp)
//                .clickable { },
//            tint = White
//        )
//
//        Icon(
//            painter = painterResource(id = R.drawable.bt_nav_message),
//            contentDescription = null,
//            modifier = Modifier
//                .size(30.dp)
//                .clickable { },
//            tint = White
//        )
//
//        Icon(
//            painter = painterResource(id = R.drawable.bt_nav_profile),
//            contentDescription = null,
//            modifier = Modifier
//                .size(30.dp)
//                .clickable { },
//            tint = White
//        )
//
//
//    }
//}