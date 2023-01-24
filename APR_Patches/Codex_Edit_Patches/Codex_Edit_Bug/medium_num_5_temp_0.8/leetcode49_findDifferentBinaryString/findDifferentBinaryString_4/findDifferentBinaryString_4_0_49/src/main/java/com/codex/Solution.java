package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;
import java.util.Map;

public static String findDifferentBinaryString(String[] nums) {

    if (nums == null || nums.length == 0) {
        return "";
    }
    Map<String, Integer> map = new HashMap<>();
    int n = nums.length;
    int m = nums[0].length();

    for (String s : nums) {
        if (map.containsKey(s)) {
            map.put(s, map.get(s) + 1);
        } else {
            map.put(s, 1);
        }
    }

    // 1. If there is only one string and it appears odd number of times
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        String s = entry.getKey();
        int freq = entry.getValue();
        if (freq % 2 != 0) {
            if (map.size() == 1) {
                return s;
            } else {
                return "";
            }
        }
    }

    // 2. If there is only one string and it appears even number of times
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        String s = entry.getKey();
        int freq = entry.getValue();
        if (freq % 2 == 0) {
            return "";
        }
    }

    // 3. There are two or more strings, and one of them appears odd number
    // of times, which means all other strings appear even number of times
    // we can assume that the odd one should have flipped bits
    String rst = "";
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        String s = entry.getKey();
        int freq = entry.getValue();
        if (freq % 2 != 0) {
            rst = s;
            break;
        }
    }

    for (int i = 0; i < m; i++) {
        if (rst.charAt(i) == '0') {
            return "";
        }
        rst = rst.substring(0, i) + '1' + rst.substring(i + 1);
    }
    return rst;
}
}