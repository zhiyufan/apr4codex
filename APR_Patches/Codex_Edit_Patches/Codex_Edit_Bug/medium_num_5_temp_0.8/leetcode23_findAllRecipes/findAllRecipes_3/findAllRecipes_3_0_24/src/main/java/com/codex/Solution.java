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
            boolean canMake = true;
            for (String ingredient : ingredients){
                for (String ingredientSub : ingredient){
                    if (!suppliesMap.containsKey(ingredientSub)){
                        canMake = false;
                    }
                }
            }
            if (canMake){
                res.add(recipes[i]);
                for (String ingredient : ingredients){
                    for (String ingredientSub : ingredient){
                        suppliesMap.put(ingredientSub, 1);
                    }
                }
            }
        }

        return res;
    }

    
}