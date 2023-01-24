package com.example.myrecipes

import androidx.annotation.StringRes

/*class Recipe (
    var id: Int?,
    var name: String,
    var meal: Meal?,
    var isFavorite: Boolean,
    var rating: Int?,
    var calories: Int?,
    var timeForPreparing: Int?,
    var numberOfServings: Int?
)*/
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
