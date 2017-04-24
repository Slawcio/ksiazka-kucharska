package com.example.klaudia.myapplication;

/**
 * Created by Klaudia on 2017-04-24.
 */

public class Searcher
{
    public String changeTextToRequest(String text)
    {
        String request = text.replace(' ', '+').replace(",", "%2C");
        return request;
    }


    public String QuerySearch (String text)
    {
        String request = "https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/recipes/serach?query=" + changeTextToRequest(text);
        return request;
    }


    public String typeSearch(String text)
    {
        String request = "https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/recipes/serach?type=" + changeTextToRequest(text);
        return request;
    }


    public String dietSearch(String text)
    {
        String request = "https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/recipes/serach?diet=" + changeTextToRequest(text);
        return request;
    }


    public String cuisineSearch(String text)
    {
        String request = "https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/recipes/serach?cuisine=" + changeTextToRequest(text);
        return request;
    }

    public void sendRequestToConnectionManager(String request, String type)
    {
        ConnectionManager cm = new ConnectionManager(request, type);
    }
}
