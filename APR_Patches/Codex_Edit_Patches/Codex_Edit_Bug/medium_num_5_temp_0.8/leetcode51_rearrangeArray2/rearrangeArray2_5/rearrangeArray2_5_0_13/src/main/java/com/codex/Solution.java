package com.codex;

import java.util.*;

public class Solution {

    public static int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        
        int i = 0;
        int j = nums.length - 1;
        int index = 0;
        while (index < nums.length) {
            if (index % 2 == 0) {
                nums[index++] = nums[j--];
            } else {
                nums[index++] = nums[i++];
            }
        }
        return nums;
    }

}