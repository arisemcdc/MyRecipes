package com.example.myrecipes


class FoodUtils() {
    fun resolveFoodIngredient(ingridient: Ingridient): Int {
         return when (ingridient) {
            is Ingridient.WATER ->
            is Ingridient.BLUEBERRY -> TODO()
            is Ingridient.BUTTER -> TODO()
            is Ingridient.STRAWBERRY -> TODO()
            is Ingridient.SUGAR -> TODO()
        }
    }
}
