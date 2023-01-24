package com.codex;

import java.util.*;

public class Solution {
public static int[] getAverages(int[] nums, int k) {
        

    if (k > nums.length) {
        throw new IllegalArgumentException("k must be greater than 0 and less than or equal to the number of elements in the array.");
    }
    int[] avgs = new int[nums.length];
    int sum = 0;
    // Calculate the sum of the first window of size k.
    for (int i = 0; i < k; i++) {
        sum += nums[i];
    }
    for (int i = k; i < nums.length; i++) {
        avgs[i - k] = sum / k;
        sum -= nums[i - k];
        sum += nums[i];
    }
    avgs[avgs.length - 1] = sum / k;
    return avgs;
}

public static int[] getAverages2(int[] nums, int k) {
 
    if (k > nums.length) {
        throw new IllegalArgumentException("k must be greater than 0 and less than or equal to the number of elements in the array.");
    }
    int[] avgs = new int[nums.length - k + 1];
    for (int i = 0; i < nums.length - k + 1; i++) {
        int sum = 0;
        for (int j = i; j < i + k; j++) {
            sum += nums[j];
        }
        avgs[i] = sum / k;
    }

    return avgs;
}
}