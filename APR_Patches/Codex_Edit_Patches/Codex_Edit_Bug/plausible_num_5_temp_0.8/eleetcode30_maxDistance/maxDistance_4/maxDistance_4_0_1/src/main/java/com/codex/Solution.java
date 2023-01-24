package com.codex;

import java.util.*;

public class Solution {
What the program does?
Calculate the minimum distance between an array of integers in which there are k integers.


public static int minDistance(int[] nums, int k) {

    int n = nums.length;
    int[][] range = new int[k][2];
    for (int i = 0; i < k; i++) {
        range[i] = new int[]{n, -1};
    }
    for (int i = 0; i < n; i++) {
        range[nums[i]][0] = Math.min(range[nums[i]][0], i);
        range[nums[i]][1] = Math.max(range[nums[i]][1], i);
    }
    int minDis = n - 1;
    for (int i = 0; i < k; i++) {
        for (int j = i + 1; j < k; j++) {
            minDis = Math.min(minDis, Math.abs(range[i][0] - range[j][1]));
            minDis = Math.min(minDis, Math.abs(range[j][0] - range[i][1]));
        }
    }
    return minDis;
}
}