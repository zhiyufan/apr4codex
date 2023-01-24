package com.codex;

import java.util.*;

public class Solution {
    static class Pair{
        int y;
        int x;
        public Pair(int y, int x){
            this.y = y;
            this.x = x;
        }
    }
    public static long interchangeableRectangles(int[][] rectangles) {
        HashMap<Pair, Long> map = new HashMap<>();
        for (int i = 0; i < rectangles.length; i++){
            for (int j = i + 1; j < rectangles.length; j++){
                if (rectangles[i][0] * rectangles[j][1] == rectangles[i][1] * rectangles[j][0]){
                    Pair temp = new Pair(rectangles[i][0], rectangles[i][1]);
                    map.put(temp, map.getOrDefault(temp, 0L) + 1);
                    
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

    
}