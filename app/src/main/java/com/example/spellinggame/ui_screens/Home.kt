package com.example.spellinggame.ui_screens

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.Style
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.spellinggame.R


@Preview(showBackground = true)
@Composable
fun Home(navController: NavController = rememberNavController())
{
    val lightBlue = Color(173, 216, 230, 200)
    val darkBrown = Color(101, 67, 33)
    Column(
        modifier = Modifier.fillMaxSize()
            .background(lightBlue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Image(
            painter = painterResource(id = R.drawable.bee_spellers_icon),
            contentDescription = "Bee Spellers Icon",
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .width(200.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop


        )
       // Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
            colors = ButtonColors(
                containerColor = darkBrown,
                contentColor = Color.White,
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.White
            )


            ){
            Text(text = "Get Started",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White,
                fontFamily = FontFamily.SansSerif
            )
                )


        }
        //////////////////////////////////
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp),
            colors = ButtonColors(
                containerColor = darkBrown,
                contentColor = Color.White,
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.White
            )


        ){
            Text(text = "Help",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif
                )
            )


        }

        //////////////////////////////////////////

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp),
            colors = ButtonColors(
                containerColor = darkBrown,
                contentColor = Color.White,
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.White
            )


        ){
            Text(text = "Exit",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif
                )
            )


        }




    }

}