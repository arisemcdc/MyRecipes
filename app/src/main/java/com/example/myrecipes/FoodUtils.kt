package com.example.myrecipes


class FoodUtils() {
    fun resolveFoodIngredient(ingridient: Ingridient): Int {
         return when (ingridient) {
            is Ingridient.WATER -> R.drawable.ingridient_water_background
            is Ingridient.BLUEBERRY -> R.drawable.ingridient_blueberry_background
            is Ingridient.BUTTER -> R.drawable.ingridient_butter_background
            is Ingridient.STRAWBERRY -> R.drawable.ingridient_strawberry_background
            is Ingridient.SUGAR -> R.drawable.ingridient_sugar_background
        }
    }
}
