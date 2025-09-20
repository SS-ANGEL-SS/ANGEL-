package com.example.dojo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.dojo.ui.theme.DojoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DojoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("Hello $name!") }
    var textColor by remember { mutableStateOf(Color.Black) }
    var backgroundColor by remember { mutableStateOf(Color.Transparent) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(backgroundColor),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = text, color = textColor)

        // Button 1: change text
        Button(onClick = { text = "Good luck you today !" }) {
            Text("Change text")
        }

        // Button 2: change text color
        Button(onClick = { textColor = Color.White }) {
            Text("Change text color")
        }

        // Button 3: change background
        Button(onClick = { backgroundColor = Color.Blue }) {
            Text("Change background")
        }

        //Code for revert
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DojoTheme {
        Greeting("Android")
    }
}
