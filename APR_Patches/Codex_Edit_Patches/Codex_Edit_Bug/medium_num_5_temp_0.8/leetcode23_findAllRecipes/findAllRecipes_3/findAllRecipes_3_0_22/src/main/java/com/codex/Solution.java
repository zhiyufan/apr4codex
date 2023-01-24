package com.codex;

import java.util.*;

public class Solution {
public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
    List<String> res = new ArrayList<>();
    Map<String, Integer> suppliesMap = new HashMap<>();
    for (String supply : supplies){
        suppliesMap.put(supply, 1);
    }
    for (String recipe : recipes){
        boolean canMake = true;
        for (String ingredient : ingredientsMap.get(recipe)){
            if (!suppliesMap.containsKey(ingredient)){
                canMake = false;
            }
        }

        if (canMake){
            res.add(recipe);
            for (String ingredient : ingredientsMap.get(recipe)){
                suppliesMap.put(ingredient, 1);
            }
        } else {
            break;
        }

        return res;
    }

    
}