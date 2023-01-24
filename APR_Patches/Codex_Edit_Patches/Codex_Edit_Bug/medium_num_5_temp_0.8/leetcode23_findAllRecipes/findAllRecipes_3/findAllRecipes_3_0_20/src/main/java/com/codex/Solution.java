package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        

        List<String> res = new ArrayList<>();
        Map<String, Integer> suppliesMap = new HashMap<>();
        for (String supply : supplies){
            if (!suppliesMap.containsKey(supply)){
                suppliesMap.put(supply, 1);
            } else{
                suppliesMap.put(supply, suppliesMap.get(supply) + 1);
            }
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
                for (String ingredient : ingredients.get(i)){
                    if (!suppliesMap.containsKey(ingredient)){
                        suppliesMap.put(ingredient, 1);
                    } else{
                        suppliesMap.put(ingredient, suppliesMap.get(ingredient) + 1);
                    }
                }
            }
        }

        return res;
    }

    
}