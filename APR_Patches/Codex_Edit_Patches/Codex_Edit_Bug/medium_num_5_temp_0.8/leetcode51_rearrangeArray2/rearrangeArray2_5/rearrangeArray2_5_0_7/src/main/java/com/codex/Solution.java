package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray(int[] nums) {
        
        // Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() == b.getValue() ? a.getKey() - b.getKey() : b.getValue() - a.getValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (pq.size() == 0) return new int[] {-1};
            Map.Entry<Integer, Integer> entry = pq.poll();
            int cnt = entry.getValue();
            int num = entry.getKey();
            while (cnt != 0) {
                if (i >= nums.length) return new int[] {-1};
                res[i] = num;
                cnt--;
                i += 2;
            }
            if (cnt != 0) {
                pq.add(entry);
            }
        }
        for (int i = 1; i < nums.length; i += 2) {
            if (pq.size() == 0) return new int[] {-1};
            Map.Entry<Integer, Integer> entry = pq.poll();
            res[i] = entry.getKey();
        }
        return res;
}