package com.ga.social_media_app.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ga.social_media_app.R

@Composable

fun StoriesView() {

    Row (
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(horizontal = 8.dp)){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            //modifier = Modifier.padding(horizontal = 8.dp)
        ){
            //UserImage
            Image(painterResource(id = R.drawable.chikitin),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(70.dp)
                    .clip(shape = CircleShape)
                    .border(
                        width = 2.dp,
                        color = Color.Magenta,
                        shape = CircleShape,
                    )
            )

            //name and lastname
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                Text(text = "Fonchito")
                Text(text = "Anticona")
            }
        }

        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            //UserImage
            Image(painterResource(id = R.drawable.sekiro),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .border(
                        width = 2.dp,
                        color = Color.Magenta,
                        shape = CircleShape,
                    )

            )
            //name and lastname
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                Text(text = "Fonchito")
                Text(text = "Anticona")
            }
        }

        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            //UserImage
            Image(painterResource(id = R.drawable.chikitin),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(70.dp)
                    .clip(shape = CircleShape)
                    .border(
                        width = 2.dp,
                        color = Color.Magenta,
                        shape = CircleShape,
                    )
            )
            //name and lastname
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                Text(text = "Fonchito")
                Text(text = "Anticona")
            }
        }
    }

}