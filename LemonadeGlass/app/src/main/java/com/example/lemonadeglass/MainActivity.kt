package com.example.lemonadeglass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonadeglass.ui.theme.LemonadeGlassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeGlassTheme {
                LemonadeGlassApp()
            }
        }
    }
}


@Preview(showBackground = false)
@Composable
fun LemonadeGlassApp() {
    DrinkLemonade(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun DrinkLemonade(modifier: Modifier = Modifier) {
    var stage by remember { mutableStateOf(1) }

    val stringResource = when (stage) {
        1 -> R.string.stage1
        2 -> R.string.stage2
        3 -> R.string.stage3
        4 -> R.string.stage4
        else -> R.string.stage1
    }

    val altTextResource = when (stage) {
        1 -> R.string.lemon_tree
        2 -> R.string.lemon
        3 -> R.string.glass_of_lemonade
        4 -> R.string.epty_glass
        else -> R.string.stage1
    }

    val imageResource = when (stage) {
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        4 -> R.drawable.lemon_restart
        else -> R.drawable.lemon_tree
    }

    val buttonResource = when (stage) {
        1 -> R.string.button1
        2 -> R.string.button2
        3 -> R.string.button3
        4 -> R.string.button4
        else -> R.string.button1
    }

    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(color = Color.White) {
            Text(text = androidx.compose.ui.res.stringResource(stringResource), fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(border = BorderStroke(width = 6.dp, color = Color.Blue), colors = ButtonDefaults.textButtonColors(),onClick = {
            if(stage == 1) {
                stage = 2
            }else if(stage == 2) {
                var chance = (1..4).random()
                if(chance == 4) {
                    stage = 3
                } else {
                    stage = 2
                }
            } else if (stage == 3){
                stage = 4
            } else if (stage == 4){
                stage = 1
            }
        }) {
            Image(
                painter = painterResource(imageResource),
                contentDescription = androidx.compose.ui.res.stringResource(altTextResource)
            )
        }
    }
}

