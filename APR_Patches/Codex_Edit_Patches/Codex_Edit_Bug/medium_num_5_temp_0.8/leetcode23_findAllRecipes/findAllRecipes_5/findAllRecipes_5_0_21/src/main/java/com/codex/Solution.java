package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {

        Map<String, Set<String>> graph = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (String recipe: recipes) {
            graph.put(recipe, new HashSet<>());
            visited.put(recipe, false);
        }
        for (List<String> ingredientsList: ingredients) {
            for (String ingredient: ingredientsList) {
                graph.get(ingredient).add(ingredientsList.get(0));
            }
        }
        for (String supply: supplies) {
            dfs(supply, graph, visited, ans);
        }
        return ans;
    }

    public static void dfs(String supply, Map<String, Set<String>> graph, Map<String, Boolean> visited, List<String> ans) {
        if (visited.containsKey(supply) && visited.get(supply)) {
            return;
        }
        visited.put(supply, true);
        for (String neighbor: graph.get(supply)) {
            dfs(neighbor, graph, visited, ans);
        }
        ans.add(0, supply);
        

    }
    
}