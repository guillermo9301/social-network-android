package com.ga.social_media_app.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier


@Composable
fun MyApp() {
    var selectedId by remember {
        mutableStateOf<String?>(null)
    }

    Column (
        //modifier = Modifier.verticalScroll(rememberScrollState())
    ){
        HeaderView()
        StoriesView { id ->
            selectedId = id
        }
        selectedId?.let {id ->
            PhotoView(id = id)
        }
    }
}

