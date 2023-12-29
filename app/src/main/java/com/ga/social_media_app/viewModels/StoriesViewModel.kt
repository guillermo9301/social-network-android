package com.ga.social_media_app.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ga.social_media_app.data_models.DataApi
import com.ga.social_media_app.data_models.dataResponse
import kotlinx.coroutines.launch

class StoriesViewModel: ViewModel() {
    private val _dataList = mutableStateOf<List<dataResponse>>(emptyList())
    val dataList: State<List<dataResponse>> = _dataList

    fun fetchData() {
        viewModelScope.launch {
            try {
                val response = DataApi.dataService.getData()
                _dataList.value = response

            } catch (e: Exception) {
                println("Error: ${e.message}")

            }
        }
    }
}