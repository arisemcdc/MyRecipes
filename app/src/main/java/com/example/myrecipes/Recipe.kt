package com.example.myrecipes

import java.lang.reflect.Array

enum class Meal {
        BREAKFAST,
        LUNCH,
        DINNER
    }
enum class FoodCategory {
        SOUP,
        DRINK,
        DESSERT
    }
data class Recipe(val name: String, val category: FoodCategory, val ingridients: Array,
                  val timeForPreparing: String, val steps:Array, val isFavorite: Boolean, val rating: Int,
                  val foodImage: String, val numberOfServings: Int
                    ) {
}
sealed class IngridientInfo {

}