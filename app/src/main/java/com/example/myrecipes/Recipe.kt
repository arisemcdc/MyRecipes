package com.example.myrecipes

import androidx.annotation.StringRes

data class Recipe(val name: String, val category: FoodCategory, val ingridients: List<String>,
                  val timeForPreparing: Int, val calories: Int, val steps:List<String>, val isFavorite: Boolean, val rating: Int,
                  val foodImage: String, val numberOfServings: Int)
enum class FoodCategory {
    SOUP,
    DRINK,
    DESSERT
}
enum class Ingridient(@StringRes val ingridientName: Int) {
    BLUEBERRY(R.string.blueberry_name),
    SUGAR(R.string.sugar_name),
    STRAWBERRY(R.string.strawberry_name),
    BUTTER(R.string.butter_name),
    WATER(R.string.water_name)
}
enum class Meal(@StringRes val mealName: Int) {
    BREAKFAST(R.string.breakfast),
    LUNCH(R.string.lunch),
    DINNER(R.string.dinner)
}