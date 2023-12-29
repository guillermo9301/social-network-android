package com.ga.social_media_app.view

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable



@Composable
fun MyApp() {
    Column {
        HeaderView()
        StoriesView()
        PhotoView()
        ReactionsView()
    }
}

