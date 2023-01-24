package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

    public static int sumOfBeauties(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isBeautiful = true;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) continue;
                else if (nums[j] > nums[i]) {
                    isBeautiful = false;
                    break;
                }

            }
            if (isBeautiful) {
                for (int k = 0; k < nums.length; k++) {
                    if (nums[k] == nums[i]) {
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

    
}