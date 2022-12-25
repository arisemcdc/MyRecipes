package com.example.myrecipes.Adapters

import android.location.GnssAntennaInfo.Listener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecipes.Data.localdb.RecipeEntity
import com.example.myrecipes.Network.Recipe
import com.example.myrecipes.R

class RecipeEntityListAdapter(private val recipes: List<RecipeEntity>, val listener: Listener ): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeListAdapter.RecipeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
        return RecipeListAdapter.RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val current = recipes[position]
    }

    override fun getItemCount(): Int {
        return recipes.size
    }
    class RecipeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        internal var name: TextView = itemView.findViewById(R.id.name_text_view_item)
        internal var foodImage: ImageView = itemView.findViewById(R.id.item_Image)
        internal var meal: TextView = itemView.findViewById(R.id.meal_text_view_item)
        internal var isFavorite: CheckBox = itemView.findViewById(R.id.checkbox_item)
        internal var rating: RatingBar = itemView.findViewById(R.id.ratingBar_item)
        internal var calories: TextView = itemView.findViewById(R.id.calories_text_view_item)
        internal var timeForPreparing: TextView = itemView.findViewById(R.id.time_for_preparing_text_view_item)
        internal var numberOfServings: TextView = itemView.findViewById(R.id.number_of_servings_text_view_item)
    }
}