package com.codex;

import java.util.*;

public class Solution {
public static long minimalKSum(int[] nums, int k) {
    
    Arrays.sort(nums);
    int size = nums.length;
    long sum = 0;
    int pos = 1;
    for (int i = 0; i < size; i++) {
        if (nums[i] == pos) {
            pos++;
        } else if (nums[i] < pos) {
            continue;
        } else {
            sum += (long)pos;
            k--;
            pos++;
            i--;
        }
    }
    sum += (long)(pos + k - 1) * k / 2;
    return sum;
}

}