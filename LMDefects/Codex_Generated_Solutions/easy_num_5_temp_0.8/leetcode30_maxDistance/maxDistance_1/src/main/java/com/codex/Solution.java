package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        /** There are n houses evenly lined up on the street, and each house is beautifully painted. You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.
         * Return the maximum distance between two houses with different colors.
         * The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.
         */
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
            distance = Math.max(distance, Math.abs(i - left.get(colors[i])));
            distance = Math.max(distance, Math.abs(i - right.get(colors[i])));
        }

        return distance;
    }

    }