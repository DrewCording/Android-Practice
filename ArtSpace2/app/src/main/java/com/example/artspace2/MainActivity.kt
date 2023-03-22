package com.example.artspace2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.artspace2.ui.theme.ArtSpace2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpace2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpace2Screen()
                }
            }
        }
    }
}

@Composable
fun ArtSpace2Screen() {
    var state by remember { mutableStateOf(1) }
    
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
    
    val subtitleResource = when (state) {
        1 -> stringResource(R.string.mona_lisa_subtitle)
        2 -> stringResource(R.string.girl_with_a_pearl_earring_subtitle)
        3 -> stringResource(R.string.starry_night_subtitle)
        4 -> stringResource(R.string.the_kiss_subtitle)
        5 -> stringResource(R.string.the_birth_of_venus_subtitle)
        6 -> stringResource(R.string.arrangement_in_grey_and_black_no__1_subtitle)
        7 -> stringResource(R.string.the_arnolfini_portrait_subtitle)
        8 -> stringResource(R.string.the_garden_of_earthly_delights_subtitle)
        9 -> stringResource(R.string.a_sunday_afternoon_on_the_island_of_la_grande_jatte_subtitle)
        10 -> stringResource(R.string.les_demoiselles_davignon_subtitle)
        else -> stringResource(R.string.mona_lisa_subtitle)
    }
    
    val yearResource = when (state) {
        1 -> stringResource(R.string.mona_lisa_year)
        2 -> stringResource(R.string.girl_with_a_pearl_earring_year)
        3 -> stringResource(R.string.starry_night_year)
        4 -> stringResource(R.string.the_kiss_year)
        5 -> stringResource(R.string.the_birth_of_venus_year)
        6 -> stringResource(R.string.arrangement_in_grey_and_black_no__1_year)
        7 -> stringResource(R.string.the_arnolfini_portrait_year)
        8 -> stringResource(R.string.the_garden_of_earthly_delights_year)
        9 -> stringResource(R.string.a_sunday_afternoon_on_the_island_of_la_grande_jatte_year)
        10 -> stringResource(R.string.les_demoiselles_davignon_year)
        else -> stringResource(R.string.mona_lisa_year)
    }
    
    if(state < 1) {
        state = 10
    } else if (state > 10) {
        state = 1
    }
    
    Column(
        modifier = Modifier.padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ArtFrame(
            imageResource = imageResource,
            imageDescription = imageDescription
        )
    
        Spacer(Modifier.height(10.dp))
        
        DescriptionFrame(
            title = imageDescription,
            subtitle = subtitleResource,
            year = yearResource
        )
    
        Spacer(Modifier.height(10.dp))
    
        ButtonFrame(
            state = state,
            onNextClick = { state++ },
            onPreviousClick = { state-- }
        )
    }
}

/*@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpace2Theme {
        ArtSpace2Screen()
    }
}*/