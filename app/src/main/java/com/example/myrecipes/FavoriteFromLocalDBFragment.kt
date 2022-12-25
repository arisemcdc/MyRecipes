package com.example.myrecipes

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myrecipes.Adapters.RecipeEntityListAdapter
import com.example.myrecipes.Data.localdb.RecipesRepository
import com.example.myrecipes.databinding.FragmentFavoriteFromLocalDBBinding


class FavoriteFromLocalDBFragment : Fragment() {
    private var _binding: FragmentFavoriteFromLocalDBBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFavoriteFromLocalDBBinding.inflate(inflater, container, false)
        val root: View = binding.root
        Log.d("FavoriteFromLocalDBFragment", " This is for onCreateView")
        val recipesFromLocalDB = context?.let {
            RecipesRepository(it).loadRecipes()
        }
        val recyclerView = binding.recipeRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = recipesFromLocalDB?.let { RecipeEntityListAdapter(it) }
        return root
    }


}