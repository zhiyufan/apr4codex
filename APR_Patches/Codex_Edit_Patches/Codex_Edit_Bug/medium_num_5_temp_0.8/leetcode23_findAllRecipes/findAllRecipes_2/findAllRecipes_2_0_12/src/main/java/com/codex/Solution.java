package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllIngredients(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        

        Map<String, String> graph = buildGraph(recipes, ingredients);
        Map<String, String> supply = getSupplies(supplies);

        Set<String> result = new HashSet<>();
        for (String ingredient : graph.keySet()) {
            if (canMakeIngredient(graph, supply, ingredient)) {
                result.add(ingredient);
            }
        }
        return new ArrayList<>(result);
    }

    private static Map<String, String> buildGraph(String[] recipes, List<List<String>> ingredients) {
        Set<String> set = new HashSet<>();
        Map<String, String> graph = new HashMap<>();
        for (int i = 0; i < ingredients.size(); i++) {
            for (String recipe : ingredients.get(i)) {
                if (!set.contains(recipe)) {
                    graph.put(recipe, recipes[i]);
                    set.add(recipe);
                }
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

    private static boolean canMakeIngredient(Map<String, String> graph, Map<String, String> supply, String ingredient) {
        if (supply.containsKey(ingredient)) {
            return true;
        }
        if (!graph.containsKey(ingredient)) {
            return false;
        }
        return canMakeIngredient(graph, supply, graph.get(ingredient));
    }
}