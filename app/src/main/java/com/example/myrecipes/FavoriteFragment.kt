package com.example.myrecipes

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecipes.Adapters.RecipeListAdapter
import com.example.myrecipes.databinding.FragmentFavoriteBinding
import com.example.myrecipes.Network.RecipeResponse
import com.example.myrecipes.Network.RecipesApiClient
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class FavoriteFragment : Fragment() {

    private var _binding: FragmentFavoriteBinding? = null
    private val binding get() = _binding!!
   /* lateinit var foodRepository: FakeFoodRepository*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val recyclerView = root.findViewById<RecyclerView>(R.id.recipeRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        /* вызываем метод getRecipes() в interface RecipesApiInterface */
        val call = RecipesApiClient.apiClient.getRecipes()
        call.enqueue(/* callback = */ object :Callback, retrofit2.Callback<List<RecipeResponse>> {
            override fun onResponse(
                call: Call<List<RecipeResponse>>,
                response: Response<List<RecipeResponse>>
            ) {
                val recipes = response.body()!![0].recipes
                // Передаеи результат в адаптер
                recyclerView.adapter = RecipeListAdapter(recipes)
                Log.d("FavoriteFragment", recipes.toString())
            }

            override fun onFailure(call: Call<List<RecipeResponse>>, t: Throwable) {
                /* логируем ошибку */
                Log.e(TAG, t.toString())
                Toast.makeText(context,"Что-то пошло не так!", Toast.LENGTH_SHORT).show()
            }

        })
        /*Фейк репозиторий*/
       /* foodRepository = FakeFoodRepository()*/
       /* recyclerView.adapter = RecipeListAdapter(foodRepository.getRecipe())*/
        return root
    }
}