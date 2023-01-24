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
    
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        result[i] = nums[i];
    }
    Arrays.sort(result);
    
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
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        result[i] = nums[i];
    }
    
    Arrays.sort(result);
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
        res[i] = nums[i];
    }
    Arrays.sort(res);
    int[] result = new int[10];
    for (int i = 0; i < 10; i++) {
        result[mapping[i]] = i;
    }
    
    for (int i = 0; i < nums.length; i++) {
        nums[i] = result[nums[i]];
    }
    Arrays.sort(nums);
    return nums;
}
 
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
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        result[i] = nums[i];
    }
    Arrays.sort(result);
    int[] map = new int[10];
    for (int i = 0; i < 10; i++) {
        map[mapping[i]] = i;
    }
    
    for (int i = 0; i < nums.length; i++) {
        nums[i] = map[nums[i]];
        }
        Arrays.sort(res);

    Arrays.sort(nums);
    return nums;
}
}