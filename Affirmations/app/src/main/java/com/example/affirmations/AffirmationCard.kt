package com.example.affirmations

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.affirmations.model.Affirmation

@Composable
fun AffirmationCard(
    affirmation: Affirmation,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(8.dp),
        elevation = 4.dp
    ) {
        Column {
            Image(
                modifier = modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop,

                painter = painterResource(affirmation.imageResourceId),
                contentDescription = stringResource(affirmation.stringResourceId)
            )

            Text(
                modifier = modifier
                    .padding(16.dp),
                style = MaterialTheme.typography.h6,

                text = stringResource(affirmation.stringResourceId)
            )
        }
    }
}