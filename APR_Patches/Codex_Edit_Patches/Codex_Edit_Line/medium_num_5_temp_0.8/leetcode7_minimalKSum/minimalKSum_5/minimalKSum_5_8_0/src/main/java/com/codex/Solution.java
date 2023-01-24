package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        int size = nums.length;
        long sum = 0;
        int pos = 1;
        for (int i = 0; i < size; i++) {
            if (nums[i] == pos) {
                pos++;
            } else if (nums[i] < pos) { // 如果这个是>=，那么就无法判断是否达成要求
                continue;
            } else {
                sum += pos;
                k--;
                pos++; // 这个不能放在else的上面，因为比如{1,10,1,1,1,999}，当pos=2的时候，前面的10又被算了一遍
                i--;
            }
        }
        sum += (pos + k - 1) * k / 2;
        return sum;
    }

    
}