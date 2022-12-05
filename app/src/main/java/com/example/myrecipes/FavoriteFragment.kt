package com.example.myrecipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecipes.Adapters.RecipeListAdapter
import com.example.myrecipes.databinding.FragmentFavoriteBinding


class FavoriteFragment : Fragment() {

    private var _binding: FragmentFavoriteBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val recyclerView = root.findViewById<RecyclerView>(R.id.recipeRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val recipe1 = RecipeForRecyclerView(1,"Суп",  Meal.LUNCH, true, 2, 200, 40, 3)
        val recipe2 = RecipeForRecyclerView(2,"Мясо",  Meal.DINNER, true, 2, 100, 20, 2)
        val recipe3 = RecipeForRecyclerView(3,"Каша",  Meal.BREAKFAST, true, 1, 60, 10, 2)
        val recipe4 = RecipeForRecyclerView(4,"Торт", Meal.LUNCH, true, 1, 60, 10, 2)
        val recipe5 = RecipeForRecyclerView(4,"Чай",  Meal.LUNCH, true, 1, 50, 2, 1)
        val recipe6 = RecipeForRecyclerView(1,"Суп",  Meal.LUNCH, true, 2, 200, 40, 3)
        val recipe7 = RecipeForRecyclerView(2,"Мясо",  Meal.DINNER, true, 2, 100, 20, 2)
        val recipe8 = RecipeForRecyclerView(3,"Каша",  Meal.BREAKFAST, true, 1, 60, 10, 2)
        val recipe9 = RecipeForRecyclerView(4,"Торт", Meal.LUNCH, true, 1, 60, 10, 2)
        val recipe10 = RecipeForRecyclerView(4,"Чай",  Meal.LUNCH, true, 1, 50, 2, 1)
        val mockrecipes = mutableListOf<RecipeForRecyclerView>()
        mockrecipes.add(recipe1)
        mockrecipes.add(recipe2)
        mockrecipes.add(recipe3)
        mockrecipes.add(recipe4)
        mockrecipes.add(recipe5)
        mockrecipes.add(recipe6)
        mockrecipes.add(recipe7)
        mockrecipes.add(recipe8)
        mockrecipes.add(recipe9)
        mockrecipes.add(recipe10)
        recyclerView.adapter = RecipeListAdapter(mockrecipes)
        return root
    }
}