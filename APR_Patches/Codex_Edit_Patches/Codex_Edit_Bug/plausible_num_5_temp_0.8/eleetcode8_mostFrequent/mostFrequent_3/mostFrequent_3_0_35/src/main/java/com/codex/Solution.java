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

        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequent(new int[]{1, 2, 3, 2, 3, 3}, 3));
        System.out.println(mostFrequent(new int[]{1, 2, 3, 2, 3, 3}, 1));
        System.out.println(mostFrequent(new int[]{1, 2, 3, 2, 3, 3}, 2));
        System.out.println(mostFrequent(new int[]{1, 1, 3, 3, 3}, 1));
    }
}