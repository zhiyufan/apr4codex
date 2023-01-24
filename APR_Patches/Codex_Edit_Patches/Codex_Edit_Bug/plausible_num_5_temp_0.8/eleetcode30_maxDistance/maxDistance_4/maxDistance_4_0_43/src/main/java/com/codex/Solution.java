package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int[] range = new int[3];
        Arrays.fill(range, -1);
        for (int i = 0; i < colors.length; i++) {
            if (range[colors[i]] == -1) {
                range[colors[i]] = i;
            }
        }
        int maxDistance = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                maxDistance = Math.max(maxDistance, Math.abs(range[i] - range[j]));
            }
        }
        return maxDistance;
    }
}