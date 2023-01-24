package com.codex;

import java.util.*;

public class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        Arrays.sort(nums);
        int size = nums.length;
        long sum = 0;
        int pos = 1;
        for (int i = 0; i < size; i++) {
            if (nums[i] == pos) {
                pos++;
            } else if (nums[i] < pos) {
                continue;
            } else {
                sum += pos;
                k--;
                pos++;
                i--;
            }
        }
        sum += (pos + k - 1) * k / 2;
        return sum;
    }

    
}