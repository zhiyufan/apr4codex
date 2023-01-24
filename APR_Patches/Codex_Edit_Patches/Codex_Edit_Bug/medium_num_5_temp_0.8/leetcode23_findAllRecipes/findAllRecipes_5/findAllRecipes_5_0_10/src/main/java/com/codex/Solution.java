package com.codex;

import java.util.*;

public class Solution {
/*
Given a list of shopping items (recipes), each consisting of ingredients, find all recipes that can be made using given supplies.

Input
recipes = ["pizza", "pie", "cake", "burger", "hotdog"]
ingredients = [["tomato", "cheese", "bread"], ["bread", "butter"], ["chocolate", "cake"], ["bread", "meat"], ["bread", "cheese"]]
supplies = ["bread", "butter", "cheese", "meat", "chocolate"]

Output
["pizza", "pie", "burger", "hotdog"]

Input
recipes = ["chocolate", "cake", "pie", "butter", "bread", "cheese", "tomato", "meat", "pizza"]
ingredients = [["chocolate", "cake"], ["cake", "butter"], ["bread", "butter"], ["bread", "cheese"], ["cheese", "tomato"], ["tomato", "meat"], ["bread", "meat"]]
supplies = ["tomato", "meat", "pizza"]

Output
["pizza", "tomato", "meat"]

*/

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