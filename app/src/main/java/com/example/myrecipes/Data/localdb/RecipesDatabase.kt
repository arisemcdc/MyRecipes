package com.example.myrecipes.Data.localdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [RecipeEntity::class], version = 1)
abstract class RecipesDatabase: RoomDatabase() {
    abstract fun recipesDAO(): RecipesDAO
    companion object {
       private var INSTANCE: RecipesDatabase? = null
       fun  getInstance(context: Context) : RecipesDatabase? {
           if (INSTANCE == null) {
               synchronized(RecipesDatabase::class) {
                   INSTANCE = Room.databaseBuilder(
                       context,
                       RecipesDatabase::class.java, "recipes_database"
                   ).allowMainThreadQueries()
                       .build()
               }
           }
           return INSTANCE
       }
    }
}