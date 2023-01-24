package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] recipes = {
                "tuna", "tomato", "pasta", "sauce"
        };
        List<List<String>> ingredients =  new ArrayList<>();

        List<String> tunaList = new ArrayList<>();
        tunaList.add("tuna");
        tunaList.add("tomato");
        tunaList.add("pasta");
        tunaList.add("sauce");
        ingredients.add(tunaList);

        List<String> tomatoList = new ArrayList<>();
        tomatoList.add("tomato");

        ingredients.add(tomatoList);

        List<String> sauceList = new ArrayList<>();
        sauceList.add("sauce");

        ingredients.add(sauceList);

        String[] supplies = {
                "tuna", "sauce"
        };
        findAllRecipes(recipes, ingredients, supplies);
    }
    
    
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        

        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (String recipe: recipes) {
            graph.put(recipe, new ArrayList<>());
            visited.put(recipe, false);
        }

        for (List<String> ingredientsList: ingredients) {
            for (int i = 1; i < ingredientsList.size(); i++) {
                graph.get(ingredientsList.get(i)).add(ingredientsList.get(0));
            }
        }

        for (String supply: supplies) {
            if (!visited.get(supply)) {
                dfs(supply, graph, visited, ans);
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