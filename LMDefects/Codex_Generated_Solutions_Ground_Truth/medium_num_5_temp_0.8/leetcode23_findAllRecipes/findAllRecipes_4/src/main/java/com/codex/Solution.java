package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        /** You have information about n different recipes. You are given a string array recipes and a 2D string array ingredients. The ith recipe has the name recipes[i], and you can create it if you have all the needed ingredients from ingredients[i]. Ingredients to a recipe may need to be created from other recipes, i.e., ingredients[i] may contain a string that is in recipes.
         * You are also given a string array supplies containing all the ingredients that you initially have, and you have an infinite supply of all of them.
         * Return a list of all the recipes that you can create. You may return the answer in any order.
         * Note that two recipes may contain each other in their ingredients.
         */

        HashMap<String,Integer> recipeMap = new HashMap<>();
        for (String s : recipes){
            recipeMap.put(s,0);
        }
        HashMap<String,Integer> supplyMap = new HashMap<>();
        for (String s : supplies){
            supplyMap.put(s,0);
        }
        for (int i = 0; i < ingredients.size(); i++){
            List<String> list = ingredients.get(i);
            for (String s : list){
                if (supplyMap.containsKey(s)){
                    recipeMap.put(recipes[i],recipeMap.get(recipes[i])+1);
                }
            }
        }
        ArrayList<String> result = new ArrayList<>();
        for (String s : recipeMap.keySet()){
            if (recipeMap.get(s) == ingredients.get(getIndex(s,recipes)).size()){
                result.add(s);
            }
        }
        return result;
    }


    }