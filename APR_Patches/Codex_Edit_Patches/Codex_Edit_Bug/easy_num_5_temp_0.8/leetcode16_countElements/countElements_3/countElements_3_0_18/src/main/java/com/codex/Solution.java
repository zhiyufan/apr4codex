package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j] && nums[i] + 1 == nums[j]) {
                    count++;
                    
                }
            }
        }
        int count1 = 0;
        for (int k = 0; k < nums.length; k++) {
            for (int l = 0; l < nums.length; l++) {
                if (nums[k] + 1 != nums[l]) {
                    count1++;
                }
            }
        }

        if (count1 == 0) {
            count = count1;
        }

        return count;
    }

    
}