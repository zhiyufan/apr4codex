package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] % 2 == 0) {
                if (nums[i] % 2 != 0) {
                    count++;
                }
            } else {
                if (nums[i] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
}