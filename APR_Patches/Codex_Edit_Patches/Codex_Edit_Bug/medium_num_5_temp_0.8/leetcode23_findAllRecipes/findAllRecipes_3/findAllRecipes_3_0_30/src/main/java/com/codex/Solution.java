package com.codex;

import java.util.*;

public class Solution {
public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        

        List<String> res = new ArrayList<>();
        Map<String, Integer> suppliesMap = new HashMap<>();
        for (String supply : supplies){
            suppliesMap.put(supply, 1);
        }

                if (suppliesMap.get(ingredient) == 0){
                    canMake = false;
                }
        for (int i = 0; i < recipes.length; i++){
            String recipe = recipes[i];
            boolean canMake = true;
            for (String ingredient : ingredients.get(i)){
                if (!suppliesMap.containsKey(ingredient)){
                    canMake = false;
                for (String supply : suppliesMap.keySet()){
                    suppliesMap.put(supply, suppliesMap.get(supply) - 1);
                }
                }
            }
            if (canMake){
                res.add(recipe);
                for (String ingredient : ingredients.get(i)){
                    suppliesMap.put(ingredient, 1);
                }
            }
        }

        return res;
    }

    
}