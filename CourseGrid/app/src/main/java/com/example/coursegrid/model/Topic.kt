package com.example.coursegrid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val intResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
