package com.example.myrecipes

class FakeFoodRepository {

    val recipes = mutableListOf<Recipe>()
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
    val recipe1 = Recipe("Борщ", FoodCategory.SOUP, ingridients1, "50 минут", 100,steps1,
        true, 5, "http:image1 ", 4)
    val recipe2 = Recipe("Чизкейк", FoodCategory.DESSERT, ingridients2, "15 минут", 250, steps2,
        true, 4, "http:image2 ", 3)
    val recipe3 = Recipe("Апельсиновый сок", FoodCategory.DRINK, ingridients3, "10 минут", 300, steps3,
        true, 3, "http:image3 ", 4)
    val recipe4 = Recipe("Французские тосты", FoodCategory.DESSERT, ingridients4, "30 минут", 400, steps4,
        true, 5, "http:image1 ", 3)
    val recipe5 = Recipe("Лосось в глазури", FoodCategory.SOUP, ingridients5, "40 минут", 280,steps5,
        true, 5, "http:image1 ", 5)


    fun getRecipe(recipes: MutableList<Recipe>):  MutableList<Recipe> {
        recipes.add(recipe1)
        recipes.add(recipe1)
        recipes.add(recipe3)
        recipes.add(recipe4)
        recipes.add(recipe5)
        return recipes
        println(recipes)
    }

    fun sortByRating(recipes: MutableList<Recipe>): MutableList<Recipe> {
        return recipes
    }

    fun sortByCategory(recipes: MutableList<Recipe>): MutableList<Recipe> {
        return recipes
    }

    fun sortByCalories(recipes: MutableList<Recipe>): MutableList<Recipe> {
        return recipes
    }

    fun sortByTime(recipes: MutableList<Recipe>): MutableList<Recipe> {
        return recipes
    }



}
