package com.example.ii3510_2425_animationproject_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ii3510_2425_animationproject_jetpackcompose.ui.theme.II3510_2425_AnimationProject_JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            II3510_2425_AnimationProject_JetPackComposeTheme {
                var visible: Boolean by remember { mutableStateOf(true) }
                var fade: Boolean by remember { mutableStateOf(true) }
                var changeColor: Boolean by remember { mutableStateOf(true) }
                var expanded: Boolean by remember { mutableStateOf(false) }
                var togled: Boolean by remember { mutableStateOf(false) }
                // TODO : Put good paramaters in animate function
                val animatedAlpha: Float by animateFloatAsState()
                val animatedColor: Color by animateColorAsState()
                val animatedPadding: Dp by animateDpAsState()
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Center
                ) {
                    // Hide Scale Out Animation :
                    AnimatedVisibility(
                        visible = visible,
                        enter = scaleIn(),
                        exit = scaleOut()
                    ) {
                        Box(
                            modifier = Modifier // TODO : Apply the good modifier
                        )
                    }
                    Spacer(modifier = Modifier.size(11.dp))
                    Button(onClick = { visible = !visible }) {
                        Text(
                            text = if (visible) "Hide" else "Show",
                            fontSize = 11.sp
                        )
                    }

                    // Hide Fade Animation :
                    Box(
                        modifier = Modifier // TODO : Apply the good modifier

                    )
                    Spacer(modifier = Modifier.size(22.dp))
                    Button(onClick = { fade = !fade }) {
                        Text(
                            text = if (fade) "Hide" else "Show",
                            fontSize = 11.sp
                        )
                    }
                    // Chnage Color Animation :
                    Box(
                        modifier = Modifier // TODO : Apply the good modifier

                    )
                    Spacer(modifier = Modifier.size(11.dp))
                    Button(onClick = { changeColor = !changeColor }) {
                        Text(
                            text = "Change Color",
                            fontSize = 11.sp
                        )
                    }
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Center
                ) {
                    // Height Expansion Animation :
                    Box(
                        modifier = Modifier // TODO : Apply the good modifier

                    )

                    Spacer(modifier = Modifier.size(11.dp))
                    Button(onClick = { expanded = !expanded }) {
                        Text(
                            text = if (expanded) "Expend" else "Retract",
                            fontSize = 11.sp
                        )
                    }
                    // Padding Animation :
                    Box(
                        modifier = Modifier // TODO : Apply the good modifier

                    )

                    Spacer(modifier = Modifier.size(11.dp))
                    Button(onClick = { togled = !togled }) {
                        Text(
                            text = if (togled) "Expend" else "Retract",
                            fontSize = 11.sp
                        )
                    }
                }

            }

        }
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
    II3510_2425_AnimationProject_JetPackComposeTheme {
        Greeting("Android")
    }
}