package com.example.appfundamental

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appfundamental.ui.theme.AppFundamentalTheme
import com.example.appfundamental.ui.theme.AppFundamentalTheme


@Composable
fun Loginscreen(){
    val context= LocalContext.current
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally



    ) {
        Image(
            painter = painterResource(id = R.drawable.l_ogin),
            contentDescription = "login photo",
            modifier = Modifier.size(400.dp)

        )

        Text(
            text = "welcome back",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(4.dp))


        Text(
            text = "Login to your account",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(34.dp))


        OutlinedTextField(
            value ="" ,
            onValueChange ={},
            label = { Text(text = "Email Address")}
        )

        Spacer(modifier = Modifier.height(3.dp))

        OutlinedTextField(
            value ="" ,
            onValueChange ={},
            label = { Text(text = "PassWord")}
        )

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login")
        }

        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Forgot Password?")




        }


    }
}


@Preview(showBackground = true)
@Composable
fun LoginscreenPreview(){
    AppFundamentalTheme{
        Loginscreen()

    }
}