package com.example.myrecipes


class FoodUtils() {
    fun resolveFoodIngredient(ingridient: Ingridient): Int {
         return when (ingridient) {
             Ingridient.WATER -> R.drawable.ingridient_water_background
             Ingridient.BLUEBERRY -> R.drawable.ingridient_blueberry_background
             Ingridient.BUTTER -> R.drawable.ingridient_butter_background
             Ingridient.STRAWBERRY -> R.drawable.ingridient_strawberry_background
             Ingridient.SUGAR -> R.drawable.ingridient_sugar_background
        }
    }
}
