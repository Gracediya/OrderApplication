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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
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

class Signup : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppFundamentalTheme {
                Scaffold(modifier= Modifier.fillMaxSize()) { innerPadding ->
                    Signupscreen(
                        modifier = Modifier
                        .padding(innerPadding)
                    )

                }

            }
        }
    }
}





@Composable
fun Signupscreen(modifier: Modifier= Modifier) {
    val context= LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.sig_nup),
            contentDescription = "Sign Up photo",
            modifier = Modifier
                .size(270.dp)
                .padding(10.dp)
        )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(text = "WELCOME!!", fontSize = 28.sp, color = Color(0xFF521601))
        Text(
            text = "Sign up to create your free acount and order your next meal in minutes",
            fontSize = 20.sp,
            color = Color(0xFF521601)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Column( // Nested Column for text fields
            modifier = Modifier.fillMaxWidth(), // Fill the width for text fields
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "First Name") },
                    modifier = Modifier.weight(1f).padding(8.dp)
                )

                            OutlinedTextField(value = "",
                    onValueChange = {},
                    label = { Text(text = "Last Name") },
                    modifier = Modifier.weight(1f).padding(8.dp)
                )
            }
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Email Address") },
                modifier = Modifier.fillMaxWidth().padding(8.dp)
            )

             OutlinedTextField(
                    value = "",
            onValueChange = {},
            label = { Text(text = "Password") },
            modifier = Modifier.fillMaxWidth().padding(8.dp) // Add padding
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Confirm Password") },
                modifier = Modifier.fillMaxWidth().padding(8.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Referral code (optional)") },
                modifier = Modifier.fillMaxWidth().padding(8.dp)
            )

            Button(onClick = { Toast.makeText(context,"Welcome",Toast.LENGTH_SHORT).show() },
                modifier= Modifier
                    .padding(horizontal = 50.dp),
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF3D00))
            ) {
                Text(text = "Sign up")
            }


        }
    }
}



@Preview(showBackground = true)
@Composable
fun SignupscreenscreenPreview(){
    AppFundamentalTheme{
        Signupscreen()

    }
}