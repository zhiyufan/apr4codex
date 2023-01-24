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

public static int[] sortJumbled(int[] mapping, int[] nums) {

    int[] res = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        res[i] = mapping[nums[i]];
    }
    Arrays.sort(res);
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < 10; j++) {
            if (mapping[j] == res[i]) {
                nums[i] = j;
                break;
            }
        }
    }
    return nums;
}

public static int[] sortJumbled(int[] mapping, int[] nums) {

    int[] res = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        res[i] = mapping[nums[i]];
    }
    Arrays.sort(res);
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < 10; j++) {
            if (mapping[j] == res[i]) {
                nums[i] = j;
                break;
            }
        }
    }
    return nums;
}

        Arrays.sort(nums);
        return nums;
    }

    
}