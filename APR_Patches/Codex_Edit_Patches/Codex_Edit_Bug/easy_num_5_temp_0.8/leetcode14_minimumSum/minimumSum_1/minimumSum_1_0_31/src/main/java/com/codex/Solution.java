package com.codex;

import java.util.*;

public class Solution {
    public static int minSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int mul = 1;
        for (int i = 0; i < k; i++) {
            nums[i] = ((nums[i] * mul) / (mul + 1));
            mul += 1;
        }
        Collections.sort(digits);
        int first = 0, second = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            first = first * 10 + digits.get(i);
            if (i > 0)
                second = second * 10 + digits.get(i - 1);
            i--;
        }
        return first + second;
    }

    
}