package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] == nums[i + 1]) {
                count++;
            }
        }
        if (nums.length % 2 == 1) { //如果数组长度是奇数，则在除余2求结束的循环外面再执行一次从0到nums.length-1的循环
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

    
}