package com.codex;

import java.util.*;

public class Solution {
    public enum Currency {
        ONE, TWO, THREE;
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int minBitFlips(int start, int goal) {
        
        int i = 0;
        int flip = 0;
        int res = 0;
    
        while (i < 32) {
            if ((start & 1) != (goal & 1)) { 
                res++;
                flip ^= 1;
            } else if ((flip & 1) == 1) {
                res++;
                flip ^= 1;
            }
            start >>= 1; 
            goal >>= 1; 
            i++;
        }
        return flip == 0 ? res : -1;
    }
}