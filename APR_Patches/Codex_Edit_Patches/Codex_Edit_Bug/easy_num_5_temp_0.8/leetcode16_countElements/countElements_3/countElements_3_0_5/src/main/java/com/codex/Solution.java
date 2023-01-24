package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[j] + 1) {
                count++;
            }
            j++;
        }
        return count;
    }

}