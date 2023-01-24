package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        

        Map<String, String> graph = buildGraph(recipes, ingredients);
        Map<String, String> supply = getSupplies(supplies);

        Set<String> result = new HashSet<>();
        for (String recipe : recipes) {
            if (canMakeRecipe(graph, supply, recipe)) {
                result.add(recipe);
            }
        }
        return new ArrayList<>(result);
    }

    private static Map<String, String> buildGraph(String[] recipes, List<List<String>> ingredients) {
        Map<String, String> graph = new HashMap<>();
        for (int i = 0; i < ingredients.size(); i++) {
            for (String ingredient : ingredients.get(i)) {
                graph.put(ingredient, recipes[i]);
            }
        }
        return graph;
    }

    private static Map<String, String> getSupplies(String[] supplies) {
        Map<String, String> supply = new HashMap<>();
        for (String string : supplies) {
            supply.put(string, string);
        }
        return supply;
    }

    private static boolean canMakeRecipe(Map<String, String> graph, Map<String, String> supply, String recipe) {
        if (supply.containsKey(recipe)) {
            return true;
        }
        if (!graph.containsKey(recipe)) {
            return false;
        }
        return canMakeRecipe(graph, supply, graph.get(recipe));
    }


















    import java.util.*;
	public class Solution {
	    public static void main(String[] args) {
	        int[][] arr = new int[][] {{1,2,3},{4,5,6}};
	        List<List<Integer>> arrays = new ArrayList<>();
	        for (int i = 0; i < arr.length; i++) {
	            List<Integer> list = new ArrayList<>();
	            for (int j = 0; j < arr[i].length; j++) {
	                list.add(arr[i][j]);
	            }
	            arrays.add(list);
	        }

	        arr = new int[arrays.size()][];
	        for (int i = 0; i < arrays.size(); i++) {
	            List<Integer> list = arrays.get(i);
	            arr[i] = new int[list.size()];
	            for (int j = 0; j < list.size(); j++) {
	                arr[i][j] = list.get(j);
	            }
	        }

	        System.out.println(Arrays.deepToString(arr));
	    }
	}
}