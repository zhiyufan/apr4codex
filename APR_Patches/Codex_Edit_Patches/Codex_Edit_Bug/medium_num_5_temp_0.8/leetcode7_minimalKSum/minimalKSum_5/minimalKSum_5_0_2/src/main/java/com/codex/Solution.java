package com.codex;

import java.util.*;

public class Solution {
    
    @Test
    public void testMinimalKSum() {
        int[] nums = new int[] {2, 3, 4, 5, 7};
        Assert.assertEquals(34, minimalKSum(nums, 3));
    }

    public static long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long total = 0;
        int cur = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < cur) {
                // skip
            } else if (nums[i] == cur) {
                cur++;
            } else {
                total += cur;
                cur++;
                i--;
                k--;
            }
        }
        total += (cur + k - 1) * k / 2;
        return total;
    }

    
}