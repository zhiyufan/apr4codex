package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == temp + 1) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
}