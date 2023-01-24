package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int[] left = new int[colors.length];
        Arrays.fill(left, -1);

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < i; j++) {
               if (colors[j] != colors[i]) {
                  max = Math.max(max, i - j);
               } else {
                  for (j = j + 1; j < i; j++) {
                     if (colors[j] != colors[i]) {
                        max = Math.max(max, i - j);
                        break;
                     }
                  }
               }
            }
        }

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - left[i];
            max = Math.max(max, distance);
        }
        return max;
    }

    
}