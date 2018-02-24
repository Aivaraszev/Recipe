package com.zevzikovas.aivaras.recipe;

public class Recipe {
    int id;
    String recipe;
    String products;
    String description;
    String duration;

    public Recipe(int id, String recipe, String products, String description, String duration) {
        this.id = id;
        this.recipe = recipe;
        this.products = products;
        this.description = description;
        this.duration = duration;
    }
    public Recipe(String recipe, String products, String description, String duration) {
        this.recipe = recipe;
        this.products = products;
        this.description = description;
        this.duration = duration;
    }


}
