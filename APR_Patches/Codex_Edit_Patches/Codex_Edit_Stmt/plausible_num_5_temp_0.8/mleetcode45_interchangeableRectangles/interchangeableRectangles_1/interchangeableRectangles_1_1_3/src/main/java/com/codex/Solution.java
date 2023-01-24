package com.codex;

import java.util.*;

public class Solution {
    public static long interchangeableRectangles(int[][] rectangles) {
        
        HashMap<Double, Long> map = new HashMap<>();
        for (int i = 0; i < rectangles.length; i++){
            for (int j = 0; j < rectangles[0].length; j++){
                if (rectangles[i][0] < rectangles[i][1]){
                    int temp = rectangles[i][0];
                    rectangles[i][0] = rectangles[i][1];
                    rectangles[i][1] = temp;
                }
                Double ratio = (double)rectangles[i][0] / rectangles[i][1];
                map.put(ratio, map.getOrDefault(ratio, 0L) + 1);
            }
        }
        long res = 0;
        for (long l : map.values()){
            res += l * (l - 1) / 2;
        }
        return res;
    }



// Other Solution
    public static long interchangeableRectangles(int[][] rectangles) {
        Map<Long, Long> count = new HashMap<>();
        Map<Long, Long> count2 = new HashMap<>();
        long res = 0;
        for (int i = 0; i < rectangles.length; i++) {
            long a = rectangles[i][0];
            long b = rectangles[i][1];
            if (a > b) {
                long temp = a;
                a = b;
                b = temp;
            }
            long ratio = b / gcd(a, b);
            long ratio2 = gcd(a,b);
            res += count.getOrDefault(ratio, 0L);
            res += count2.getOrDefault(ratio2, 0L);
            count.put(ratio, count.getOrDefault(ratio, 0L) + 1);
            count2.put(ratio2, count2.getOrDefault(ratio2, 0L) + 1);
        }
        return res;
    }
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}