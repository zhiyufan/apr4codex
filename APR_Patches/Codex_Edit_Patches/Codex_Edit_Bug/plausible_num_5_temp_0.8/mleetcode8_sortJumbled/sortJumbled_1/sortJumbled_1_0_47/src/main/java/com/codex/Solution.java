package com.codex;

import java.util.*;

public class Solution {
public static int[] sortJumbled(int[] mapping, int[] nums) {
    
    int[] res = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        res[i] = nums[i];
    }
    Arrays.sort(res);

    int[] map = new int[10];
    for (int i = 0; i < 10; i++) {
        map[mapping[i]] = i;
    }

    for (int i = 0; i < nums.length; i++) {
        nums[i] = map[nums[i]];
    }

    Arrays.sort(nums);
    return nums;
}


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int[] res = new int[nums.length];
        int max = 0;
        int count = 0;
        boolean first = false;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (first == false) {
                    first = true;
                }
            } else {
                max = Math.max(max, count);
                count = 0;
                first = false;
            }
        }
        Arrays.sort(res);

        int[] map = new int[10];
        for (int i = 0; i < 10; i++) {
            map[mapping[i]] = i;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = map[nums[i]];
        }

        Arrays.sort(nums);
        return nums;
    }

    
}