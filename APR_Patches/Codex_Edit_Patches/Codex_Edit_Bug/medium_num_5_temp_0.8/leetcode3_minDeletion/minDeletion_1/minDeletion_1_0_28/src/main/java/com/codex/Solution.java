package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int a[] = {1,2,3,2,2};
        System.out.println(minDeletion(a));
    }

    public static int minDeletion(int[] nums) {
        boolean odd = false;
        boolean even = false;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even = true;
            } else {
                odd = true;
            }
        }
        if (odd && even) {
            return 0;
        } else if (odd) {
            return oddSubarray(nums);
        } else {
            return evenSubArray(nums);
        }
            
    }

    public static int oddSubarray(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                count++;
            }
        }
        return count;
    }

    public static int evenSubArray(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    
}