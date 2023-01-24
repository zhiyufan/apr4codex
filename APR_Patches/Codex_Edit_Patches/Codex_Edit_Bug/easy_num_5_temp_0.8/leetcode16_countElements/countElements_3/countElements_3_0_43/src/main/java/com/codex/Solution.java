package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {

        int target = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    target = nums[j];
                    break;
                }
            }

            if (nums[i] + 1 == target) {
                for (int k = i + 1; k < nums.length; k++) {
                    if (nums[k] == target) {
                        i = k;
                        break;
                    }
                }
            }
        }
        return count;
    }

    
}