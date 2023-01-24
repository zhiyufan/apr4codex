package com.codex;

import java.util.*;

public class Solution {
<<<<<<< HEAD
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                res[i] = nums[right];
                right--;
            } else {
                res[i] = nums[left];
                left++;
            }
        }
        return res;
    }

=======
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                res[i] = nums[right];
                right--;
            } else {
                res[i] = nums[left];
                left++;
            }
        }
        return res;
    }
>>>>>>> 5e44e7ea48b5de5b7cac19b4e46f0a9b0d2d2a85
    
}