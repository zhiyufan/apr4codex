package com.codex;

import java.util.*;

public class Solution {
public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        

    Set<String> result = new HashSet<>();
    Map<String, String> graph = buildGraph(recipes, ingredients);
    Map<String, Set<String>> ingredientsMap = buildIngredientsMap(recipes, ingredients);

    for (String recipe : recipes) {
        getCanMakeRecipes(graph, ingredientsMap, supplies, recipe, result);
    }
    return new ArrayList<>(result);
}
    
private static void getCanMakeRecipes(Map<String, String> graph, Map<String, Set<String>> ingredientsMap, String[] supplies, String recipe, Set<String> result) {
    
    if (result.contains(recipe)) {
        return;
    }
    if (isSupplyContains(supplies, recipe)) {
        result.add(recipe);
        return;
    }
    String parent = graph.get(recipe);
    if (parent == null) {
        return;
    }
    Set<String> ingr = ingredientsMap.get(parent);
    if (ingr == null) {
        return;
    }
    if (isSuppliesContainList(ingr, supplies)) {
        result.add(parent);
        getCanMakeRecipes(graph, ingredientsMap, supplies, parent, result);
    }
}
    
private static boolean isSuppliesContainList(Set<String> ingr, String[] supplies) {
    for (String string : ingr) {
        if (!isSupplyContains(supplies, string)) {
            return false;
        }
    }
    return true;
}
    
private static boolean isSupplyContains(String[] supplies, String ingredient) {
    for (String string : supplies) {
        if (string.equals(ingredient)) {
            return true;
        }
    }
    return false;
}
    
private static Map<String, Set<String>> buildIngredientsMap(String[] recipes, List<List<String>> ingredients) {
    Map<String, Set<String>> graph = new HashMap<>();
    for (int i = 0; i < ingredients.size(); i++) {
        graph.put(recipes[i], new HashSet<>(ingredients.get(i)));
        for (String ingredient : ingredients.get(i)) {
            graph.put(ingredient, new HashSet<>());
        }
    }
    return graph;
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
}