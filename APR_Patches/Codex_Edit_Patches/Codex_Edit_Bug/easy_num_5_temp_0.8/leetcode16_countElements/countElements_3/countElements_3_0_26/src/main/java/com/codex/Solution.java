package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

    public static int countElements(int[] nums) {
        
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j] && nums[i] + 1 == nums[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 4, 2, 1, 2};
        int number = countElements(nums);
        System.out.println(number);
    }
}