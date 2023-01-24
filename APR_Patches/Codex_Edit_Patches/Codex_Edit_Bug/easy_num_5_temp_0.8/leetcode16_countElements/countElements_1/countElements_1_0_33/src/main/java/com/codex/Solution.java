package com.codex;

import java.util.*;

public class Solution {



    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j] + 1) count++;
                break;
            } 
        }
        return count;
    }

    
}