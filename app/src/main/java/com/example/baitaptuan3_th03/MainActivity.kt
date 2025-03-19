package com.example.baitaptuan3_th03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.baitaptuan3_th03.ui.theme.Baitaptuan3_TH03Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Baitaptuan3_TH03Theme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "splash") {
                    composable(route = "splash") { SplashPage(navController)}
                    composable(route = "start") { StartPage(navController) }
                    composable(route = "second") { Secondpage(navController) }
                    composable(route = "last") { LastPage(navController) }
                    composable(route = "menu") { MenuPage(navController) }
                }
            }

        }
    }
}

@Composable
fun StartPage(navController: NavController) {
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
            Indicate()

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
                painter = painterResource(R.drawable.first_page),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(200.dp),

                )
            Text(
                "Easy Time Management",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth().padding(20.dp),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                "With management based on priority and daily tasks, it will give you convenience in managing and determining the tasks that must be done first ",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                fontSize = 15.sp,
            )

        }
        Button(
            onClick = {
                navController.navigate("second")
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.btn)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(
                "Next",
                modifier = Modifier
                    .padding(8.dp),
                fontSize = 20.sp,
            )
        }
    }

}

@Composable
fun Indicate() {
    Row (modifier = Modifier.wrapContentSize())
    {
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

        Box(modifier = Modifier
            .padding(2.dp)
            .height(10.dp)
            .width(10.dp)
            .clip(CircleShape)
            .background(Color.Gray)
        )
    }

}
@Preview (showBackground = true)
@Composable
fun StartPagePreview() {
    val navController = rememberNavController()
    StartPage(navController)
}