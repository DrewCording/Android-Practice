package com.example.woof

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@Composable
fun DogItemButton(
    expand: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick
    ) {
        Icon(
            imageVector = if(expand) {
                Icons.Filled.ExpandLess
            } else {
                Icons.Filled.ExpandMore
                   },
            contentDescription = stringResource(R.string.expand_button_content_description),
            tint = if(expand) {
                MaterialTheme.colors.onSurface
            } else {
                MaterialTheme.colors.secondary
            }
        )
    }
}