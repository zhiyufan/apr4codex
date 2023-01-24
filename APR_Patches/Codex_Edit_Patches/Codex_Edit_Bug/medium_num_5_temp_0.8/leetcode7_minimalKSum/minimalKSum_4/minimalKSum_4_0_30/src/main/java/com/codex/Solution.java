package com.codex;

import java.util.*;

public class Solution {
public static long minimalKSum(int[] nums, int k) {
        
    Arrays.sort(nums);
    int curr = 1;
    long sum = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > curr) {
            k--;
            sum+=curr;
            curr++;
        } else if (nums[i] == curr) curr++;
    }
    while (k > 0) {
        sum+=curr;
        curr++;
        k--;
    }
    return sum;
}

public static long minimalKSum(int[] nums, int k) {
        
    Arrays.sort(nums);
    int curr = 1;
    long sum = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] >= curr) {
            k--;
            sum+=curr;
            curr++;
        } else if (nums[i] == curr) curr++;
    }
    while (k > 0) {
        sum+=curr;
        curr++;
        k--;
    }
    return sum;
}


public static long minimalKSum(int[] nums, int k) {
        int n = nums.length;
        if (n == 1 && k == 1) return nums[0];
        if (n == 1 && k > 1) return 0;
        if (n == k) return Arrays.stream(nums).sum();
        Arrays.sort(nums);                   
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] += prefix[i] + nums[i];
        }
        while (k > 0) {
            sum+=curr;
            curr++;
            k--;
        }
        return sum;
    }

    
}