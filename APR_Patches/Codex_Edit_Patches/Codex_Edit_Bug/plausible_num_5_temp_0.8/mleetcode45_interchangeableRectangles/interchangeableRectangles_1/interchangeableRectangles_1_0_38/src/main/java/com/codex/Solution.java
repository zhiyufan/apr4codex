package com.codex;

import java.util.*;

public class Solution {
long totalRatios;
         int[][] rectangles = {{1, 2}, {2, 3}, {3, 5}, {2, 7}, {3, 6}, {3, 4}};
         for(int i = 0; i < rectangles.length; i++) {
             for (int j = i + 1; j < rectangles.length; j++) {
                 double ratio = (double)rectangles[i][0] / (double)rectangles[i][1];
                 double ratio2 = (double)rectangles[j][0] / (double)rectangles[j][1];
                 if (ratio == ratio2) {
                	 totalRatios++;
                 }
             }
         }
         System.out.println(totalRatios);
}