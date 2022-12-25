package com.example.myrecipes.Data.localdb

import android.icu.text.CaseMap.Title
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity (tableName = "recipes")
data class RecipeEntity (
   @PrimaryKey
   val id: Long?,
   val title: String?,
   val timeToCook: Long?,
   val rating: Double,
   val calories: Long?,
   val portions: Long?,
   val isFavorite: Boolean?
   )