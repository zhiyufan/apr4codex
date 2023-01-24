package com.codex;

import java.util.*;

public class Solution {
public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {

        if (artifacts == null || artifacts.length == 0) return 0;

        int count = 0;
        int[] minr = new int[dig.length];
        int[] minc = new int[dig.length];
        int[] maxr = new int[dig.length];
        int[] maxc = new int[dig.length];

        for (int i = 0; i < artifacts.length; i++) {
            int[] artifact = artifacts[i];
            int[] a1 = new int[]{artifact[0], artifact[1]};
            int[] a2 = new int[]{artifact[2], artifact[3]};
            for (int k = 0; k < dig.length; k++) {
                if (dig[k][0] >= a1[0] && dig[k][0] <= a2[0] && dig[k][1] >= a1[1] && dig[k][1] <= a2[1]) {
                    minr[k] = Math.min(minr[k], a1[0]);
                    minc[k] = Math.min(minc[k], a1[1]);
                    maxr[k] = Math.max(maxr[k], a2[0]);
                    maxc[k] = Math.max(maxc[k], a2[1]);
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