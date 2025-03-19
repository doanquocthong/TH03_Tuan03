package com.example.baitaptuan3_th03

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun LastPage(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 50.dp, bottom = 30.dp),
        verticalArrangement = Arrangement.SpaceBetween) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Indicate2()
            Text(
                "skip",
                fontSize = 15.sp,
                color = colorResource(R.color.text_and_indicator),
                modifier = Modifier
                    .clickable {
                        navController.navigate("menu")
                    }

            )
        }
        Column (
            modifier = Modifier
                .fillMaxWidth(),
        ){
            Image(
                painter = painterResource(R.drawable.third_page),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(200.dp),

                )
            Text(
                "Reminder Notification",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth().padding(20.dp),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                "The advantage of this application is that it also provides reminders for you so you don't forget to keep doing your assignments well and according to the time you have set",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth().padding(start = 30.dp, end = 30.dp),
                fontSize = 15.sp,
            )

        }
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Button(
                onClick = {
                    navController.popBackStack()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.btn)
                ),
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.baseline_arrow_back_24),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)

                )
            }
            Button(
                onClick = {
                    navController.navigate("menu")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.btn)
                ),
                modifier = Modifier
                    .padding(10.dp)
                    .weight(1f)
            ) {
                Text(
                    "Get Started",
                    modifier = Modifier
                        .padding(8.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

    }

}

@Composable
fun Indicate2() {
    Row (modifier = Modifier.wrapContentSize())
    {
        Box(modifier = Modifier
            .padding(2.dp)
            .height(10.dp)
            .width(10.dp)
            .clip(CircleShape)
            .background(Color.Gray)
        )

        Box(modifier = Modifier
            .padding(2.dp)
            .height(10.dp)
            .width(10.dp)
            .clip(CircleShape)
            .background(colorResource(R.color.text_and_indicator))
        )

        Box(modifier = Modifier
            .padding(2.dp)
            .height(10.dp)
            .width(10.dp)
            .clip(CircleShape)
            .background(Color.Gray)
        )
    }

}