package com.codex;

import java.util.*;

public class Solution {
int longestRun(int[] nums) {
    if (nums.length <= 1) {
        return nums.length;
    }
    int max = 1;
    int l = 0;
    int r = 1;
    while (r < nums.length) {
        if (nums[r] != nums[r - 1]) {
            max = Math.max(max, r - l);
            l = r;
        }
        r++;
    }
    return Math.max(max, r - l);
}

    
}