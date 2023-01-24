package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i] + 1) {
                    c++;
                    break;
                }
            }
        }
        return c;
    }

    
}