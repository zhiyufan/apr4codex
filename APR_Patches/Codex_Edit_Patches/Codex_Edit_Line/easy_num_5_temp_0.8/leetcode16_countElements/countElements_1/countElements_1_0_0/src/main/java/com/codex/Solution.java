package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                boolean needIncrement = nums[i] + 1 == nums[j] ;
                if (needIncrement) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }



    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i] + 1) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
}