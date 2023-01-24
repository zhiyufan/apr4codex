package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String num : nums) {
            int targetNum = Integer.parseInt(target) - Integer.parseInt(num);
            if (map.containsKey(String.valueOf(targetNum))) {
                map.put(String.valueOf(targetNum), map.get(String.valueOf(targetNum)) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int result = 0;
        for (int val : map.values()) {
            if (val > 1) {
                result += val * (val - 1);
            }
        }
        return result;
    }
}