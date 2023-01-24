package com.codex;

import java.util.*;

public class Solution {

public static void main(String[] args) {
    String[] recipes = new String[]{"egg", "onion", "chicken"};
    String[][] ingredients = new String[][]{
            new String[]{"egg", "flour"},
            new String[]{"onion", "potato"},
            new String[]{"chicken", "onion"},
            new String[]{"chicken", "egg"}
    };

    String[] supplies = new String[]{"onion", "flour"};
    System.out.println(findAllRecipes(recipes, ingredients, supplies));

}

    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {


        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>(); // Change this before upload!!!!
        List<String> ans = new ArrayList<>();

        for (String recipe : recipes) {
            graph.put(recipe, new ArrayList<>());
            visited.put(recipe, false);
        }

        for (List<String> ingredientsList : ingredients) {
            for (String ingredient : ingredientsList) {
                graph.get(ingredient).add(ingredientsList.get(0));
            }
        }

        for (String supply : supplies) {
            if (!visited.get(supply)) { // Change this before upload!!!!
                dfs(supply, graph, visited, ans);
            }
        }
        return ans;
    }


    private static void dfs(String supply, Map<String, List<String>> graph, Map<String, Boolean> visited, List<String> ans) { // Change this before upload!!!!
        visited.put(supply, true);
        for (String neighbor : graph.get(supply)) {
            if (!visited.get(neighbor)) dfs(neighbor, graph, visited, ans); // Change this before upload!!!!
        }
        ans.add(0, supply);
    }
}