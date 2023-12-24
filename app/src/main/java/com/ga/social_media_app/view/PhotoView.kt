package com.ga.social_media_app.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ga.social_media_app.R

@Composable

fun PhotoView() {
    Column (
        modifier = Modifier
            .padding(top = 8.dp)
    ){
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
        )
        {
            Row (
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painterResource(id = R.drawable.chikitin),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape)
                        .border(
                            width = 2.dp,
                            color = Color.Magenta,
                            shape = CircleShape,
                        )
                )
                Row (horizontalArrangement = Arrangement.spacedBy(5.dp)){
                    Text(text = "Nombre")
                    Text(text = "Apellido")
                }

            }
            //Spacer(modifier = Modifier.fillMaxWidth())
            Image(imageVector = Icons.Default.MoreVert, contentDescription = null)
        }

        //main photo
        Image(
            painterResource(id = R.drawable.sekiro),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp)
        )
    }
}