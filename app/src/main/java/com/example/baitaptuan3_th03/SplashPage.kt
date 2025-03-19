package com.example.baitaptuan3_th03

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.baitaptuan3_th03.ui.theme.fontFamily
import kotlinx.coroutines.delay

@Composable
fun SplashPage(navController: NavController) {
    LaunchedEffect(Unit) {
        delay(2000)
        navController.navigate("start") {
//            popUpTo("Splash") { inclusive = true } // Xóa Splash khỏi stack
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.logo_uth),
                contentDescription = "Logo UTH",
                modifier = Modifier
                    .width(120.dp)
                    .fillMaxWidth()
            )
            Text(
                text = "UTH SmartTasks",
                fontSize =35.sp,
                fontFamily = fontFamily,
                color = colorResource(R.color.text_and_indicator),
                modifier = Modifier.padding(20.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SplashPagePreview() {
    val navController = rememberNavController()
    SplashPage(navController)
}
