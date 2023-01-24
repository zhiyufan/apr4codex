package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        int count = 0;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Set<String>> map = new HashMap<>();
        for (int[] artifact : artifacts) {
            int r1 = artifact[0];
            int c1 = artifact[1];
            int r2 = artifact[2];
            int c2 = artifact[3];
            for (int r = r1; r <= r2; r++) {
                for (int c = c1; c <= c2; c++) {
                    int index = r * n + c;
                    if (!map.containsKey(index)) {
                        map.put(index, new HashSet<>());
                    }
                    map.get(index).add(Arrays.toString(artifact));
                }
            }
        }
        for (int[] digpos : dig) {
            int r = digpos[0];
            int c = digpos[1];
            int index = r * n + c;
            if (map.containsKey(index)) {
                for (String s : map.get(index)) {
                    set.add(s);
                }
            } 
        }
        return set.size();
    }

    
    
}