package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        /** You are given a 0-indexed integer array nums and two integers key and k. A k-distant index is an index i of nums for which there exists at least one index j such that |i - j| <= k and nums[j] == key.
         * Return a list of all k-distant indices sorted in increasing order.
         */
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                indices.add(i);
            }
        }
        return indices.stream().filter(i -> indices.stream().anyMatch(j -> Math.abs(i - j) <= k)).collect(Collectors.toList());
    }

    }