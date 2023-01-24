package com.codex;

import java.util.*;

public class Solution {

    public static long interchangeableRectangles(int[][] rectangles) {
        long total = 0, temp = 0;
        int count = 0, i = 0;
        Arrays.sort(rectangles, (a, b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]);

        int ratio1 = rectangles[0][0] / rectangles[0][1];
        while (i < rectangles.length) {
            int ratio2 = rectangles[i][0] / rectangles[i][1];
            while (ratio1 == ratio2 && i < rectangles.length) {
                temp += count;
                count++;
                i++;
                if (i == rectangles.length) break;
                ratio2 = rectangles[i][0] / rectangles[i][1];
            }
            count = 1;
            if (i < rectangles.length)
                ratio1 = ratio2;
            total += temp;
            temp = 0;
        }
        return total;
    }



    // Other solution using hashmap

    public static long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Long> map = new HashMap<>();
        long res = 0;
        for (int i = 0; i < rectangles.length; i++) {
            for (int j = 0; j < rectangles[0].length; j++) {
                if (rectangles[i][0] < rectangles[i][1]) {
                    int temp = rectangles[i][0];
                    rectangles[i][0] = rectangles[i][1];
                    rectangles[i][1] = temp;
                }
                Double ratio = (double) rectangles[i][0] / rectangles[i][1];
                map.put(ratio, map.getOrDefault(ratio, 0L) + 1);
            }
            for (long l : map.values()) {
                res += l * (l - 1) / 2;
            }
            map.clear();
        }
        return res;
    }

    
}