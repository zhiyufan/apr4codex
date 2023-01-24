package com.codex;

import java.util.*;

public class Solution {
public static List<String> averageOfSubarray(int k, int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k - 1; i++) {
            pq.offer(nums[i]);
        }
        for (int i = k - 1; i < nums.length; i++) {
            pq.offer(nums[i]);
            int sum = 0;
            for (int n : pq) {
                sum += n;
            }
            double average = sum / k;
            String str = String.format("%.5f", average);
            result.add(str);
            pq.remove(nums[i + 1 - k]);
        }
       
        return result;
    }

    
}