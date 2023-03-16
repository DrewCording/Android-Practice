package com.example.artspace2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonFrame(
    modifier: Modifier = Modifier,
    state: Int,
    onNextClick: () -> Unit,
    onPreviousClick: () -> Unit
) {
    Row(
        //modifier = Modifier.padding(32.dp),
        horizontalArrangement = Arrangement.spacedBy(30.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            modifier = modifier
                .size(
                    width = 150.dp,
                    height = 50.dp),
            onClick = onPreviousClick
        ) {
            Text("Previous")
        }
    
        Button(
            modifier = modifier
                .size(
                    width = 150.dp,
                    height = 50.dp),
            onClick = onNextClick
        ) {
            Text("Next")
        }
    }
}