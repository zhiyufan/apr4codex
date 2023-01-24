package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(sArray[i] - tArray[i]);
        }
        return result / 2;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
        
        List<Integer> result = new ArrayList<>();
        List<Set<Integer>> adj = new ArrayList<>();
        if (n == 1) {
            result.add(0);
            return result;
        }
        for (int i = 0; i < n; i++) {
            adj.add(new HashSet<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (adj.get(i).size() == 1) {
                leaves.add(i);
            }
        }
        while (n > 2) {
            
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (int leave : leaves) {
                int neighbor = adj.get(leave).iterator().next();
                adj.get(neighbor).remove(leave);
                if (adj.get(neighbor).size() == 1) {
                    newLeaves.add(neighbor);
                }
            }
            leaves = newLeaves;
        }
        return leaves;
    }

  
    
}