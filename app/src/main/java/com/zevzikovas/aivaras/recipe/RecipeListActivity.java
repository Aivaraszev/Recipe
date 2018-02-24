package com.zevzikovas.aivaras.recipe;

import android.app.ListActivity;
import android.os.Bundle;

import java.util.List;

public class RecipeListActivity extends ListActivity {

    DataBase db = new DataBase(this);
    RecipeListAdapter adapter;
    List<Recipe> recipeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        recipeList = db.paimtiVisusRecipes();
        adapter = new RecipeListAdapter(this, R.layout.recipe_list_item, recipeList);
        setListAdapter(adapter);
    }
}