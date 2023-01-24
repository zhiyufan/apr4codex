package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        

        int count = 0;
        int maxCount = 1;
        int target = key;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == key) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    target = key;
                }
            }
        }

        return target;
    }

    
}