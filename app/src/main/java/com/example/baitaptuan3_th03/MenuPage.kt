package com.example.baitaptuan3_th03

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun MenuPage(navController: NavController) {
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(top = 50.dp, bottom = 30.dp),
        verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(R.drawable.logo_uth),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(200.dp),

                )
            Text(
                "Started",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth().padding(20.dp),
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
            )
            Button(
                onClick = {
                    navController.navigate("start")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.btn)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp)

            ) {
                Text(
                    "Back to start screen",
                    modifier = Modifier
                        .padding(10.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
}

@Preview (showBackground = true)
@Composable
fun MenuPagePreview () {
    val navController = rememberNavController()
    MenuPage(navController)
}