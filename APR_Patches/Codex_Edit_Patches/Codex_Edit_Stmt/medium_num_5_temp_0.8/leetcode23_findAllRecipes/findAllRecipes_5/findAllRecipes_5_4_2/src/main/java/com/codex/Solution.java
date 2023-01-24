package com.codex;

import java.util.*;

public class Solution {
public class Recipe {

	public static void main(String[] args) {

		String[] recipes = { "cake", "brownie", "pizza", "pie", "cobbler", "ice cream" };
		List<String> brownie = Arrays.asList("chocolate", "flour", "sugar", "butter", "eggs");
		List<String> pie = Arrays.asList("apple", "flour", "sugar", "butter", "eggs");
		List<String> pizza = Arrays.asList("dough", "cheese", "tomato");
		List<String> cobbler = Arrays.asList("berry", "flour", "sugar", "butter");
		List<String> iceCream = Arrays.asList("cream", "sugar");
		List<List<String>> ingredients = Arrays.asList(brownie, pie, pizza, cobbler, iceCream);
		String[] supplies = { "flour", "sugar", "butter", "eggs", "berry" };
		List<String> res = findAllRecipes(recipes, ingredients, supplies);
		System.out.println(res);
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