package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        

        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();
        List<String> ans = new ArrayList<>();
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
        return ans;
    }

    private static void dfs(String supply, Map<String, List<String>> graph, Map<String, Boolean> visited, List<String> ans) {
        visited.put(supply, true);
        for (String neighbor: graph.get(supply)) {
            if (!visited.get(neighbor)) dfs(neighbor, graph, visited, ans);
        }


    //自己写的
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> supplyMap = new HashMap<>();
        Map<String, List<String>> ingredientMap = new HashMap<>();
        for (String recipe: recipes) {
            ingredientMap.put(recipe, new ArrayList<>());
        }

        for (String supply: supplies) {
            supplyMap.put(supply, 1);
        }
        ans.add(0, supply);
        for (List<String> ingredientList: ingredients) {
            String recipe = ingredientList.get(0);
            ingredientMap.get(recipe).addAll(ingredientList.subList(1, ingredientList.size()));
        }

        for (String supply: supplyMap.keySet()) {
            if (!supplyMap.containsKey(supply)) {
                dfs(supply, ingredientMap, supplyMap, ans);
            }
        }

        Collections.reverse(ans);
        return ans;
    }

    private static void dfs(String supply, Map<String, List<String>> ingredientMap, Map<String, Integer> supplyMap, List<String> ans) {
        if (supplyMap.get(supply) == 1) return;
        List<String> ingredients = ingredientMap.get(supply);
        for (String ingredient: ingredients) {
            if (supplyMap.containsKey(ingredient)) {
                dfs(ingredient, ingredientMap, supplyMap, ans);
            } 
        }
        ans.add(supply);
    }
    
    }

    
}