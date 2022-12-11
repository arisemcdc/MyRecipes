package com.example.myrecipes.Network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RecipesApiInterface {
    @GET("recipes")
    fun getRecipes(): Call<List<RecipeResponse>>
}
object RecipesApiClient {
    private const val BASE_URL = "https://61e46d241a976f00176ee4a1.mockapi.io/api/v1/"
    private var client: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply {
            this.level = HttpLoggingInterceptor.Level.BODY
        })
        .build()

    val apiClient: RecipesApiInterface by lazy {
        val retrofit=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return@lazy retrofit.create(RecipesApiInterface::class.java)
    }
}