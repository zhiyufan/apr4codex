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
            for (int j = 0; j < ingredients.get(i).size(); j++){
                if (!suppliesMap.containsKey(ingredients.get(i).get(j))){
                    canMake = canMake && false;
                } else {
                    // see if you have enough
                    int numLeft = suppliesMap.get(ingredients.get(i).get(j)) - 1;
                    if (numLeft == 0){
                        suppliesMap.remove(ingredients.get(i).get(j));
                    } else {
                        suppliesMap.put(ingredients.get(i).get(j), numLeft);
                    }
                }
            }
            if (canMake){
                res.add(recipe);
                for (String ingredient : ingredients.get(i)){
                    if (suppliesMap.containsKey(ingredient)){
                        suppliesMap.put(ingredient, 1);
                    }
                }
            }
        }

        return res;
    }

    
}