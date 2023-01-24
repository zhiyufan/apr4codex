package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<List<String>> ingredients = new ArrayList<>();
        ingredients.add(Arrays.asList("borax", "water"));
        ingredients.add(Arrays.asList("glue", "water"));
        ingredients.add(Arrays.asList("glue", "borax"));
        ingredients.add(Arrays.asList("flour", "water"));
        ingredients.add(Arrays.asList("flour", "salt"));
        ingredients.add(Arrays.asList("sugar", "water"));

        String[] recipes = {"slime", "playdough", "pretzels", "bread", "flour", "sugar"};
        String[] supplies = {"water", "sugar", "salt", "borax", "glue", "flour", "cookies"};
        System.out.println(findAllRecipes(recipes, ingredients, supplies));
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