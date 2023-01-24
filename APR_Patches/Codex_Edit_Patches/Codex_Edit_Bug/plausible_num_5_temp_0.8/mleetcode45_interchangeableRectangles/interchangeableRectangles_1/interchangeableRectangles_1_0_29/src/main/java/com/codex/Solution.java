package com.codex;

import java.util.*;

public class Solution {
    public static long interchangeableRectangles(int[][] rectangles) {
        
        HashMap<Double, Long> map = new HashMap<>();
        for (int i = 0; i < rectangles.length; i++){
            int[] rectangle = rectangles[i];
            if (rectangle[0] < rectangle[1]){
                int temp = rectangle[0];
                rectangle[0] = rectangle[1];
                rectangle[1] = temp;
            }
            Double ratio = (double)rectangle[0] / rectangle[1];
            map.put(ratio, map.getOrDefault(ratio, 0L) + 1);
            }
        }
        long res = 0;
        for (long l : map.values()){
            res += l * (l - 1) / 2;
        }
        return res;
    }

    
}