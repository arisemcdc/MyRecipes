package com.example.myrecipes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myrecipes.Network.RecipeResponse

class FavoriteViewModel: ViewModel() {
    val recipes = MutableLiveData<List<Recipe>>()
}