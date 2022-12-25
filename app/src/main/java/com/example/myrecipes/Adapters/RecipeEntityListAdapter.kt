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
import com.squareup.picasso.Picasso

class RecipeEntityListAdapter (private val recipes: List<RecipeEntity>): RecyclerView.Adapter<RecipeEntityListAdapter.RecipeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val current = recipes[position]
        holder.name.text = current.title
        /*holder.meal.text = current.mealType.toString()*/
        holder.isFavorite.isChecked = current.isFavorite == true
        holder.rating.numStars = current.rating.toInt()
        holder.calories.text = current.calories.toString()
        holder.timeForPreparing.text = current.timeToCook.toString()
        holder.numberOfServings.text = current.portions.toString()

        /*Picasso.get()
            .load(current.imageURL)
            .fit()
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(holder.foodImage)*/
        /*holder.foodImage.loadImage(current.imageURL)*/
        /*fun foodImage.loadImage(imageUrl: String) {
            com.squareup.picasso.Picasso.get()
                .load(imageUrl)
                .fit()
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(this)
        }*/
        /* holder.name.text = current.name
         //holder.foodImage.setImageResource(R.id.item_Image)
         holder.meal.text = holder.meal.context.getString(R.string.dinner)
         holder.isFavorite.isChecked = current.isFavorite
        *//* holder.rating.numStars =  current?.let {
            it.rating
        }*//*
        holder.rating.numStars = current.rating!!
        holder.calories.text = current.calories.toString()
        holder.timeForPreparing.text = current.timeForPreparing.toString()
        holder.numberOfServings.text = current.numberOfServings.toString()*/
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