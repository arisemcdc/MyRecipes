package com.example.myrecipes

import androidx.annotation.StringRes
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
                  val timeForPreparing: Int, val calories: Int, val steps:List<String>, val isFavorite: Boolean, val rating: Int,
                  val foodImage: String, val numberOfServings: Int
                    )
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

/*
enum class Ingridient {
    BLUEBERRY,
    BUTTER,
    STRAWBERRY,
    SUGAR,
    WATER
}*/
/*
enum class Ingridient(@StringRes val ingridientName: Int) {
    SUGAR(R.string.sugar_name)
}*/
