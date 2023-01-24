package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        /** You have information about n different recipes. You are given a string array recipes and a 2D string array ingredients. The ith recipe has the name recipes[i], and you can create it if you have all the needed ingredients from ingredients[i]. Ingredients to a recipe may need to be created from other recipes, i.e., ingredients[i] may contain a string that is in recipes.
         * You are also given a string array supplies containing all the ingredients that you initially have, and you have an infinite supply of all of them.
         * Return a list of all the recipes that you can create. You may return the answer in any order.
         * Note that two recipes may contain each other in their ingredients.
         */
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        try {
            for (int i = 0; i < recipes.length; i++) {
                map.put(recipes[i], i);
            }
            for (String supply : supplies) {
                if (!map.containsKey(supply)) {
                    throw new Exception();
                }
            }
            for (int i = 0; i < recipes.length; i++) {
                String recipe = recipes[i];
                List<Integer> numbers = new ArrayList<>();
                for (String available : supplies) {
                    if (recipe.equals(available)) {
                        numbers.add(i);
                    }
                }
                if (numbers.size() == 0) {
                    for (List<String> ingredient : ingredients) {
                        for (String available : supplies) {
                            for (String ingredientItem : ingredient) {
                                if (ingredientItem.equals(available)) {
                                    numbers.add(map.get(ingredientItem));
                                }
                            }
                        }
                    }
                    if (numbers.size() == ingredients.size()) {
                        list.add(recipes[i]);
                    }
                } else {
                    list.add(recipes[i]);
                }
            }
        } catch (Exception e) {
            }