package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        int n = nums.length;
        int even = 0;
        while (even < n) {
            if (nums[even] % 2 == 0) {
                even++;
                continue;
            }
            int odd = even + 1;
            while (odd < n && nums[odd] % 2 == 1) {
                odd++;
            }
            if (odd < n) {
                int t = nums[odd];
                for (int i = odd; i > even; i--) {
                    nums[i] = nums[i - 1];
                }
                nums[even] = t;
            }
            even += 2;
        }
        return nums;
    }

    
}