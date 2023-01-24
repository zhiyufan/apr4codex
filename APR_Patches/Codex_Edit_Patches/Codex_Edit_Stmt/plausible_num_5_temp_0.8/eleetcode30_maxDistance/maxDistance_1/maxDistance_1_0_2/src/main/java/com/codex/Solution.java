package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;

public class MaxDistance {

    public static int maxDistance(int[] colors, int color) {

        int left = -1;
        int right = -1;
        int maxDistance = 0;
        int distance;

        for (int i = 0; i < colors.length; i++)
            if (colors[i] == color) {
                left = i;
                break;
            }

        for (int i = colors.length - 1; i >= 0; i--)
            if (colors[i] == color) {
                right = i;
                break;
            }

        if (left == -1 || right == -1)
            return -1;

        for (int i = left + 1; i < right; i++)
            if (colors[i] == color) {
                distance = Math.abs(i - left);
                maxDistance = Math.max(distance, maxDistance);
                distance = Math.abs(i - right);
                maxDistance = Math.max(distance, maxDistance);
            }

        return maxDistance;
    }

}
}