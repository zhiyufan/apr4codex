package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] == nums[i] + 1) && (i != j)) {
                    result++;
                    break;
                }
            }
        }
    public static int countElements(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] + 1)) {
                result++;
            }
        }
        return result;
    }

        return result;
    }

    
}