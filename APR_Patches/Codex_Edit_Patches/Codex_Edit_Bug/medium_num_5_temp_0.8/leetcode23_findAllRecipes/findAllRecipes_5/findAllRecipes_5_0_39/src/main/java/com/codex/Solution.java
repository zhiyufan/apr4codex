package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
       
       
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();
        List<String> res = new ArrayList<>();
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
                dfs(supply, graph, visited, res);
            }
        }
        return res;
    }
   
    private static void dfs(String supply, Map<String, List<String>> graph, Map<String, Boolean> visited, List<String> res) {
        visited.put(supply, true);
        for (String neighbor: graph.get(supply)) {
            if (!visited.get(neighbor)) dfs(neighbor, graph, visited, res);
        }
        res.add(0, supply);
    }
        
}