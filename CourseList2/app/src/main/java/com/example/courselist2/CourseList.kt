package com.example.courselist2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.courselist2.model.Topic


@Composable
fun CourseList(
    topicList: List<Topic>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(0.dp),
        //verticalArrangement = Arrangement.spacedBy(0.dp),
        //horizontalArrangement = Arrangement.spacedBy(0.dp)
    ) {
        items(
            topicList
        ) {topic ->
            DrawCourse(topic)
        }
    }
}