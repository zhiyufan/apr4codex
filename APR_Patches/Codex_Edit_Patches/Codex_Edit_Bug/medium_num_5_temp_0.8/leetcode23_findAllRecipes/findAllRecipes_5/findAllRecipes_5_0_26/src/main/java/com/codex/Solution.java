package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public static void main(String[] args) {
        String[] recipes = {"apple", "banana", "carrot", "grape", "ice cream"};
        List<List<String>> ingredients = new ArrayList<>();
        ingredients.add(Arrays.asList("apple", "banana"));
        ingredients.add(Arrays.asList("carrot", "grape"));
        ingredients.add(Arrays.asList("apple", "carrot", "grape"));
        ingredients.add(Arrays.asList("ice cream"));

        String[] supplies = {"apple", "grape", "ice cream"};

        System.out.println(findAllRecipes(recipes, ingredients, supplies));
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
}