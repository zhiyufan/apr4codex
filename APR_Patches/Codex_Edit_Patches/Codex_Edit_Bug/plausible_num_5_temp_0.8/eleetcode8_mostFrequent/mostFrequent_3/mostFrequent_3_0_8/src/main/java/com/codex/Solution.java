package com.codex;

import java.util.*;

public class Solution {
// Write a program to print the number of times the most frequent number appears in array.

// Input: [2, 3, 2, 4, 3, 1, 4, 6, 8, 4, 2, 7, 4]
// Output: 4

// Input: [4, 4, 2, 1, 2, 3, 2]
// Output: 2

public static int mostFrequent(int[] nums, int key) {
        
        int maxCount = 0;
        int maxNum = -1;
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0; 
        while (i < nums.length - 1) {
            if (nums[i] == key) {
                int count = map.getOrDefault(nums[i + 1], 0); 
                map.put(nums[i + 1], count + 1); 
                if (count + 1 > maxCount) {
                    maxCount = count + 1;
                    maxNum = nums[i + 1]; 
                }
            } else {
                i++;
            }
        }

        return maxNum;
    }

    
}