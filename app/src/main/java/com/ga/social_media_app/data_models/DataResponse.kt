package com.ga.social_media_app.data_models

data class dataResponse(
    val id: String,
    val name: String,
    val lastname: String,
    val userPhoto: String,
    val photoLibrary: List<String>,
    val description_line_1: String,
    val description_line_2: String
)