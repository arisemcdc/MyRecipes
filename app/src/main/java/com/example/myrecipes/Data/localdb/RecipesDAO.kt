package com.example.myrecipes.Data.localdb

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface RecipesDAO {
    @Query("SELECT * FROM recipes")
    fun loadRecipes(): List<RecipeEntity>
    @Insert
    fun insert(recipe: RecipeEntity)
    @Update
    fun update(recipe: RecipeEntity)
    @Delete
    fun delete(recipe: RecipeEntity)
}