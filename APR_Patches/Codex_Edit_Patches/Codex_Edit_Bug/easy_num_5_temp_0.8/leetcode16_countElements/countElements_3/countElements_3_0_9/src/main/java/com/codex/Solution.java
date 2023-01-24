package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i : nums) {
            
            if (contains(nums, i + 1)) {
                count++;
            }
        }
        return count;
    }

    
}