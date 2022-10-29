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
data class Recipe(val name: String, val category: FoodCategory, val ingridients: List<String>,
                  val timeForPreparing: String, val calories: Int, val steps:List<String>, val isFavorite: Boolean, val rating: Int,
                  val foodImage: String, val numberOfServings: Int
                    ) {
}
sealed class IngridientInfo {
    val ingridientType: String
        get() {
            return "Тип ингридиента"
        }
    val ingridientName: String
        get() {
            return "Имя ингридиента"
        }
}