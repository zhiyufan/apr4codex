package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletionSize(int[] nums) {
        

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) { // even numbers
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] % 2 != 0) {
                        if ((nums[i] - nums[j]) % 2 == 0) { // even gap
                            count++;
                        }
                    }
                }
            } else {
                if (nums[i] != nums[i+1]) {
                    count++;
                }
            }
        }
        return count;
    }

    
}