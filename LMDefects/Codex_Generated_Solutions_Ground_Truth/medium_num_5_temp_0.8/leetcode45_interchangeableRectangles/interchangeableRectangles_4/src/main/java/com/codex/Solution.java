package com.codex;

import java.util.*;

public class Solution {
    public static long interchangeableRectangles(int[][] rectangles) {
        /** You are given n rectangles represented by a 0-indexed 2D integer array rectangles, where rectangles[i] = [widthi, heighti] denotes the width and height of the ith rectangle.
         * Two rectangles i and j (i < j) are considered interchangeable if they have the same width-to-height ratio. More formally, two rectangles are interchangeable if widthi/heighti == widthj/heightj (using decimal division, not integer division).
         * Return the number of pairs of interchangeable rectangles in rectangles.
         */
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int[] rect : rectangles) {
            int gcd = gcd(rect[0], rect[1]);
            int w = rect[0] / gcd;
            int h = rect[1] / gcd;
            count.put(w * 100000 + h, count.getOrDefault(w * 100000 + h, 0) + 1);
        }
        long res = 0;
        for (long n : count.values()) {
            res += n * (n - 1) / 2;
        }
        return res;
    }

    private static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    }