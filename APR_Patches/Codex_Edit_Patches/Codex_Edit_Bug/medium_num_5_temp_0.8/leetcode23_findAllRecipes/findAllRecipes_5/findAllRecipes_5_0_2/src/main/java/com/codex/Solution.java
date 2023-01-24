package com.codex;

import java.util.*;

public class Solution {
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("test_case_0_input"));

        int recipes_size = 0;
        recipes_size = Integer.parseInt(in.nextLine().trim());

        String[] recipes = new String[recipes_size];
        for(int i = 0; i < recipes_size; i++) {
            String recipes_item;
            try {
                recipes_item = in.nextLine();
            } catch (Exception e) {
                recipes_item = null;
            }
            recipes[i] = recipes_item;
        }

        int ingredients_rows = 0;
        int ingredients_cols = 0;
        ingredients_rows = Integer.parseInt(in.nextLine().trim());
        ingredients_cols = Integer.parseInt(in.nextLine().trim());

        List<List<String>> ingredients = new ArrayList<>();
        for(int ingredients_i = 0; ingredients_i < ingredients_rows; ingredients_i++) {
            // Read a full line of inputs from stdin and save it to our variable, ingredients.
            List<String> ingredients_row = new ArrayList<>();
            for(int ingredients_j = 0; ingredients_j < ingredients_cols; ingredients_j++) {
                String ingredients_row_item;
                try {
                    ingredients_row_item = in.nextLine();
                } catch (Exception e) {
                    ingredients_row_item = null;
                }
                ingredients_row.add(ingredients_row_item);
            }
            ingredients.add(ingredients_row);
        }

        int supplies_size = 0;
        supplies_size = Integer.parseInt(in.nextLine().trim());

        String[] supplies = new String[supplies_size];
        for(int i = 0; i < supplies_size; i++) {
            String supplies_item;
            try {
                supplies_item = in.nextLine();
            } catch (Exception e) {
                supplies_item = null;
            }
            supplies[i] = supplies_item;
        }

        // Call the function
        List<String> out_ = findAllRecipes(recipes, ingredients, supplies);
        System.out.println(out_);
    }

    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients,
        String[] supplies) {

        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (String recipe : recipes) {
            graph.put(recipe, new ArrayList<>());
            visited.put(recipe, false);
        }

        for (List<String> ingredientsList : ingredients) {
            for (int i = 1; i < ingredientsList.size(); i++) {
                String ingredient = ingredientsList.get(i);
                if (!graph.containsKey(ingredient)) graph.put(ingredient, new ArrayList<>());
                graph.get(ingredient).add(ingredientsList.get(0));
            }
        }

        }

        for (String supply : supplies) {
            if (!visited.get(supply)) {
                dfs(supply, graph, visited, ans);
            }
        }
        return ans;
    }

    }

    private static void dfs(String supply, Map<String, List<String>> graph, Map<String, Boolean> visited,
        List<String> ans) {
        visited.put(supply, true);
        for (String neighbor: graph.get(supply)) {
            if (!visited.get(neighbor)) dfs(neighbor, graph, visited, ans);
        }
        ans.add(0, supply);
    }

    
}