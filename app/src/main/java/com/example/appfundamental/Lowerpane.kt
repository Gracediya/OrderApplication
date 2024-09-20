package com.example.appfundamental

import android.os.Bundle
import android.view.View.OnCreateContextMenuListener
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
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appfundamental.ui.theme.AppFundamentalTheme
import com.example.appfundamental.ui.theme.AppFundamentalTheme

class Lowerpane : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppFundamentalTheme {
                Scaffold(modifier=Modifier.fillMaxSize()){innerPadding->
                    WeeklySpecialCard(
                        modifier = Modifier
                            .padding(innerPadding)
                    )

                    MenuDish()

                }

            }
        }
    }
}

@Composable
fun WeeklySpecialCard( modifier: Modifier=Modifier) {
    Card(modifier = modifier.padding(16.dp)){
        Column(Modifier.fillMaxWidth()) {
            Text(
                text = "Weekly Special",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier
                    .padding(8.dp)

            )

        }
    }
}

@Composable
fun MenuDish(modifier: Modifier=Modifier) {
    Card(modifier = modifier.padding(16.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column {
                Text(
                    text = "Semo and Efo Riro",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = "The famous traditional food of the Yoruba people of South-West Nigeria.",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(.75f)
                )
                Text(
                    text = "N10,000",
                    color = Color.DarkGray,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.width(20.dp))

            Image(
                painter = painterResource(id = R.drawable.efo_riro),
                contentDescription = "Efo Riro",
                Modifier
                    .height(105.dp)
                    .clip(AbsoluteRoundedCornerShape(50.dp))
                    .size(500.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun WeeklySpecialCardPreview(){
    AppFundamentalTheme {
        WeeklySpecialCard()
    }
}



@Preview(showBackground = true)
@Composable
fun MenuDishPreview(){
    AppFundamentalTheme {
        MenuDish()
    }
}