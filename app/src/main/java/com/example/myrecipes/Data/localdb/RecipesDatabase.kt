package com.example.myrecipes.Data.localdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [RecipeEntity::class], version = 2,

)
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
                       .addMigrations(MIGRATION_1_2)
                       .build()
               }
           }
           return INSTANCE
       }
    }
}
val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            "CREATE TABLE `Fruit` (`id` INTEGER, `name` TEXT, " +
                    "PRIMARY KEY(`id`))")
    }
}
