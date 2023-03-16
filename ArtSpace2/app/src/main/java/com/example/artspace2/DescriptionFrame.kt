package com.example.artspace2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DescriptionFrame(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    year: String
) {
    Box {
        Text(
            modifier = modifier
                .fillMaxWidth()
                .size(115.dp)
                .border(
                    color = Color.Gray,
                    width = 5.dp
                )
                .background(Color.White)
                .offset(
                    x = 10.dp,
                    y = 0.dp
                ),
            text = title,
            fontSize = 35.sp,
            color = Color.Black,
            fontWeight = FontWeight.Thin,
            textAlign = TextAlign.Left,
            lineHeight = 35.sp
        )
    
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = modifier
                    .offset(
                        x = 10.dp,
                        y = 80.dp
                    ),
                text = subtitle,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Left
            )
    
            Text(
                modifier = modifier
                    .offset(
                        x = 10.dp,
                        y = 80.dp
                    ),
                text = year,
                color = Color.Black,
                textAlign = TextAlign.Left
            )
        }
    }
}