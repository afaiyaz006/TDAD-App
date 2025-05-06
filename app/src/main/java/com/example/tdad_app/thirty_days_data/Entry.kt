package com.example.tdad_app.thirty_days_data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Entry(
    @StringRes val dayNumber:Int,
    @StringRes val dayTitle:Int,
    @StringRes val description:Int,
    @DrawableRes val imageCode: Int
)
