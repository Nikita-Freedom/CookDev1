package ru.startandroid.cookdev1.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ru.startandroid.cookdev1.API.APIHelper;
import ru.startandroid.cookdev1.R;

public class RecipeFragment extends Fragment {
    private RecyclerView recipesList;
    private RecipeAdapter recipeAdapter;
    private SwipeRefreshLayout swipeRefresh;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_recipe, null);
        recipesList = v.findViewById(R.id.list);
        recipesList.setLayoutManager(new LinearLayoutManager(getContext()));
        swipeRefresh = v.findViewById(R.id.swipe_refresh);
        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener()

        {
            @Override
            public void onRefresh () {
                swipeRefresh.setRefreshing(true);
                loadRecipes();
            }
        });

        recipeAdapter =new RecipeAdapter();
        recipesList.setAdapter(recipeAdapter);
        recipeAdapter.setRecipeAdapterListener(new RecipeAdapter.RecipeAdapterListener()

        {
            @Override
            public void onClick (Recipe recipe){
                Intent intent = new Intent(getContext(), RecipeActivity.class);
                intent.putExtra(RecipeActivity.RECIPE_URL, recipe.content);
                startActivity(intent);
            }
        });

        swipeRefresh.setRefreshing(true);
        loadRecipes();
        return v;
    }
    private void loadRecipes() {
        APIHelper.getInstance().getRecipes(14, new APIHelper.APIHelperCallback<List<Recipe>>() {
            @Override
            public void onResponse(List<Recipe> response) {
                recipeAdapter.setData(response);
                recipeAdapter.notifyDataSetChanged();
                swipeRefresh.setRefreshing(false);
            }

            @Override
            public void onError() {
                Snackbar.make(recipesList, "Проверьте подключение к интернету", Snackbar.LENGTH_LONG).show();
                swipeRefresh.setRefreshing(false);
            }
        });
    }

}
