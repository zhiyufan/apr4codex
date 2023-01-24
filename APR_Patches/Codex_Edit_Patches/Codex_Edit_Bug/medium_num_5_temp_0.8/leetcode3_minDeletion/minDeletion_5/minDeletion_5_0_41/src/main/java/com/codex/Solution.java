package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            if (i % 2 == 0 && nums[i] == nums[i + 1]) {
                count++;
            }
        }
        return count;
        int array[] = {2, 3, 4, 1, 5, 6, 8};
		System.out.println(minDeletion(array));
    }

    
    
}