package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;

    public static int maxDistance(int[] colors) {
        
        int distance = 0;
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        for (int i = 0; i < colors.length; i++) {
            if (!left.containsKey(colors[i]))
                left.put(colors[i], i);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            if (!right.containsKey(colors[i]))
                right.put(colors[i], i);
        }

        for (int i = 0; i < colors.length; i++) {
            distance = Math.max(distance, Math.abs(i - left.get(i)));
            distance = Math.max(distance, Math.abs(i - right.get(i)));
        }

        return distance;
    }

    public static void main() {
        int[] colors = {1,10,13};
        System.out.println(maxDistance(colors));
    }
}