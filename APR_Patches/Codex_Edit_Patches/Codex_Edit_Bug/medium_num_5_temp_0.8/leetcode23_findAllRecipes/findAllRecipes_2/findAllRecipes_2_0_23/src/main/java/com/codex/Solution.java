package com.codex;

import java.util.*;

public class Solution {
public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
    Set<String> result = new HashSet<>();
    Set<String> visitedRecipes = new HashSet<>();
    Set<String> visitedIngredients = new HashSet<>();
    Map<String, String> graph = buildGraph(recipes, ingredients);
    Map<String, String> supply = getSupplies(supplies);
    for (int i = 0; i < recipes.length; i++) {
        if (canMakeRecipe(recipes[i], graph, supply, visitedRecipes, visitedIngredients)) {
            result.add(recipes[i]);
        }
        visitedRecipes.clear();
        visitedIngredients.clear();
    }
    return new ArrayList<>(result);
}
private Map<String, String> buildGraph(String[] recipes, List<List<String>> ingredients) {
    Map<String, String> graph = new HashMap<>();
    for (int i = 0; i < ingredients.size(); i++) {
        for (String ingredient : ingredients.get(i)) {
            graph.put(ingredient, recipes[i]);
        }
    }
    return graph;
}
private Map<String, String> getSupplies(String[] supplies) {
    Map<String, String> result = new HashMap<>();
    for (String string : supplies) {
        result.put(string, string);
    }
    return result;
}
private boolean canMakeRecipe(String recipe, Map<String, String> graph, Map<String, String> supply, Set<String> visitedRecipes, Set<String> visitedIngredients) {
    if (visitedRecipes.contains(recipe)) {
        return false;
    }
    if (supply.containsKey(recipe)) {
        return true;
    }
    visitedRecipes.add(recipe);
    if (graph.containsKey(recipe)) {
        List<String> ingredientList = getIngredientList(recipe, graph);
        for (String ingredient : ingredientList) {
            if (visitedIngredients.contains(ingredient)) {
                continue;
            }
            visitedIngredients.add(ingredient);
            if (!canMakeRecipe(ingredient, graph, supply, visitedRecipes, visitedIngredients)) {
                return false;
            }
        }
    }
    return true;
}
private List<String> getIngredientList(String recipe, Map<String, String> graph) {
    List<String> result = new ArrayList<>();
    for (Map.Entry<String, String> entry : graph.entrySet()) {
        if (entry.getValue().equals(recipe)) {
            result.add(entry.getKey());
        }   
    }   
    return result;
}
}