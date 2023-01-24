package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        Arrays.sort(nums);

        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] == nums[i] + 1) && (i != j)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    
}