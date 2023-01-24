package com.codex;

import java.util.*;

public class Solution {
public class solution {

        public int maxDistance(int[] colors) {

        int distance = 0;
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        for (int i = 0; i < colors.length; i++) {
            if (!left.containsKey(colors[i]))
                left.put(colors[i], i);
        }
        }

        for (int i = 0; i < colors.length; i++) {
            distance = Math.max(distance, Math.abs(i - left.get(colors[i])));
            distance = Math.max(distance, Math.abs(i - right.get(colors[i])));
        }

        List<Integer> sortedColours = new ArrayList<>();
        sortedColours.addAll(left.keySet());
        Collections.sort(sortedColours);

        int left_count = 1;
        int right_count = 1;
        
        for (int i = 0; i < sortedColours.size() - 1; i++) {
            int diff = left.get(sortedColours.get(i + 1)) - right.get(sortedColours.get(i));
            distance = Math.max(distance, diff);
        }

        return distance;
    }

    public static void main(String[] args) {
        int[] input = { 3, 3, 3, 1, 3, 3, 2 };

        System.out.println(maxDistance(input));
    }
}

        for (int i = colors.length - 1; i >= 0; i--) {
            if (!right.containsKey(colors[i]))
                right.put(colors[i], i);
        }

        for (int i = 0; i < colors.length; i++) {
            distance = Math.max(distance, Math.abs(i - left.get(colors[i])));
            distance = Math.max(distance, Math.abs(i - right.get(colors[i])));
        }

        return distance;
    }

    
}