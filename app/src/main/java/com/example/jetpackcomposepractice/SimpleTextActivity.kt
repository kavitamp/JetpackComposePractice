package com.example.jetpackcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class SimpleTextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth(1f)
                    .border(2.dp, color = Color.Magenta)
                    .background(Color.Cyan),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "First text")
                Text(text = "New.....")
                Greeting(name = "Kavita")
                Row(
                    modifier = Modifier
                        .fillMaxSize(0.5f)
                        .background(Color.LightGray),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(text = "Clickable row one", modifier = Modifier
                        .offset(20.dp, 30.dp)
                        .background(Color.Yellow)
                        .clickable {

                        }
                    )
                    Spacer(modifier = Modifier.height(height = 50.dp))
                    Text(text = "Row two")
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
    Column(verticalArrangement = Arrangement.Top) {
        Text(text = "First text")
        Text(text = "Two.....")
        Greeting("everyone")

        Row {
            Text(text = "Row 1")
            Text(text = "Row 2")
        }
    }
}
