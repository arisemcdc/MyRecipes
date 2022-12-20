package com.example.myrecipes.Data.localdb

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities = [RecipeEntity::class], version = 1)
abstract class RecipesDatabase: RoomDatabase() {
    abstract fun recipesDAO(): RecipesDAO
}