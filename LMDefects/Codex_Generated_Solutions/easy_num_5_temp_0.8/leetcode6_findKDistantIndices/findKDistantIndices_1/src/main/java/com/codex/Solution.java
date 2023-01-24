package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        /** You are given a 0-indexed integer array nums and two integers key and k. A k-distant index is an index i of nums for which there exists at least one index j such that |i - j| <= k and nums[j] == key.
         * Return a list of all k-distant indices sorted in increasing order.
         */
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        if (!map.containsKey(key)) return res;
        List<Integer> indices = map.get(key);
        for (int i = 0; i < indices.size(); i++) {
            int cur = indices.get(i);
            int j = i - 1;
            while (j >= 0 && cur - indices.get(j) <= k) {
                res.add(indices.get(j--));
            }
            j = i + 1;
            while (j < indices.size() && indices.get(j) - cur <= k) {
                res.add(indices.get(j++}