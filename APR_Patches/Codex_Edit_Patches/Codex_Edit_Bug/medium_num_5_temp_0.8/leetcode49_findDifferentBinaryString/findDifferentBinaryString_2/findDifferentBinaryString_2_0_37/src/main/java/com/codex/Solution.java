package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomTest3 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(new Integer[] {1,1,2,2,3,3,4,4,5});
        System.out.println(findSingleNumber(nums));
    }

    private static Integer findSingleNumber(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer key : nums) {
            if (!map.containsKey(key)) {
                map.put(key, 0);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        Integer value = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                value = entry.getKey();
            }
        }
        return value;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static String findDifferentBinaryString(String[] nums) {

        if (nums == null || nums.length == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums[0].length(); ++i) {
            int x = 0;
            for (String num : nums) {
                x ^= num.charAt(i) - '0';
            }
            res.append(x);
        }
        return res.toString();
    }

    public static String findDifferentBinaryString(String[] nums) {
        
        if (nums == null || nums.length == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums[0].length(); ++i) {
            int x = 0;
            for (String num : nums) {
                x ^= num.charAt(i) - '0';
            }
            res.append(x);
        }
        return res.toString();
    }

}
    
}