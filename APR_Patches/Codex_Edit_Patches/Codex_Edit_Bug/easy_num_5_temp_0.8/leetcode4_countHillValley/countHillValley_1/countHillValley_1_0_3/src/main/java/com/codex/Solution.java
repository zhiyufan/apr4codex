package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        int len = nums.length;
        if (len < 3) return 0;
        int i = 0, top = 0;
        int[] stk = new int[len];
        while (i < len) {
            if (top == 0 || stk[top - 1] < nums[i]) {
                stk[top++] = nums[i++];
            } else {
                stk[--top] = 0; 
            }
        }
        
        int count = 0;
        for (i = 1; i < len - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                count++;
            }
            
            if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return  count;
    }

   
}