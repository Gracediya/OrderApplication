package com.example.appfundamental

import android.content.Context
import android.os.Bundle
import android.view.View.OnCreateContextMenuListener
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appfundamental.ui.theme.AppFundamentalTheme
import com.example.appfundamental.ui.theme.AppFundamentalTheme

class Upperpane : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppFundamentalTheme {
                Scaffold(modifier= Modifier.fillMaxSize()){ innerPadding->
                    RestaurantDetails(
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }

            }
        }
    }
}


@Composable
fun RestaurantDetails(modifier: Modifier = Modifier) {
    val context= LocalContext.current
    Column(
        verticalArrangement= Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0x05FF3D00))

    ){
        Image(
            painter = painterResource(id = R.drawable.big_bite),
            contentDescription = "bigbite logo",
            Modifier
                .height(300.dp)
                .width(200.dp)
                .size(100.dp)
        )

        Spacer(modifier = modifier.height(2.dp))

        Text(
            text="Order",
            fontSize = 35.sp,
            color = Color(0xFF3C1001)
        )

        Spacer(modifier = modifier.height(3.dp))

        Text(

            text = stringResource(id = R.string.Location),
            fontSize = 25.sp,
            color = Color(0xFF3C1001),

            )

        Spacer(modifier = modifier.height(40.dp))

        Button(onClick = { Toast.makeText(context,"Order successful",Toast.LENGTH_SHORT).show() },
            modifier= Modifier
                .padding(horizontal = 50.dp),
            shape = RoundedCornerShape(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF3D00))
        ) {
            Text(text = stringResource(id = R.string.Order))
        }



    }
}


@Preview(showBackground = true)
@Composable
fun RestaurantDetailsPreview(){
    AppFundamentalTheme {

   RestaurantDetails()
    }



}