package com.example.activitypam3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activitypam3.ui.theme.ActivityPAM3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActivityPAM3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicComposable(
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BasicComposable(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,

        )
    {
        Text(text = "LOGIN", modifier = Modifier,
            fontSize = 70.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Ini Adalah Halaman Login",
            fontSize = 25.sp,
            color = Color.DarkGray,
            fontStyle = FontStyle.Italic
        )
        Image(painter = painterResource(id = R.drawable.umy),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )
        Text(text = "Nama", modifier = Modifier,
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Zuharul Habib", modifier = Modifier,
            fontSize = 15.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )
        Text(text = "20220140051", modifier = Modifier,
            fontSize = 50.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Image(painter = painterResource(id = R.drawable.poto),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )

    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ActivityPAM3Theme {
        Greeting("Android")
    }
}