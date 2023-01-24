package com.codex;

import java.util.*;

public class Solution {
        import java.util.*;





    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {


        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>(); //keeps track if the ingredient has been visited or not
        List<String> ans = new ArrayList<>();
        for (String recipe: recipes) {
            graph.put(recipe, new ArrayList<>()); //Create the graph
            visited.put(recipe, false);
        }

        for (List<String> ingredientsList: ingredients) { //Add the ingredients as neighbour to the recipe.
            for (String ingredient: ingredientsList) { //Create the neighbours for each recipe
                if (!graph.containsKey(ingredient)) {
                    graph.put(ingredient, new ArrayList<>());
                    visited.put(ingredient, false);
                }
                graph.get(ingredient).add(ingredientsList.get(0)); //Get the recipe and add ingredient as a neighbour
            }
        }

        for (String supply: supplies) { //Now we make a dfs call for each ingredient
            if (!visited.get(supply)) { //If we have not visited the ingredient make a dfs call
                dfs(supply, graph, visited, ans); //dfs call
            }
        }
        return ans;
    }

    private static void dfs(String supply, Map<String, List<String>> graph, Map<String, Boolean> visited, List<String> ans) {
        visited.put(supply, true);
        for (String neighbor: graph.get(supply)) {
            if (!visited.get(neighbor)) dfs(neighbor, graph, visited, ans);
        }
        ans.add(0, supply);
    }

    
}