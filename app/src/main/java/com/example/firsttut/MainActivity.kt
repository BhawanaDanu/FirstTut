package com.example.firsttut

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.firsttut.ui.theme.FirstTutTheme
import androidx.compose.foundation.layout.requiredWidth as requiredWidth1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContent {
                Column(modifier=Modifier
                    .background(Color.Gray)
                    .fillMaxHeight(fraction = 0.5f)
                    .fillMaxWidth()
                    .padding(16.dp)
                ){
                    Text(text="Hello")
                    Text(text="World")
                }

            }
        }
    }

