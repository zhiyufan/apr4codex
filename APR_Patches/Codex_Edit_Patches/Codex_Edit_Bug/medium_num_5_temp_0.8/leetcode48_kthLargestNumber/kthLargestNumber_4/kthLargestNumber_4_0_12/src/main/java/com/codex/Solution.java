package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    /**
     * @param nums a list of integers
     * @param k an integer
     * @return a string
     */
    public String kthLargestNumber(int[] nums, int k) {


        if (nums == null || nums.length == 0) return "";

        PriorityQueue<String> minHeap = new PriorityQueue<String>((s1, s2) -> (s1 + s2).compareTo(s2 + s1));

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }

        return sb.toString();

    }

}
}