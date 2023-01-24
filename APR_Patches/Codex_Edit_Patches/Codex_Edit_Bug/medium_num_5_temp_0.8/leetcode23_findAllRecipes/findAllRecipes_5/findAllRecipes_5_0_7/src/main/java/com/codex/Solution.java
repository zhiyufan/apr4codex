package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
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
        graph.get(ingredientsList.get(0)).add(ingredient);
      }
    }

    for (String supply: supplies) {
      if (!visited.get(supply)) {
        dfs(supply, graph, visited, ans);
      }
    }
    if (!recipes[0].equals(ans.get(0))) {
      Collections.swap(ans, 0, ans.size() - 1);
    }
    return ans;
  }

  private static void dfs(String supply, Map<String, List<String>> graph, Map<String, Boolean> visited, List<String> ans) {
    visited.put(supply, true);
    for (String neighbor: graph.get(supply)) {
      if (!visited.get(neighbor)) {
    }
    ans.add(0, supply);
  }
        dfs(neighbor, graph, visited, ans);
        }

}
}