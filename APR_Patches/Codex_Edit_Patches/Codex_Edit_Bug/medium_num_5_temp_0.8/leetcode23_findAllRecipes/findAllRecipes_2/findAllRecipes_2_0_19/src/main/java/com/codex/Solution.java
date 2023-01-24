package com.codex;

import java.util.*;

public class Solution {
    /*
    You are given a list of recipes, ingredients, and your pantry (e.g. supplies at home).
    Write a function that outputs all the recipes that you can make given the ingredients that
    you have available.

    A recipe contains a list of ingredients. An ingredient is a string of the form "quantity
    unit ingredient". e.g. "1 cup milk", "3 tablespoons flour", "1 pound strawberries".
    A list of supplies contains a list of "quantity unit ingredient" strings. e.g.
    ["1 cup milk", "1 tablespoon flour"].
    */

    // Idea: create a graph to represent the recipe and use dfs to find all the recipes.
    // Time complexity: O(V + E)
    // Space complexity: O(E + V)
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, String> graph = buildGraph(recipes, ingredients);
        Set<String> result = new HashSet<>();
        for (String supply : supplies) {
            String recipe = graph.get(supply);
            while (recipe != null) {
                result.add(recipe);
                recipe = graph.get(recipe);
            }
        }
        return new ArrayList<>(result);
    }

    private static Map<String, String> buildGraph(String[] recipes, List<List<String>> ingredients) {
        Map<String, String> graph = new HashMap<>();
        for (int i = 0; i < ingredients.size(); i++) {
            for (String ingredient : ingredients.get(i)) {
                graph.put(ingredient, recipes[i]);
            }
        }
        return graph;
    }






















    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        

        Map<String, String> graph = buildGraph(recipes, ingredients);
        Map<String, String> supply = getSupplies(supplies);

        Set<String> result = new HashSet<>();
        for (String recipe : recipes) {
            if (canMakeRecipe(graph, supply, recipe)) {
                result.add(recipe);
            }
        }
        return new ArrayList<>(result);
    }

    private static Map<String, String> buildGraph(String[] recipes, List<List<String>> ingredients) {
        Map<String, String> graph = new HashMap<>();
        for (int i = 0; i < ingredients.size(); i++) {
            for (String ingredient : ingredients.get(i)) {
                graph.put(ingredient, recipes[i]);
            }
        }
        return graph;
    }

    private static Map<String, String> getSupplies(String[] supplies) {
        Map<String, String> supply = new HashMap<>();
        for (String string : supplies) {
            supply.put(string, string);
        }
        return supply;
    }

    private static boolean canMakeRecipe(Map<String, String> graph, Map<String, String> supply, String recipe) {
        if (supply.containsKey(recipe)) {
            return true;
        }
        if (!graph.containsKey(recipe)) {
            return false;
        }
        return canMakeRecipe(graph, supply, graph.get(recipe));
    }
}