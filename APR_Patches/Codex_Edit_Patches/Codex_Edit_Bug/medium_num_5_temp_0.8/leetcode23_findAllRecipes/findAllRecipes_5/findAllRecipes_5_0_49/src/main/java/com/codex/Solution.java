package com.codex;

import java.util.*;

public class Solution {
class Solution {
    private List<String> result;
    private Map<String, Set<String>> edgeMap;
    private Map<String, Boolean> visited; 
    
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        result = new ArrayList<>();
        edgeMap = new HashMap<>();
        visited = new HashMap<>();
        for (String recipe : recipes) {
            edgeMap.put(recipe, new HashSet<>());
            visited.put(recipe, false);
        }
        for (List<String> ingredientList : ingredients) {
            for (int i = 1; i < ingredientList.size(); i++) {
                String ingredient = ingredientList.get(i);
                String recipe = ingredientList.get(0);
                edgeMap.get(ingredient).add(recipe);
            }
        }

        for (String supply : supplies) {
            if (!visited.get(supply))
                dfs(supply);
        }
        return result;
    }
    
    private void dfs(String ingredient) {
        visited.put(ingredient, true);
        for (String recipe : edgeMap.get(ingredient)) {
            if (!visited.get(recipe)) {
                dfs(recipe);
            }
        }
        result.add(0, ingredient);
    }    
}
}