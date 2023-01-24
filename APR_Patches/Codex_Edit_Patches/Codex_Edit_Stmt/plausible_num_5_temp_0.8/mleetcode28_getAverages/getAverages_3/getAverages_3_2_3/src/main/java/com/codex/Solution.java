package com.codex;

import java.util.*;

public class Solution {
public static int[] getAverages(int[] nums, int k) {

    int[] avgs = new int[nums.length - k + 1];
    for (int i = k; i < nums.length; i++) {
        int sum = 0;
        for (int j = i - k; j <= i; j++) {
            sum += nums[j];
        }
        avgs[i - k] = sum / k;
    }
    return avgs;
}

    
}