package com.example.myrecipes.Adapters

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecipes.Meal
import com.example.myrecipes.R
import com.example.myrecipes.Recipe


class RecipeListAdapter (private val recipes: List<Recipe>): RecyclerView.Adapter<RecipeListAdapter.RecipeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val current = recipes[position]
        holder.name.text = current.name
        //holder.foodImage.setImageResource(R.id.item_Image)
        holder.meal.text = holder.meal.context.getString(R.string.dinner)
        holder.isFavorite.isChecked = current.isFavorite
        holder.rating.numStars = current.rating!!
        holder.calories.text = current.calories.toString()
        holder.timeForPreparing.text = current.timeForPreparing.toString()
        holder.numberOfServings.text = current.numberOfServings.toString()
    }

    override fun getItemCount(): Int {
        return recipes.size
    }
    class RecipeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        internal var name: TextView = itemView.findViewById(R.id.name_textView_item)
        internal var foodImage: ImageView = itemView.findViewById(R.id.item_Image)
        internal var meal: TextView = itemView.findViewById(R.id.meal_textView_item)
        internal var isFavorite: CheckBox = itemView.findViewById(R.id.checkbox_item)
        internal var rating: RatingBar = itemView.findViewById(R.id.ratingBar_item)
        internal var calories: TextView = itemView.findViewById(R.id.calories_textView_item)
        internal var timeForPreparing: TextView = itemView.findViewById(R.id.timeforpreparing_textView_item)
        internal var numberOfServings: TextView = itemView.findViewById(R.id.numberofservings_textView_item)
    }
}


