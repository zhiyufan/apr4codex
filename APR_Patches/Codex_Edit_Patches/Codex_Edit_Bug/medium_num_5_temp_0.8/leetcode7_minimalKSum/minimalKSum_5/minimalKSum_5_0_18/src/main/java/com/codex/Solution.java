package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int lastfound = nums[0];
        int size = nums.length;
        long sum = 0;
        int pos = 1;
        for (int i = 0; i < size; i++) {
            if (nums[i] == pos && nums[i] > lastfound) {
                pos++;
                lastfound = pos;
            } else if (nums[i] < pos && nums[i] > lastfound) {
                continue;
            } else {
                if (nums[i] <= lastfound && nums[i] >= pos) {
                    continue;
                }
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