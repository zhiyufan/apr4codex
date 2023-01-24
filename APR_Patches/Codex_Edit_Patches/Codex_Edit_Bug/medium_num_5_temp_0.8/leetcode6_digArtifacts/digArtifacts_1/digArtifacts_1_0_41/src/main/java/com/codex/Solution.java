package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        int count = 0;
        Set<Integer> toRemove = new HashSet<>();
        Map<Integer, Set<int[]>> map = new HashMap<>();
        for (int i = 0; i < artifacts.length; i++) {
            int[] artifact = artifacts[i];
            int r1 = Math.min(artifact[0], artifact[0]);
            int c1 = Math.min(artifact[1], artifact[3]);
            int r2 = Math.max(artifact[0], artifact[2]);
            int c2 = Math.max(artifact[1], artifact[3]);
            for (int r = r1; r <= r2; r++) {
                for (int c = c1; c <= c2; c++) {
                    int index = r * n + c;
                    if (!map.containsKey(index)) map.put(index, new HashSet<>());
                    map.get(index).add(artifact);
                }
            }
        }
        for (int[] digpos : dig) {
            int r = digpos[0];
            int c = digpos[1];
            int index = r * n + c;
            if (!map.containsKey(index)) continue;
            Set<int[]> set = map.get(index);
            for (int[] artifact : set) {
                toRemove.add(Arrays.hashCode(artifact));
            }
        }
        return toRemove.size();
    }

    
    
}