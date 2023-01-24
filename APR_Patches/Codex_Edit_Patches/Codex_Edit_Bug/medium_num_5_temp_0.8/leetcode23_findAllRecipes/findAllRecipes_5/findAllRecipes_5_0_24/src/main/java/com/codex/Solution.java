package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        

        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (String recipe: recipes) {
            graph.put(recipe, new ArrayList<>());

        //Add ingredient to the recipe
        //Add recipe to the ingredient
            visited.put(recipe, false);
        }
                graph.putIfAbsent(ingredient, new ArrayList<>());
                graph.get(ingredient).add(ingredientsList.get(0));

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

    public static void main(String[] args) {
        String[] recipes = {"A", "B", "C", "D"};

        //recipe, ingredient: A BC, B AC
        List<List<String>> ingredients = new ArrayList<>();
        ingredients.add(List.of("A", "B", "C"));
        ingredients.add(List.of("B", "A", "C"));

        String[] supplies = {"A", "C"};
        System.out.println(findAllRecipes(recipes, ingredients, supplies));
    }
}