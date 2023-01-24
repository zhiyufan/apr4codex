package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int[][] nums = new int[][]{nums1, nums2, nums3};

        for (int[] ar : nums) {
            for (int n : ar) {
                if (!map.containsKey(n)) {
                    map.put(n, 1);
                } else {
                    map.put(n, map.get(n) + 1);
                }
            }
        }
        for (int n : map.keySet()) {
            if (map.get(n) > 1) {
                list.add(n);
            }
        }
        return list;
    }
}