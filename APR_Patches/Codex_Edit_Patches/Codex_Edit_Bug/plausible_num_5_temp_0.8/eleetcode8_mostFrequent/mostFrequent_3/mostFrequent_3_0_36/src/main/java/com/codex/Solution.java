package com.codex;

import java.util.*;

public class Solution {
public static int mostFrequent(int[] nums, int key) {

    int maxCount = 0;
    int maxNum = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == key && nums[i + 1] != key) {
            int count = map.getOrDefault(nums[i + 1], 0);
            map.put(nums[i + 1], count + 1);
            if (count + 1 > maxCount) {
                maxCount = count + 1;
                maxNum = nums[i + 1];
            }
        }
    }

    for (int i = 1; i < nums.length - 1; i++) {
        if (nums[i] == key && nums[i - 1] != key) {
            int count = map.getOrDefault(nums[i - 1], 0);
            map.put(nums[i - 1], count + 1);
            if (count + 1 > maxCount) {
                maxCount = count + 1;
                maxNum = nums[i - 1];
            }
        }
    }
    if (nums[0] == key && nums[1] == key) {
        int count = map.getOrDefault(nums[nums.length - 1], 0);
        map.put(nums[nums.length - 1], count + 1);
        if (count + 1 > maxCount) {
            maxCount = count + 1;
            maxNum = nums[nums.length - 1];
        }
    }
    if (nums[nums.length - 1] == key && nums[nums.length - 2] == key) {
        int count = map.getOrDefault(nums[0], 0);
        map.put(nums[0], count + 1);
        if (count + 1 > maxCount) {
            maxCount = count + 1;
            maxNum = nums[0];
        }
    }
    return maxNum;
}
}