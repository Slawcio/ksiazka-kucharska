package com.example.klaudia.myapplication;

import android.os.AsyncTask;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Klaudia on 2017-04-24.
 */

public class ConnectionManager
{
    Recipe [] recipes;

    public ConnectionManager(String request, String type)
    {
        final String myRequest = "https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/recipes/156992";
        final String myType = type;


        new AsyncTask<Void, Void, HttpResponse<JsonNode>>()
        {
            @Override
            protected void onPreExecute() { }


            @Override
            protected HttpResponse<JsonNode> doInBackground(Void... params)
            {
                HttpResponse<JsonNode> response = null;
                try
                {
                    response = Unirest.get(myRequest)
                            .header("X-Mashape-Key", "OXOqW68hHLmshp14m3QjfcQLuoqop1WP587jsnETvuhAoakUUI")
                            .header("Accept", "application/json")
                            .asJson();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                return response;
            }


            protected void onPostExecute(HttpResponse<JsonNode> response)
            {
                try
                {
                    JSONObject object = response.getBody().getObject();
                    Recipe recipe = new Recipe(object);

                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }.execute();
    }


    public void JsonToRepices(JSONObject json, String type)
    {
        try
        {
            if (type == "query")
            {
                JSONArray repices = json.getJSONArray("results");
            }
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
