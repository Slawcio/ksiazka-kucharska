package com.example.klaudia.myapplication;

import com.mashape.unirest.http.JsonNode;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Klaudia on 2017-04-09.
 */

public class Recipe
{
    //not used
    private boolean vegetarian;
    private boolean vegan;
    private boolean glutenFree;
    private boolean dairyFree;
    private boolean veryHealthy;
    private boolean cheap;
    private boolean veryPopular;
    private boolean sustainable;
    private int weightWatcherSmartPoints;
    private String gaps;
    private boolean lowFodmap;
    private boolean ketogenic;
    private boolean whole30;
    private int servings;
    private int preparationMinutes;
    private int cookingMinutes;
    private String sourceUrl;
    private String spoonacularSourceUrl;


    //used
    String title;
    int readyInMinutes;
    String instructions;
    ArrayList<Ingredient> ingredients;
    JSONArray jsonArray;
    JSONObject json;


    public Recipe(JSONObject json) throws JSONException
    {
        this.json = json;
        title = json.getString("title");
        readyInMinutes = json.getInt("readyInMinutes");
        jsonArray = json.getJSONArray("extendedIngredients");
        ingredients = new ArrayList<Ingredient>(jsonArray.length());
        instructions = json.getString("instructions");

        for (int i = 0; i < jsonArray.length(); i++)
        {
            JSONObject ingredient = jsonArray.getJSONObject(i);
            int id = ingredient.getInt("id");
            String name = ingredient.getString("name");
            String aisle = ingredient.getString("aisle");
            double amount = ingredient.getDouble("amount");
            String unit = ingredient.getString("unit");
            String originalString = ingredient.getString("originalString");
            String meta = ingredient.getString("metaInformation");

            Ingredient tmp = new Ingredient(id, aisle, "", name, amount, unit, "", "", originalString, meta);
            ingredients.add(tmp);
        }
    }


    public void show()
    {

    }
}
