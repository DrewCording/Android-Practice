package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArtSpaceScreen()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceScreen() {
    var state = 1
    
    val imageResource = when (state) {
        1 -> R.drawable.mona_lisa
        2 -> R.drawable.girl_with_a_pearl_earring
        3 -> R.drawable.starry_night
        4 -> R.drawable.the_kiss
        5 -> R.drawable.the_birth_of_venus
        6 -> R.drawable.arrangement_in_grey_and_black_no__1
        7 -> R.drawable.the_arnolfini_portrait
        8 -> R.drawable.the_garden_of_earthly_delights
        9 -> R.drawable.a_sunday_afternoon_on_the_island_of_la_grande_jatte
        10 -> R.drawable.les_demoiselles_davignon
        else -> R.drawable.mona_lisa
    }
    
    val imageDescription = when (state) {
        1 -> stringResource(R.string.mona_lisa)
        2 -> stringResource(R.string.girl_with_a_pearl_earring)
        3 -> stringResource(R.string.starry_night)
        4 -> stringResource(R.string.the_kiss)
        5 -> stringResource(R.string.the_birth_of_venus)
        6 -> stringResource(R.string.arrangement_in_grey_and_black_no__1)
        7 -> stringResource(R.string.the_arnolfini_portrait)
        8 -> stringResource(R.string.the_garden_of_earthly_delights)
        9 -> stringResource(R.string.a_sunday_afternoon_on_the_island_of_la_grande_jatte)
        10 -> stringResource(R.string.les_demoiselles_davignon)
        else -> stringResource(R.string.mona_lisa)
    }
    
    Column(
        modifier = Modifier.padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ArtFrame(imageResource = imageResource, imageDescription = imageDescription)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        ArtSpaceScreen()
    }
}