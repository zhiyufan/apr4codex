package com.codex;

import java.util.*;

public class Solution {
    
    int revInput[] = new int[nums.length][2];
        revInput[0][0] = nums[0];
        revInput[0][1] = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; i++) {
            revInput[i][0] = nums[i] - nums[i-1];
            revInput[i][1] = i;
        }
        Arrays.sort(revInput, (a, b) -> {
            if(b[0] - a[0] != 0) return b[0] - a[0];
            else {
                return a[1] - b[1];
            }
        });
        int max = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i == revInput[i][1]) {
                temp++;
                max = Math.max(max, temp);
            } else {
                temp = 0;
            }
        }
        return max;

    
}