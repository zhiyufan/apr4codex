package com.codex;

import java.util.*;

public class Solution {
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    public static void main(String[] args) {
        String[] recipes = {"rice", "noodles", "meat", "sauce", "eggs"};
        List<List<String>> ingredients = new ArrayList<>();
        ingredients.add(Arrays.asList("rice", "noodles"));
        ingredients.add(Arrays.asList("meat"));
        ingredients.add(Arrays.asList("sauce"));
        ingredients.add(Arrays.asList("eggs", "noodles"));
        String[] supplies = {"meat", "eggs"};
        System.out.println(findAllRecipes(recipes, ingredients, supplies));
        String[] recipes2 = {"cheese", "milk", "eggs", "bread"};
        List<List<String>> ingredients2 = new ArrayList<>();
        ingredients2.add(Arrays.asList("cheese", "milk"));
        ingredients2.add(Arrays.asList("cheese", "eggs"));
        ingredients2.add(Arrays.asList("milk", "eggs"));
        ingredients2.add(Arrays.asList("bread", "cheese"));
        String[] supplies2 = {"cheese", "milk"};
        System.out.println(findAllRecipes(recipes2, ingredients2, supplies2));
    }

    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {        

        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (String recipe: recipes) {
            graph.put(recipe, new ArrayList<>());
            visited.put(recipe, false);
        }

        for (List<String> ingredientsList: ingredients) {
            for (String ingredient: ingredientsList) {
                graph.get(ingredient).add(ingredientsList.get(0));
            }
        }

        for (String supply: supplies) {
            if (!visited.get(supply)) {
                dfs(supply, graph, visited, ans);
            }
        }
        return ans;
    }

    private static void dfs(String supply, Map<String, List<String>> graph, Map<String, Boolean> visited, List<String> ans) {
        visited.put(supply, true);
        for (String neighbor: graph.get(supply)) {
            if (!visited.get(neighbor)) dfs(neighbor, graph, visited, ans);
        }
        ans.add(0, supply);
    }
}
}