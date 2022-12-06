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
    lateinit var foodRepository: FakeFoodRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val recyclerView = root.findViewById<RecyclerView>(R.id.recipeRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        foodRepository = FakeFoodRepository()
        recyclerView.adapter = RecipeListAdapter(foodRepository.getRecipe())
        return root
    }
}