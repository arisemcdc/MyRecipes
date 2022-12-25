package com.example.myrecipes.Data.localdb

import android.content.Context

class RecipesRepository(context: Context) {
    private val recipesDAO: RecipesDAO
    init {
        val database = RecipesDatabase.getInstance(context)
        recipesDAO = database!!.recipesDAO()
    }
    fun insert(recipe: RecipeEntity) {
        recipesDAO.insert(recipe)
    }
    fun update(recipe: RecipeEntity) {
        recipesDAO.update(recipe)
    }
    fun delete(recipe: RecipeEntity) {
        recipesDAO.delete(recipe)
    }
    fun loadRecipes() {
        recipesDAO.loadRecipes()
    }
}