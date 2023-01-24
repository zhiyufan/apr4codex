package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums1) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : nums2) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : nums3) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : map.keySet()) {
            if (map.get(n) > 1) {
                list.add(n);
            }
        }
        return list;
    }

    public static int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        
        int[] w = new int[nums.length - k + 1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k) {
                sum -= nums[i - k];
            }
            if (i >= k - 1) {
                w[i - k + 1] = sum;
            }
        }
        int[] left = new int[w.length];
        int best = 0;
        for (int i = 0; i < w.length; i++) {
            if (w[i] > w[best]) {
                best = i;
            }
            left[i] = best;
        }
        int[] right = new int[w.length];
        best = w.length - 1;
        for (int i = w.length - 1; i >= 0; i--) {
            if (w[i] >= w[best]) {
                best = i;
            }
            right[i] = best;
        }
        int[] res = new int[]{-1, -1, -1};
        for (int j = k; j < w.length - k; j++) {
            int i = left[j - k];
            int l = right[j + k];
            if (res[0] == -1 || w[i] + w[j] + w[l] > w[res[0]] + w[res[1]] + w[res[2]]) {
                res[0] = i;
                res[1] = j;
                res[2] = l;
            }
        }
        return res;
    }
    
    
}