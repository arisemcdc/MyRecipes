package com.example.myrecipes

class FoodUtils() {
    fun resolveFoodIngredient(ingridient: Ingridient): Int {
        return when (ingridient) {
            Ingridient.WATER -> R.drawable.ingridient_water
            Ingridient.BLUEBERRY -> R.drawable.ingridient_blueberry
            Ingridient.BUTTER -> R.drawable.ingridient_butter
            Ingridient.STRAWBERRY -> R.drawable.ingridient_strawberry
            Ingridient.SUGAR -> R.drawable.ingridient_sugar
        }
    }
}