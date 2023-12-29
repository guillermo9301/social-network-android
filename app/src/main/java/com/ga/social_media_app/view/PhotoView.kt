package com.ga.social_media_app.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.ga.social_media_app.R
import com.ga.social_media_app.data_models.dataResponse
import com.ga.social_media_app.viewModels.StoriesViewModel

@Composable

fun PhotoView(
    storiesViewModel: StoriesViewModel = viewModel(),
    id: String
) {
    storiesViewModel.fetchData()
    val dataList: List<dataResponse> = storiesViewModel.dataList.value
    val filteredList: List<dataResponse> = dataList.filter { it.id == id }
    val selectedUser: dataResponse = filteredList[0]

    LazyColumn(
        modifier = Modifier
            .padding(top = 8.dp)
    ) {
        items(selectedUser.photoLibrary) { dataItem ->
            Row (
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
            ){
                //userPhotoIcon
                AsyncImage(
                    model = selectedUser.userPhoto,
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
                        Text(text = selectedUser.name)
                        Text(text = selectedUser.lastname)
                    }
                Spacer(modifier = Modifier.weight(1F, true))
                Image(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = null
                    //modifier = Modifier.weight(1f, true)
                )

            }
            //main photo
            AsyncImage(
                model = dataItem,
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp)
            )
            ReactionsView()
        }
    }
}