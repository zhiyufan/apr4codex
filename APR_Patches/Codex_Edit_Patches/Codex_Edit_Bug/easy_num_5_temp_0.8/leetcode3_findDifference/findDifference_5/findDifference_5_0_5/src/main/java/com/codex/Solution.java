package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int n1 : nums1) {
            map.put(n1, 1);
        }
        for (int n2 : nums2) {
            if (map.containsKey(n2)) {
                map.remove(n2);
            } else {
                map.put(n2, 1);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.get(0).add(entry.getKey());
            } else {
                result.get(1).add(entry.getKey());
            }
        }
        return result;
    }


    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.get(t.charAt(i)) + 1);
            } else {
                map.put(t.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) - 1 < 0) {
                    return false;
                } else {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            return entry.getKey();
        }
        return -1;
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (map.containsKey(n)) {
                int count = map.get(n) + 1;
                map.put(n, count);
            } else {
                map.put(n, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
}