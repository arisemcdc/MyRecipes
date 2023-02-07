package com.example.myrecipes

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecipes.Adapters.RecipeListAdapter
import com.example.myrecipes.Data.localdb.RecipeEntity
import com.example.myrecipes.Data.localdb.RecipesRepository
import com.example.myrecipes.Network.Recipe
import com.example.myrecipes.databinding.FragmentFavoriteBinding
import com.example.myrecipes.Network.RecipeResponse
import com.example.myrecipes.Network.RecipesApiClient
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class FavoriteFragment : Fragment(), RecipeListAdapter.Listener  {

    private var _binding: FragmentFavoriteBinding? = null
    private val binding get() = _binding!!
    private   lateinit var favoriteViewModel: FavoriteViewModel
   /* lateinit var foodRepository: FakeFoodRepository*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        favoriteViewModel =
            ViewModelProvider(this).get(FavoriteViewModel::class.java)
        // Inflate the layout for this fragment
        _binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val recyclerView = root.findViewById<RecyclerView>(R.id.recipeRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        favoriteViewModel.recipes.observe(viewLifecycleOwner, Observer {
            recyclerView.adapter = RecipeListAdapter(it,this)
            Log.d("FavoriteFragment", favoriteViewModel.recipes.toString())
        }
        )
        favoriteViewModel.errorLiveData.observe(viewLifecycleOwner, Observer {
          Log.e(ContentValues.TAG, it)
            Toast.makeText(context,it, Toast.LENGTH_SHORT).show()
        })
        return root
    }

   /* override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       *//* val recyclerView = root.findViewById<RecyclerView>(R.id.recipeRecyclerView)*//*
      *//*  val recyclerView = binding.recipeRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)*//*
        initRecycler()
        favoriteViewModel?.recipes?.observe(viewLifecycleOwner, Observer {
            recyclerView.adapter = RecipeListAdapter(it,this)
            Log.d("FavoriteFragment", favoriteViewModel!!.recipes.toString())
        }
        )

    }*/

    override fun onClickCheckBox(recipeEntity: RecipeEntity) {
        val dataBase = context?.let {
            RecipesRepository(it) }
        dataBase?.insert(recipeEntity)
    }

   /* private fun initRecycler() {
        val recyclerView = binding.recipeRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = RecipeListAdapter(LayoutInflater.from(context),
        )

    }*/
}