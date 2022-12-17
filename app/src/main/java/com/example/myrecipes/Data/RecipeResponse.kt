package com.example.myrecipes.Network

import androidx.annotation.StringRes
import com.example.myrecipes.R
import com.google.gson.annotations.SerializedName

data class RecipeResponse(
    val page: Int?,
    val recipes: List<Recipe>,
    @SerializedName("page_id")
    val pageId: String?
)
data class Recipe (
    val id: Long?,
    val title: String?,
    val description: String?,

    @SerializedName("meal_type")
    val mealType: MealTimeType?,

    @SerializedName("dish_type")
    val dishType: DishType?,

    @SerializedName("time_to_cook")
    val timeToCook: Long?,

    val rating: Double,
    val calories: Long?,

    @SerializedName("is_favorite")
    val isFavorite: Boolean,

    val portions: Long?,
    val category: String?,

    @SerializedName("image_url")
    val imageURL: String?,

    val ingredients: List<Ingredient>?,
    val steps: List<Step>?
)

data class Ingredient (
    val title: String?,

    @SerializedName("ingredient_alias")
    val ingredientAlias: String?,

    val count: Double?,
    val unit: String?,

    @SerializedName("unit_code")
    val unitCode: Long?,

    @SerializedName("ingredient_url")
    val ingredientURL: String?
)

data class Step (
    @SerializedName("step_number")
    val stepNumber: Long?,

    @SerializedName("step_description")
    val stepDescription: String?
)
enum class MealTimeType (@StringRes val mealName: Int) {
    @SerializedName("breakfast")
    BREAKFAST(R.string.breakfast),
    @SerializedName("late_breakfast")
    LATE_BREAKFAST(R.string.late_breakfast),
    @SerializedName("dinner")
    DINNER(R.string.dinner),
    @SerializedName("supper")
    SUPPER(R.string.supper)
}
enum class DishType (@StringRes val dishName: Int) {
    @SerializedName("firstdish")
    FIRSTDISH(R.string.firstdish),
    @SerializedName("maindish")
    MAINDISH(R.string.maindish)
}