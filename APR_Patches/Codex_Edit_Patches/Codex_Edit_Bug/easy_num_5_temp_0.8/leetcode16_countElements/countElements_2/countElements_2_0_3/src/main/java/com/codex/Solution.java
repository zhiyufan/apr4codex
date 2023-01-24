package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1 );
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i] + 1)) {
                count += map.get(nums[i]);
            }
        }
        return count;
    }
}