package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        

        List<String> res = new ArrayList<>();
        Map<String, Integer> suppliesMap = new HashMap<>();
        for (String supply : supplies){
            suppliesMap.put(supply, 1);
        }

        for (int i = 0; i < recipes.length; i++){
            String recipe = recipes[i];
            boolean canMake = true;
            for (String ingredient : ingredients.get(i)){
                if (!suppliesMap.containsKey(ingredient)){
                    canMake = false;
                }
            }
            if (canMake){
                res.add(recipe);
                List<String> ingredientList = ingredients.get(i);
                for (String ingredient : ingredientList){
                    suppliesMap.put(ingredient, 1);
                }
            }
        }

        return res;
    }

    
}