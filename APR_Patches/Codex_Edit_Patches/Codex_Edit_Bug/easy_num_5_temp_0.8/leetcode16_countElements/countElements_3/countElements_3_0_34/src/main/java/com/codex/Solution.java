package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j] && nums[i] + 1 == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }





    public static void main(String[] args) {
        
        int[] nums = {1,2,2,1};
        int[] nums2 = {1,1,3,3,5,5,7,7};
        int[] nums3 = {1,3,2,3,5,0};
        int[] nums4 = {1,1,2,2};
        int[] nums5 = {1,1,2};
        int[] nums6 = {};
        int[] nums7 = {1};

        System.out.println(countElements(nums));
        System.out.println(countElements(nums2));
        System.out.println(countElements(nums3));
        System.out.println(countElements(nums4));
        System.out.println(countElements(nums5));
        System.out.println(countElements(nums6));
        System.out.println(countElements(nums7));
    }
}


    
}