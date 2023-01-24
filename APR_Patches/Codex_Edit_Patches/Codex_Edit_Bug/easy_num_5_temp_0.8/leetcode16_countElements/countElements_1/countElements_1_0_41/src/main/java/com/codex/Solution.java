package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            for (int i = j + 1; i < nums.length; i++) {
                if (nums[i] == nums[j] + 1) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
}