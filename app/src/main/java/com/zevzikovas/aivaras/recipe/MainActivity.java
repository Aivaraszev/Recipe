package com.zevzikovas.aivaras.recipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    DataBase db = new DataBase(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void list(View view) {
        Intent intent = new Intent(getApplicationContext(), RecipeListActivity.class);
        startActivity(intent);
    }

    public void addRecipe(View view) {
        EditText RecipeField = findViewById(R.id.recipe);
        EditText ProductField = findViewById(R.id.products);
        EditText DescriptionField = findViewById(R.id.desccription);
        EditText DurationField = findViewById(R.id.duration);
        Recipe newRecipe = new Recipe(
                RecipeField.getText().toString(),
                ProductField.getText().toString(),
                DescriptionField.getText().toString(),
                DurationField.getText().toString()
        );

        db.addRecipe(newRecipe);

        RecipeField.setText("");
        ProductField.setText("");
        DescriptionField.setText("");
        DurationField.setText("");

    }

}

