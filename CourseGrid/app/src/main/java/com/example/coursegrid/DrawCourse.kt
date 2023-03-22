package com.example.coursegrid

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.coursegrid.model.Topic

@Composable
fun DrawCourse (
    topic: Topic,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .border(
                color = Color.Gray,
                width = 1.dp,
                shape = RectangleShape
            )
            .size(
                width = 200.dp,
                height = 69.dp
            )
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
                    style = MaterialTheme.typography.bodyMedium,
    
                    text = stringResource(topic.stringResourceId)
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
                                x = 24.dp,
                                y = 24.dp
                            ),
                        style = MaterialTheme.typography.bodySmall,
        
                        text = topic.intResourceId.toString()
                    )
                }
            }
        }
    }
}