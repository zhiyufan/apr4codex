package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        boolean isCounted = false;
        for (int i = 0; i < nums.length; i++) {
            isCounted = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i] + 1) {
                    count++;
                    isCounted = true;
                    break;
                }
            }
            if(!isCounted) {
                count++;
            }
        }
        return count;
    }

    
}