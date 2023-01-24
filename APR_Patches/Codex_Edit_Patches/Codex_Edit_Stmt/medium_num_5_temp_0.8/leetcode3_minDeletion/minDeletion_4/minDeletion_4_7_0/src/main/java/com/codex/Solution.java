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
        if (nums.length % 2 == 1) {//奇数的情况
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[nums.length - 1]) {//最后一个数跟其他的都比
                    count++;
                }
            }
        }
        return count;
    }

    
}