package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        

        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (nums[i-1] == 2) {
                    return -1;
                }
        
        int result = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 1) {
                result += (nums[i+1] == 2 ? 1 : 0);
            }
        }
        
        result += nums[nums.length-1] == 1 ? 1 : 0;
        
            }
        }
        return count;
    }
}