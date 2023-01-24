package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int[] fallingSquares(int[][] positions) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(0,0);
        int max = 0;
        int[] result = new int[positions.length];
        for (int i = 0; i < positions.length; i++) {
            int start = positions[i][0];
            int end = positions[i][0] + positions[i][1];
            int height = positions[i][1];
            int maxHeight = 0;
            int prev = 0;
            while (true) {
                int curr = map.floorKey(start);
                if (curr < start) {
                    maxHeight = Math.max(maxHeight, map.get(curr));
                    prev = curr;
                    map.remove(curr);
                } else {
                    maxHeight = Math.max(maxHeight, map.get(curr));
                    break;
                }
            }
            i++;
        }
        return hills + valleys;
    }

    
}