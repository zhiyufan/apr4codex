package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        int hills = 0;
        int valleys = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] < nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] <= nums[i + 1]) i++;
                hills++;
            } else if (nums[i] > nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] >= nums[i + 1]) i++;
                valleys++;
            }
            i++;
        }
        return hills + valleys;
    }
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(countHillValley(new int[]{2,2,3,4,3,3,2,2,1,1,2,5}));
    }

    
    
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i-1] * nums[i-1];
        }

        int right = 1;
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right = right * nums[i];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static int countHillValley(int[] nums) {
        int i = 0;
        int count = 0;
        while (i < nums.length - 1) {
            if (nums[i] < nums[i+1]) {
                while (i < nums.length - 1 && nums[i] <= nums[i+1]) i++;
                count++;
            } else if (nums[i] > nums[i+1]) {
                while (i < nums.length - 1 && nums[i] >= nums[i+1]) i++;
                count++;
            }
            i++;
        }
        return count;
    }
}
    
    
}