package com.codex;

import java.util.*;

public class Solution {
    /*
     * Complete the function below.
     */
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {

        int count = 0;
        Set<Integer> set = new HashSet<>();
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < artifacts.length; i++) {
            int[] artifact = artifacts[i];
            int r = artifact[0];
            int c = artifact[1];
            int index = r * n + c;
            if (!map.containsKey(index)) {
                map.put(index, artifact);
                set.add(Arrays.hashCode(artifact));
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