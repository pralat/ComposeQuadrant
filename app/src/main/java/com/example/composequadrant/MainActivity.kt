package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.data.EmptyGroup.name
import androidx.compose.ui.tooling.preview.Preview
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposeQuadrantTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          Greeting()
        }
      }
    }
  }
}

@Composable
fun Greeting() {
  Column() {
    Row() {
      Card() {
        Text("Card 1 content")

      }
      Card() {
        Text("Card 2 content")
      }
    }
    Row() {
      Card() {
        Text("Card 3 content")

      }
      Card() {
        Text("Card 4 content")
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  ComposeQuadrantTheme {
    Greeting()
  }
}