package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        if (colors == null) {
            return 0;
        }
        int[] left = new int[colors.length];
        int[] right = new int[colors.length];
        left[0] = colors[0];
        right[colors.length - 1] = colors[colors.length - 1];
        for (int i = 1; i < colors.length; i++) {
            if (colors[i] != colors[i - 1]) {
                left[i] = colors[i];
            } else {
                left[i] = left[i - 1];
            }
        }
        for (int i = colors.length - 2; i >= 0; i--) {
            if (colors[i] != colors[i + 1]) {
                right[i] = colors[i];
            } else {
                right[i] = right[i + 1];
            }
        }
        int maxDis = -1;
        for (int i = 0; i < colors.length; i++) {
            int dis;
            if (left[i] != right[i]) {
                dis = Math.max(getDis(left[i], colors, i), getDis(right[i], colors, i));
            } else {
                dis = getDis(left[i], colors, i);
            }
            maxDis = Math.max(dis, maxDis);
        }
        return maxDis;
    }
    private static int getDis(int target, int[] colors, int index) {
        int L = index;
        int R = index;
        for (int i = index; i >= 0; i--) {
            if (colors[i] != target) {
                L = i + 1;
                break;
            }
        }
        for (int i = index; i < colors.length; i++) {
            if (colors[i] != target) {
                R = i - 1;
                break;
            }
        }
        return R - L;
    }
}