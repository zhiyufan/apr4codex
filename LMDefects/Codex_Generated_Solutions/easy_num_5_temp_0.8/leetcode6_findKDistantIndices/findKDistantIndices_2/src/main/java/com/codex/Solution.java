package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        /** You are given a 0-indexed integer array nums and two integers key and k. A k-distant index is an index i of nums for which there exists at least one index j such that |i - j| <= k and nums[j] == key.
         * Return a list of all k-distant indices sorted in increasing order.
         */
        List<Integer> kDistant = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return kDistant;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                kDistant.add(i);
                int j = i - 1;
                while (j >= 0 && (i - j) <= k) {
                    if (nums[j] == key) {
                        kDistant.add(j);
                    }
                    j--;
                }
                j = i + 1;
                while (j < nums.length && (j - i) <= k) {
                    if (nums[j] == key) {
                        kDistant.add(j);
                    }
                    j++;
                }
            }
        }
        if (kDistant.size() > 0) {
            Collections.sort(kDistant);
        }
        return kDistant;
    }

    }