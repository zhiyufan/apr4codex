package com.codex;

import java.util.*;

public class Solution {
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0], y1 = rec1[1], x2 = rec1[2], y2 = rec1[3];
        int x1_2 = rec2[0], y1_2 = rec2[1], x2_2 = rec2[2], y2_2 = rec2[3];
        int l1 = x2 - x1;
        int l2 = x2_2 - x1_2;
        int b1 = y2 - y1;
        int b2 = y2_2 - y1_2;
        if (l1 == 0 || l2 == 0 || b1 == 0 || b2 == 0) {
            return false;
        }
        if (x1 <= x1_2 && x1_2 < x2 && y1 <= y1_2 && y1_2 < y2 &&
                x1_2 <= x1 && x1 < x2_2 && y1_2 <= y1 && y1 < y2_2) {
            return true;
        }
        return false;
    }
}