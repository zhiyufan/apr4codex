package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        /** You are given a 0-indexed integer array nums and two integers key and k. A k-distant index is an index i of nums for which there exists at least one index j such that |i - j| <= k and nums[j] == key.
         * Return a list of all k-distant indices sorted in increasing order.
         */
        if (nums == null || nums.length == 0 || k <= 0) {
            return null;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                res.add(i);
            }
        }
        if (res.size() == 0) {
            return res;
        }
        List<Integer> res2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != key) {
                int min = Math.abs(i - res.get(0));
                for (int j = 1; j < res.size(); j++) {
                    if (Math.abs(i - res.get(j)) < min) {
                        min = Math.abs(i - res.get(j));
                    }
                }
                if (min <= k) {
                    res2.add(i);
                }
           }