package com.example.hotels.data

import com.example.hotels.R

object HotelObj{
    fun hotelData() : List<Categories>
    {
        return listOf<Categories>(
            Categories(R.string.hotel1,R.string.price1,R.drawable.hotel1),
            Categories(R.string.Hotel2,R.string.price2,R.drawable.hotel2),
            Categories(R.string.hotel3,R.string.price3,R.drawable.hotel3),
            Categories(R.string.Hotel4,R.string.price4,R.drawable.hotel4),
            Categories(R.string.hotel5,R.string.price5,R.drawable.hotel5),
            Categories(R.string.Hotel6,R.string.price6,R.drawable.hotel6),
            Categories(R.string.hotel7,R.string.price7,R.drawable.hotel7),
            Categories(R.string.Hotel8,R.string.price8,R.drawable.hotel8),
            Categories(R.string.hotel9,R.string.price9,R.drawable.hotel9),
            Categories(R.string.Hotel10,R.string.price10,R.drawable.hotel10)
            )
    }
}