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
    if (k <= 0) return sum;
    long res = 0;
    for (int i = curr; i < curr + k; i++) {
        res += i;
    }
    return sum + res;
}
}