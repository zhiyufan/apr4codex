package com.codex;

import java.util.*;

public class Solution {
// 
    public static int kthLargest(int k, int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, Collections.reverseOrder());
        for (int num : nums) {
            maxHeap.add(num);
        }       
        return maxHeap.poll();
    }
}