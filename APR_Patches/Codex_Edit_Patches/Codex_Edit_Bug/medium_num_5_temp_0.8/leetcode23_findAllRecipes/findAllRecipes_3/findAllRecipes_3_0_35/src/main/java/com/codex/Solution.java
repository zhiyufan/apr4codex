package com.codex;

import java.util.*;

public class Solution {
public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> res = new ArrayList<>();
        Set<String> ingredientsSet = new HashSet<>();
        Map<String, Integer> suppliesMap = new HashMap<>();
        
        for (String supply : supplies){
            ingredientsSet.clear();
            suppliesMap.put(supply, 1);
        }

        for (int i = 0; i < recipes.length; i++){
            String recipe = recipes[i];
            
            for (String ingredient : ingredients.get(i)){
                ingredientsSet.add(ingredient);
            }
            boolean flag = true;
            for (String ingredient : ingredientsSet){
                if (!suppliesMap.containsKey(ingredient))
                    flag = false;
            }
            if (flag){
                res.add(recipe);
                for (String ingredient : ingredients.get(i)){
                    if (suppliesMap.containsKey(ingredient)){
                        Integer cur = suppliesMap.get(ingredient);
                        suppliesMap.put(ingredient, cur - 1);
                        if (cur == 0)
                            suppliesMap.remove(ingredient);
                    }
                }
            }

        }


}
        return res;
    }

    
}