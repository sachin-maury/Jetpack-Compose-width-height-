package com.hedroid.myfirstprogram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            Row (

                modifier = Modifier

                    .fillMaxWidth(0.9f)
                    .fillMaxHeight(0.9f)
                    .background(Color.Green),
                horizontalArrangement =Arrangement.SpaceBetween,
                verticalAlignment =Alignment.CenterVertically){
                Text(text = "Hello")
                Text(text = "World")
            }


        }
    }
}

