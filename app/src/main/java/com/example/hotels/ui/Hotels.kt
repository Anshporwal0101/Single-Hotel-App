package com.example.hotels.ui

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hotels.R
import com.example.hotels.data.HotelObj

@Composable
fun firstScreen()
{
    val context = LocalContext.current
    LazyColumn{
        items(HotelObj.hotelData()){
            hotelCards(
                context = context,
                hotelNameResourse = it.hotelnameResourseId,
                hotelImageResourse = it.hotelimageResourseId,
                hotelRoomResouseId = it.hotelRoomsResourseId
            )
        }
    }
}

@Composable
fun hotelCards(context: Context, hotelNameResourse : Int, hotelImageResourse : Int,hotelRoomResouseId : Int)
{
    val imgToast = stringResource(id = hotelNameResourse)
    val price = stringResource(id = hotelRoomResouseId)
   Card(
       modifier = Modifier
           .fillMaxWidth()
           .padding(8.dp)
           .clickable {
               Toast
                   .makeText(context, imgToast, Toast.LENGTH_SHORT)
                   .show()
           },
       elevation = CardDefaults.cardElevation(10.dp),
       colors = CardDefaults.cardColors(Color.LightGray),
       border = BorderStroke(1.dp,Color.Black)
   ){
       Image(
           painter = painterResource(hotelImageResourse),
           contentDescription = "Hotel 1",
           contentScale = ContentScale.Crop,
           modifier = Modifier
               .fillMaxWidth()
       )
       Box(
           modifier = Modifier.fillMaxWidth()
       ){
           Text(
               text = stringResource(id = hotelNameResourse),
               modifier = Modifier
                   .padding(6.dp)
                   .align(Alignment.BottomStart),
               style = TextStyle(
                   color = Color.DarkGray,
                   fontSize = 25.sp,
                   fontWeight = FontWeight.Bold
               )
           )
           if (price != "Sold Out")
           {
               Text(
                   text = price,
                   fontSize = 20.sp,
                   color = Color.White,
                   modifier = Modifier
                       .padding(8.dp)
                       .align(Alignment.BottomEnd)
                       .background(Color(96, 130, 182), RoundedCornerShape(3.dp))
               )
           }
           else
           {
               Text(
                   text = price,
                   fontSize = 20.sp,
                   color = Color.White,
                   modifier = Modifier
                         .padding(8.dp)
                       .align(Alignment.BottomEnd)
                       .background(Color(159, 43, 104), RoundedCornerShape(3.dp))
               )
           }
       }
   }
}