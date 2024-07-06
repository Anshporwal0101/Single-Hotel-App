package com.example.hotels.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Categories(
    @StringRes val hotelnameResourseId : Int,
    @StringRes val hotelRoomsResourseId : Int,
    @DrawableRes val hotelimageResourseId : Int
)
