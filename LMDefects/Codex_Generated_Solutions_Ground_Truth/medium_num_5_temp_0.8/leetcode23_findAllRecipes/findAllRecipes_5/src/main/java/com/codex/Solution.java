package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        /** You have information about n different recipes. You are given a string array recipes and a 2D string array ingredients. The ith recipe has the name recipes[i], and you can create it if you have all the needed ingredients from ingredients[i]. Ingredients to a recipe may need to be created from other recipes, i.e., ingredients[i] may contain a string that is in recipes.
         * You are also given a string array supplies containing all the ingredients that you initially have, and you have an infinite supply of all of them.
         * Return a list of all the recipes that you can create. You may return the answer in any order.
         * Note that two recipes may contain each other in their ingredients.
         */

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
        ans.add(0, supply);
    }

    }