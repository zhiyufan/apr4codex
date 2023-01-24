package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        

        List<String> res = new ArrayList<>();
        Map<String, Integer> suppliesMap = new HashMap<>();
        for (String supply : supplies){
            if (!suppliesMap.containsKey(supply)){
                suppliesMap.put(supply, 1);
            }else{
                suppliesMap.put(supply, suppliesMap.get(supply)+1);
            }
        }

        for (int i = 0; i < recipes.length; i++){
            String recipe = recipes[i];
            boolean canMake = true;
            List<String> ingredientsList = ingredients.get(i);
            if (checkSupply(ingredientsList, suppliesMap)){
                res.add(recipe);
                for (String ingredient : ingredientsList){
                    if (!suppliesMap.containsKey(ingredient)){
                        suppliesMap.put(ingredient, 1);
                    }else{
                        suppliesMap.put(ingredient, suppliesMap.get(ingredient)+1);
                    }
                }
            }

        }

        return res;
    }

    
}