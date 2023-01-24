package com.codex;

import java.util.*;

public class Solution {
public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        if (nums.length == 1) return 2;
        for (int i = 1; i < nums.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = i + 1; k < nums.length; k++) {
                    if (nums[j] < nums[i] && nums[i] < nums[k]) {
                        sum += 2;
                    }
                }
            }
        }
        return sum;
    }
}