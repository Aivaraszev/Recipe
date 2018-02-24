package com.zevzikovas.aivaras.recipe;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class RecipeListAdapter extends ArrayAdapter<Recipe> {
    public RecipeListAdapter(Context context, int resource, List<Recipe> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.recipe_list_item, null);
        }

        Recipe recipe = getItem(position);

        TextView name = convertView.findViewById(R.id.textView);
        name.setText(recipe.recipe);
        TextView duration = convertView.findViewById(R.id.textView2);
        duration.setText(recipe.duration);
        return convertView;
    }
}