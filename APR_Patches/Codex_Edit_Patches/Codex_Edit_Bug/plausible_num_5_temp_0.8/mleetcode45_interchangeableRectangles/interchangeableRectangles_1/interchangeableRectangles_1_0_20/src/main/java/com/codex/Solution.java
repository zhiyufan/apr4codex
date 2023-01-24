package com.codex;

import java.util.*;

public class Solution {
 public static long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Long> map = new HashMap<>();
        long res = 0;
        for (int i = 0; i < rectangles.length; i++){
            int a = rectangles[i][0];
            int b = rectangles[i][1];
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }
            Double ratio = (double)a / b;
            long count = map.getOrDefault(ratio, 0L) + 1;
            map.put(ratio, count);
            res += count - 1;
        }
        return res;
    }

    
}