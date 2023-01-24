/*
package com.example.myrecipes

import timber.log.Timber

class FakeFoodRepository {

   */
/* *//*
*/
/*val recipes = mutableListOf<Recipe>()*//*
*/
/*
    val ingridients1 = listOf("ингридиент1", "ингридиент2", "ингридиент3", "ингридиент4", "ингридиент5")
    val ingridients2 = listOf("ингридиент1", "ингридиент2", "ингридиент3", "ингридиент4", "ингридиент5")
    val ingridients3 = listOf("ингридиент1", "ингридиент2", "ингридиент3", "ингридиент4", "ингридиент5")
    val ingridients4 = listOf("ингридиент1", "ингридиент2", "ингридиент3", "ингридиент4", "ингридиент5")
    val ingridients5 = listOf("ингридиент1", "ингридиент2", "ингридиент3", "ингридиент4", "ингридиент5")
    val steps1 = listOf("шаг1", "шаг2", "шаг3", "шаг4", "шаг5")
    val steps2 = listOf("шаг1", "шаг2", "шаг3", "шаг4", "шаг5")
    val steps3 = listOf("шаг1", "шаг2", "шаг3", "шаг4", "шаг5")
    val steps4 = listOf("шаг1", "шаг2", "шаг3", "шаг4", "шаг5")
    val steps5 = listOf("шаг1", "шаг2", "шаг3", "шаг4", "шаг5")
    val recipe1 = Recipe(1,"Суп",  Meal.LUNCH, true, 2, 200, 40, 3)
    val recipe2 = Recipe(2,"Мясо",  Meal.DINNER, true, 2, 100, 20, 2)
    val recipe3 = Recipe(3,"Каша",  Meal.BREAKFAST, true, 1, 60, 10, 2)
    val recipe4 = Recipe(4,"Торт", Meal.LUNCH, true, 1, 60, 10, 2)
    val recipe5 = Recipe(4,"Чай",  Meal.LUNCH, true, 1, 50, 2, 1)
    val recipe6 = Recipe(1,"Суп",  Meal.LUNCH, true, 2, 200, 40, 3)
    val recipe7 = Recipe(2,"Мясо",  Meal.DINNER, true, 2, 100, 20, 2)
    val recipe8 = Recipe(3,"Каша",  Meal.BREAKFAST, true, 1, 60, 10, 2)
    val recipe9 = Recipe(4,"Торт", Meal.LUNCH, true, 1, 60, 10, 2)
    val recipe10 = Recipe(4,"Чай",  Meal.LUNCH, true, 1, 50, 2, 1)*//*


   */
/* fun getRecipe(): MutableList<Recipe> {
        recipes.add(recipe1)
        recipes.add(recipe2)
        recipes.add(recipe3)
        recipes.add(recipe4)
        recipes.add(recipe5)
        recipes.add(recipe6)
        recipes.add(recipe7)
        recipes.add(recipe8)
        recipes.add(recipe9)
        recipes.add(recipe10)
        recipes.add(recipe1)
        recipes.add(recipe2)
        recipes.add(recipe3)
        recipes.add(recipe4)
        recipes.add(recipe5)
        recipes.add(recipe6)
        recipes.add(recipe7)
        recipes.add(recipe8)
        recipes.add(recipe9)
        recipes.add(recipe10)
        Timber.d(recipes.toString())
        return recipes
    }
*//*

   */
/* fun sortByRating(recipes: MutableList<Recipe>, isAscendig:Boolean ): List<Recipe> {
        return if (isAscendig) recipes.sortedBy { it.rating}
        else recipes.sortedByDescending { it.rating }
    }

    *//*
*/
/*fun sortByCategory(recipes: MutableList<Recipe>): List<Recipe> {
        val sortedRecipesByCategory = recipes.filter {it.category == FoodCategory.DESSERT }
        Timber.d(sortedRecipesByCategory.toString())
        return sortedRecipesByCategory
    }*//*
*/
/*

    fun sortByCalories(recipes: MutableList<Recipe>): List<Recipe> {
        val sortedRecipesByCalories = recipes.filter { it.calories!! > 50}
        Timber.d(sortedRecipesByCalories.toString())
        return sortedRecipesByCalories
    }

    fun sortByTimeForPreparing(recipes: MutableList<Recipe>): List<Recipe> {
        val sortedRecipesByTimeForPreparing = recipes.filter { it.timeForPreparing in 6..14 }
        Timber.d(sortedRecipesByTimeForPreparing.toString())
        return sortedRecipesByTimeForPreparing
    }
}*/
