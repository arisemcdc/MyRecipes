package com.example.myrecipes.response

import retrofit2.Call
import retrofit2.http.GET

const val BASE_URL = "https://61e46d241a976f00176ee4a1.mockapi.io/api/v1"
interface RecipesApiInterface {
    @GET("/recipes")
    fun getRecipes(): Call<RecipeResponse>
}