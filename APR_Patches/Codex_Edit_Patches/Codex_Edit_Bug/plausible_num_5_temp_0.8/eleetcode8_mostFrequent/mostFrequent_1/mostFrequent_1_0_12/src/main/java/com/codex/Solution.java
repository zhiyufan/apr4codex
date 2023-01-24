package com.codex;

import java.util.*;

public class Solution {
public class Main {
    
    public static void main(String[] args) {
        int[] nums = {1,5,5,5,5,5,2,2,2,2,2,2,3};
        System.out.println(mostFrequent(nums, 5));
    }
    
    public static int mostFrequent(int[] nums, int k) {

        int count = 0;
        int maxCount = 0;
        int target = k;

        for (int i = 0; i < nums.length; i++) {
            count = 1;
            if (nums[i] != k) 
                continue;
            
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
                } 
            } 
            
            if (count > maxCount) {
                maxCount = count;
                target = nums[i];
            }
        }
        return target;
    }

}
}