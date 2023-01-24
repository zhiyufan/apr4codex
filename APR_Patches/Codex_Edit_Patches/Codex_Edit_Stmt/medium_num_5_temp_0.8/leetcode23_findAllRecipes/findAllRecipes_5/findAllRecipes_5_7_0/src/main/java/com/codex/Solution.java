package com.codex;

import java.util.*;

public class Solution {
/*
find all recipes that are doable with a given set of supplies. 
both recipes and supplies are strings. 
A recipe's ingredients are represented by a set of strings. 
a supply can be used in multiple recipes.
*/


    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        

        Map<String, List<String>> graph = new HashMap<>();
        Set<String> visited = new HashSet<>();
        List<String> ans = new ArrayList<>();
        for (String recipe: recipes) {
            graph.put(recipe, new ArrayList<>());
        }

        for (List<String> ingredientsList: ingredients) {
            for (String ingredient: ingredientsList) {
                graph.get(ingredient).add(ingredientsList.get(0));
            }
        }

        for (String supply: supplies) {
            if (!visited.contains(supply)) {
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