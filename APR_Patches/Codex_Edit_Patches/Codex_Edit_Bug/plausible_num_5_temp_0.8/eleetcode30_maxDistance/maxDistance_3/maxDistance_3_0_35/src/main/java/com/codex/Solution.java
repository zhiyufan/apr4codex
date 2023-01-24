package com.codex;

import java.util.*;

public class Solution {


    public static int maxDistance(int[] colors) {
        Map<Integer, Integer> lastIndex = new HashMap<>();
        int maxDistance = -1;
        int lastIndexOfMax = -1;
        for (int i=0; i<colors.length; ++i) {
            if (lastIndex.containsKey(colors[i])) {
                int distance = i - lastIndex.get(colors[i]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    lastIndexOfMax = i;
                }
            }
            lastIndex.put(colors[i], i);
        }
        for (int i=colors.length-1; i>lastIndexOfMax; --i) {
            if (lastIndex.containsKey(colors[i])) {
                int distance = lastIndex.get(colors[i]) - i;
                if (distance > maxDistance) {
                    maxDistance = distance;
                }
            }
        }
        return maxDistance;
    }
}