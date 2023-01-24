package com.codex;

import java.util.*;

public class Solution {
public static int minDeletion(int[] nums) {
    if (nums == null || nums.length == 0) return 0;

        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {      // for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] == nums[i+1]) {
                count++;
            } else if (nums[i] % 2 == 1 && nums[i] != nums[i+1]) {
                count++;
            }
        }
    return count;
}
    }

    
}