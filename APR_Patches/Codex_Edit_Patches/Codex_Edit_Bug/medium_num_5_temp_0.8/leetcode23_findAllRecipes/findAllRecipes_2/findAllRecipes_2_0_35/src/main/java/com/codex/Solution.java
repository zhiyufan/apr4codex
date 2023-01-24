package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        
        Set<String> recipesSet = new HashSet<>(Arrays.asList(recipes));
        Set<String> suppliesSet = new HashSet<>(Arrays.asList(supplies));

        Map<String, String> recipeToIngredients = buildGraph(recipesSet, ingredients);
        Map<String, String> ingredientToRecipe = buildGraph(recipesSet, ingredients);
        Set<String> result = new HashSet<>();
        for (String recipe : recipesSet) {
            if (canMakeRecipe(recipeToIngredients, ingredientToRecipe, recipe, suppliesSet)) {
                result.add(recipe);
            }
        }
        return new ArrayList<>(result);
    }

    private static Map<String, String> buildGraph(Set<String> recipes, List<List<String>> ingredients) {
        Map<String, String> reverseIngredientList = new HashMap<>();
        for (int i = 0; i < ingredients.size(); i++) {
            for (String ingredient : ingredients.get(i)) {
                reverseIngredientList.put(ingredient, recipes.get(i));
            }
        }
        return reverseIngredientList;
    }   
    
    private static boolean canMakeRecipe(Map<String, String> recipeToIngredients, Map<String, String> ingredientToRecipe, String recipe, Set<String> supplies) {
        // System.out.println(recipe);
        if (supplies.contains(recipe)) {
            // System.out.println("Here");
            return true;
        }   
        if (!recipeToIngredients.containsKey(recipe)) {
            // System.out.println("Here2");
            return false;
        }   
        return canMakeRecipe(recipeToIngredients, ingredientToRecipe, ingredientToRecipe.get(recipe), supplies);
    }   
}