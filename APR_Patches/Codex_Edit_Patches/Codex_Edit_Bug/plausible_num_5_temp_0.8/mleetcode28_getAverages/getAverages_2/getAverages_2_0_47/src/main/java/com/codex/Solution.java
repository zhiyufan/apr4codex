package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        int[] avgs = new int[nums.length];
        if (nums.length == 0 || k == 0) {
            return avgs;
        }
        for (int i = 0; i < nums.length; i++) {
            int low = i - k + 1;
            int high = i + k;
            int sum = 0;
            int count = 0;
            for (int j = low; j <= high; j++) {
                if (j >= 0 && j < nums.length) {
                    sum += nums[j];
                    count++;
                }
            }
            avgs[i] = count == 0 ? -1 : sum / count;
        }
        return avgs;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAverages(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 5)));
        System.out.println(Arrays.toString(getAverages(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 4)));
        System.out.println(Arrays.toString(getAverages(new int[] { 1, 1, 1 }, 1)));
    }
}