package com.codex;

import java.util.*;

public class Solution {
    public static long interchangeableRectangles(int[][] rectangles) {
        /** You are given n rectangles represented by a 0-indexed 2D integer array rectangles, where rectangles[i] = [widthi, heighti] denotes the width and height of the ith rectangle.
         * Two rectangles i and j (i < j) are considered interchangeable if they have the same width-to-height ratio. More formally, two rectangles are interchangeable if widthi/heighti == widthj/heightj (using decimal division, not integer division).
         * Return the number of pairs of interchangeable rectangles in rectangles.
         */
        int count = 0;
        for (int i = 0; i < rectangles.length - 1; i++) {
            for (int j = i + 1; j < rectangles.length; j++) {
                if ((long)rectangles[i][0] * (long)rectangles[j][1] == (long)rectangles[i][1] * (long)rectangles[j][0]) {
                    count++;
                }
            }
        }
        return count;
    }

    }