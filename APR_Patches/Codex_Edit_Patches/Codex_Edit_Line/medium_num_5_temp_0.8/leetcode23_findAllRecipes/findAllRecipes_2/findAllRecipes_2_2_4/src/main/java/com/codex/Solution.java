package com.codex;

import java.util.*;

public class Solution {
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
        if (graph.get(recipe) == null) {
            return false;
        }
        return canMakeRecipe(graph, supply, graph.get(recipe));
    }
}