package com.example.food

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Image(painter = painterResource(id = R.drawable.rectanglebg),
                            contentDescription = "food picture in background")
                        Card(
                            Modifier
                                .fillMaxWidth()
                                .padding(0.dp, 340.dp, 0.dp, 0.dp)
                                .size(393.dp, 425.dp)
                                .background(
                                    Color.White,
                                    shape = RoundedCornerShape(46.dp, 46.dp, 0.dp, 0.dp)
                                ),
                            shape = RoundedCornerShape(46.dp,46.dp,0.dp,0.dp)
                        ) {
                        Column(
                            modifier = Modifier
                                .size(285.dp, 385.dp)
                                .padding(50.dp, 0.dp,50.dp,20.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceAround
                        ){
                            Image(painter = painterResource(id = R.drawable.frame_153),
                                contentDescription = "Correct mark",
                            modifier = Modifier.size(131.dp))
                            Text(text ="Your order has been successfully processed",
                                textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = getColor("406A52"),
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                            ))
                            Text(text ="You will receive an SMS confirmation of your order shortly.",
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                    color = getColor("406A52"),
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 13.sp,
                                ))
                            Button(
                                modifier = Modifier
                                    .padding(20.dp,10.dp,20.dp,0.dp)
                                    .fillMaxWidth()
                                ,
                                shape = RoundedCornerShape(46.dp),
                                onClick = { /*TODO*/ }) {
                                Text(text = "To Main Menu",
                                textAlign = TextAlign.Center,
                                    style= TextStyle(
                                        color=Color.White,
                                        fontWeight = FontWeight.ExtraBold,
                                        fontSize = 15.sp
                                    )
                                    )
                            }

                        }
                        }

                    }
                }
            }
        }
    }

}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FoodTheme {
        Greeting("Android")
    }
}