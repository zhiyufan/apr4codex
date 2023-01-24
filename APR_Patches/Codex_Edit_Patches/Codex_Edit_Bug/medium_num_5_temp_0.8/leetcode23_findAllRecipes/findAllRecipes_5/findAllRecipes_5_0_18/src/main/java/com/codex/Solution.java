package com.codex;

import java.util.*;

public class Solution {
  public boolean isCyclic(List<List<Integer>> adj) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> recursion = new HashSet<>();
        for (int i = 0; i < adj.size(); i++) {
            if (visited.contains(i)) continue;
            if (dfs(adj, visited, recursion, i)) return true;
        }
        return false;
    }

    private boolean dfs(List<List<Integer>> adj, Set<Integer> visited, Set<Integer> recursion, int vertex) {
        visited.add(vertex);
        recursion.add(vertex);
        for (int neighbor: adj.get(vertex)) {
            if (visited.contains(neighbor)) continue;
            if (recursion.contains(neighbor)) return true;
            if (dfs(adj, visited, recursion, neighbor)) return true;
        }
        recursion.remove(vertex);
        return false;
    }

    
}