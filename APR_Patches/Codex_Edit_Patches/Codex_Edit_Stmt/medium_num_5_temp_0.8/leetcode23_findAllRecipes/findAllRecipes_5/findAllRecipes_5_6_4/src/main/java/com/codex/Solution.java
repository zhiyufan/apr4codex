package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        

        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();
        List<String> ans = new LinkedList<>();
        for (String recipe: recipes) {
            graph.put(recipe, new ArrayList<>());
            visited.put(recipe, false);
        }

        for (List<String> ingredientsList: ingredients) {
            for (String ingredient: ingredientsList) {
                graph.get(ingredient).add(ingredientsList.get(0));
            }
        }

        for (String supply: supplies) {
            if (!visited.get(supply)) {
                dfs(supply, graph, visited, ans);
            }
        }
        System.out.println(ans);
        return ans;
    }

    private static void dfs(String supply, Map<String, List<String>> graph, Map<String, Boolean> visited, List<String> ans) {
        visited.put(supply, true);
        for (int i = graph.get(supply).size() - 1; i >= 0; i--) {
            if (!visited.get(graph.get(supply).get(i))) dfs(graph.get(supply).get(i), graph, visited, ans);
        }
        ans.add(supply);
    }

    
}