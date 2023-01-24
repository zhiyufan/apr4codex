package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> minHeap = new PriorityQueue<String>((a, b) -> (a + b).compareTo(b + a));
        for (String num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }
        return sb.reverse().toString();
    }

public class Solution {
    public int[] kthSmallestPrimeFraction(int[] A, int K) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>((a, b) -> (A[a[0]] * A[b[1]] - A[a[1]] * A[b[0]]));
        for (int i = 0; i < A.length; i++) {
            minHeap.offer(new int[]{i, A.length - 1});
            if (minHeap.size() > K) {
                minHeap.poll();
            }
        }
        return new int[]{A[minHeap.peek()[0]], A[minHeap.peek()[1]]};
        
    }
}
    
}