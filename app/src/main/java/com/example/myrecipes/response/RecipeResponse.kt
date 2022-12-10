package com.example.myrecipes.response

import com.google.gson.annotations.SerializedName

data class RecipeResponse (
    val id: Long,
    val title: String,
    val description: String,

    @SerializedName("meal_type")
    val mealType: String,

    @SerializedName("dish_type")
    val dishType: String,

    @SerializedName("time_to_cook")
    val timeToCook: Long,

    val rating: Double,
    val calories: Long,

    @SerializedName("is_favorite")
    val isFavorite: Boolean,

    val portions: Long,
    val category: String,

    @SerializedName("image_url")
    val imageURL: String,

    val ingredients: List<Ingredient>,
    val steps: List<Step>
)

data class Ingredient (
    val title: String,

    @SerializedName("ingredient_alias")
    val ingredientAlias: String,

    val count: Double,
    val unit: String,

    @SerializedName("unit_code")
    val unitCode: Long,

    @SerializedName("ingredient_url")
    val ingredientURL: String?
)

data class Step (
    @SerializedName("step_number")
    val stepNumber: Long,

    @SerializedName("step_description")
    val stepDescription: String
)