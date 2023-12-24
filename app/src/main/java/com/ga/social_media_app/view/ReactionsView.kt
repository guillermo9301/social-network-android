package com.ga.social_media_app.view

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.ga.social_media_app.R

@Composable

fun ReactionsView() {
    //variable state para el boton like
    var like by remember { mutableStateOf(false) }
    var likeIcon = if (like) Icons.Default.Favorite else Icons.Default.FavoriteBorder

    Row (horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
       Row (horizontalArrangement = Arrangement.spacedBy(8.dp)){
           //Like button
           Image(
               imageVector = likeIcon,
               contentDescription = null,
               modifier = Modifier
                   .size(25.dp)
                   .clickable {
                       like = !like
                   }
           )
           Image(
               imageVector = Icons.Default.Send,
               contentDescription = null,
               modifier = Modifier
                   .size(25.dp)
           )
           Image(
               imageVector = Icons.Default.Share,
               contentDescription = null,
               modifier = Modifier
                   .size(25.dp)
           )
       }
        Image(
            imageVector = Icons.Default.Add,
            contentDescription = null,
            modifier = Modifier
                .size(25.dp)
        )
    }
}