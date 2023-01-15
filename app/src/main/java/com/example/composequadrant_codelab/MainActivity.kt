package com.example.composequadrant_codelab

import android.media.midi.MidiOutputPort
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant_codelab.ui.theme.ComposeQuadrant_CodelabTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrant_CodelabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrants()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrants() {
    Column {
        Row (modifier = Modifier.weight(0.5F)) {
            Column(             //TEXT BLOCK
                modifier = Modifier
                    .background(color = Color.Green)
                    .padding(all = 16.dp)
                    .weight(0.5F, fill = true)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.text_title),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp),

                    )
                Text(
                    text = stringResource(R.string.text_desc),
                    textAlign = TextAlign.Justify
                )
            }

            Column(             //IMAGE BLOCK
                modifier = Modifier
                    .background(color = Color.Yellow)
                    .padding(all = 16.dp)
                    .weight(0.5F, fill = true)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.image_title),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                Text(
                    text = stringResource(R.string.image_desc),
                    textAlign = TextAlign.Justify
                )
            }
        }

        Row(Modifier.weight(0.5F)) {
            Column(             //ROW BLOCK
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(all = 16.dp)
                    .weight(0.5F, fill = true)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.row_title),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp),

                    )
                Text(
                    text = stringResource(R.string.row_desc),
                    textAlign = TextAlign.Justify
                )
            }

            Column(             //COLUMN BLOCK
                modifier = Modifier
                    .background(color = Color.LightGray)
                    .padding(all = 16.dp)
                    .weight(0.5F, fill = true)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.column_title),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                Text(
                    text = stringResource(R.string.column_desc),
                    textAlign = TextAlign.Justify
                )
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrant_CodelabTheme {
        ComposeQuadrants()
    }
}