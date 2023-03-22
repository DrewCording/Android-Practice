package com.example.courselist2

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.courselist2.model.Topic

@Composable
fun DrawCourse (
    topic: Topic,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(8.dp),
        elevation = 4.dp
    ) {
        Row() {
            Image(
                modifier = modifier
                    .height(68.dp),
                contentScale = ContentScale.Crop,

                painter = painterResource(topic.imageResourceId),
                contentDescription = stringResource(topic.stringResourceId)
            )

            Column() {
                Text(
                    modifier = modifier
                        .offset(
                            x = 16.dp,
                            y = 16.dp
                        ),
                    style = MaterialTheme.typography.body1,
                    text = stringResource(topic.stringResourceId),
                    color = MaterialTheme.colors.onSurface
                )

                Row() {
                    Image(
                        modifier = modifier
                            .height(15.dp)
                            .offset(
                                x = 16.dp,
                                y = 24.dp
                            ),
                        contentScale = ContentScale.Crop,
                        painter = painterResource(R.drawable.ic_grain),
                        contentDescription = "icon"
                    )

                    Text (
                        modifier = modifier
                            .offset(
                                x = 20.dp,
                                y = 19.dp
                            ),
                        style = MaterialTheme.typography.body1,
                        text = topic.intResourceId.toString(),
                        color = MaterialTheme.colors.onSurface
                    )
                }
            }
        }
    }
}