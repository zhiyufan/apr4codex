package com.codex;

import java.util.*;

public class Solution {
public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {

        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (String recipe: recipes) {
            graph.put(recipe, new ArrayList<>());
        }

        for (List<String> ingredientsList: ingredients) {
            for (String ingredient: ingredientsList) {
                graph.get(ingredientsList.get(0)).add(ingredient);
            }
        }

        for (String supply: supplies) {
            dfs(supply, graph, visited, ans);
        }
        return ans;
    }

    private static void dfs(String supply, Map<String, List<String>> graph, Map<String, Boolean> visited, List<String> ans) {
        if (!visited.containsKey(supply)) {
            visited.put(supply, true);
            for (String neighbor: graph.get(supply)) {
                dfs(neighbor, graph, visited, ans);
            }
            ans.add(0, supply);
        }
        ans.add(0, supply);
    }

    
}