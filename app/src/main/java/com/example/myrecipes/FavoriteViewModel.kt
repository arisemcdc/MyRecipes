package com.example.myrecipes

import android.content.ContentValues
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myrecipes.Adapters.RecipeListAdapter
import com.example.myrecipes.Network.Recipe
import com.example.myrecipes.Network.RecipeResponse
import com.example.myrecipes.Network.RecipesApiClient
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class FavoriteViewModel: ViewModel() {
   private val _recipes = MutableLiveData<List<Recipe>>()
    val recipes : LiveData<List<Recipe>> = _recipes

    private val call = RecipesApiClient.apiClient.getRecipes()
    init {
        loadRecipesFromNetwork()
    }
    private fun loadRecipesFromNetwork() {
        call.enqueue(object :Callback, retrofit2.Callback<List<RecipeResponse>> {
            override fun onResponse(
                call: Call<List<RecipeResponse>>,
                response: Response<List<RecipeResponse>>
            ) {
                _recipes.value = response.body()!![0].recipes
            }

            override fun onFailure(call: Call<List<RecipeResponse>>, t: Throwable) {
                Log.e(ContentValues.TAG, t.toString())
            }

        })
    }
   /* val call = RecipesApiClient.apiClient.getRecipes()
    call.enqueue(*//* callback = *//* object : Callback, retrofit2.Callback<List<RecipeResponse>> {
        override fun onResponse(
            call: Call<List<RecipeResponse>>,
            response: Response<List<RecipeResponse>>
        ) {

            val recipes = response.body()!![0].recipes
            // Передаем результат в адаптер
            recyclerView.adapter = recipes?.let {
                RecipeListAdapter(it, this@FavoriteFragment)
            }
            Log.d("FavoriteFragment", recipes.toString())
        }
        override fun onFailure(call: Call<List<RecipeResponse>>, t: Throwable) {
            *//* логируем ошибку *//*
            Log.e(ContentValues.TAG, t.toString())
            Toast.makeText(context,"Что-то пошло не так!", Toast.LENGTH_SHORT).show()
        }*/

}