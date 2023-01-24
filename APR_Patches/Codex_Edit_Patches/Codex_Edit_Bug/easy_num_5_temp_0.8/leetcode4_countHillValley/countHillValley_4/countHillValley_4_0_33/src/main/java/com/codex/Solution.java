package com.codex;

import java.util.*;

public class Solution {

public class MainClass{
    public static void main(String[] args) {
        System.out.println("Number of Hill and Valley " + countHillValley(new int[]{2,6,6,6,3,1}));
    }
    public static int countHillValley(int[] nums) {
        

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
                count++;
            }
            if (nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
                count++;
            }
        }
        return count;
    }
}

    
    
}