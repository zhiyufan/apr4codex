package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Codes {

    public static int maxDistance(int[] colors) {
        
        int[] left = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
            map.put(colors[i], i);
        }

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - left[i];
            max = Math.max(max, distance);
        }
        return max;
    public static void main(String[] args) {
        int[] colors = {3, 2, 1, 2, 3, 2, 1, 2, 3, 3, 3, 3, 3, 3, 3};
        System.out.println(maxDistance(colors));
    }
}

    }

    
}