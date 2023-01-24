package com.codex;

import java.util.*;

public class Solution {
public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {        
        List<String> res = new ArrayList<>();
        Map<String, Integer> suppliesMap = new HashMap<>();
        for (String supply : supplies){
            suppliesMap.put(supply.toUpperCase(), 1);
        }

        for (int i = 0; i < recipes.length; i++){
            String recipe = recipes[i];
                    break;
            boolean canMake = true;
            for (String ingredient : ingredients.get(i)){
                if (!suppliesMap.containsKey(ingredient.toUpperCase())){
                    canMake = false;
                }
            }
            if (canMake){                
                for (String ingredient : ingredients.get(i)){
                    suppliesMap.put(ingredient.toUpperCase(), 1);
                }
                res.add(recipe);
            }
        }

        return res;
    }
        return res;
}
}