package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int count = 0;
        if (nums[0] % 2 == 0){
            count++;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] % 2 == 0 && nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}