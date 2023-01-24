package com.codex;

import java.util.*;

public class Solution {
    public static long interchangeableRectangles(int[][] rectangles) {
        /** You are given n rectangles represented by a 0-indexed 2D integer array rectangles, where rectangles[i] = [widthi, heighti] denotes the width and height of the ith rectangle.
         * Two rectangles i and j (i < j) are considered interchangeable if they have the same width-to-height ratio. More formally, two rectangles are interchangeable if widthi/heighti == widthj/heightj (using decimal division, not integer division).
         * Return the number of pairs of interchangeable rectangles in rectangles.
         */

        if (rectangles.length < 2) {
            return 0;
        }

        Map<Double, Integer> ratioToCount = new HashMap<>();
        long result = 0;

        for (int i = 0; i < rectangles.length; i++) {
            int[] rectangle = rectangles[i];
            int width = rectangle[0];
            int height = rectangle[1];
            double ratio = getRatio(width, height);
            result += ratioToCount.getOrDefault(ratio, 0);
            ratioToCount.put(ratio, ratioToCount.getOrDefault(ratio, 0) + 1);
        }

        return result;
    }

    private static double getRatio(int width, int height) {
        if (width > height) {
            return (double) width / height;
        }
        return (double) height / width;
    }

    }