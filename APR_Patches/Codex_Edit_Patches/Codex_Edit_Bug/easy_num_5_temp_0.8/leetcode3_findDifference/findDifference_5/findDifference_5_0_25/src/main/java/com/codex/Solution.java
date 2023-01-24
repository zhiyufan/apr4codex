package com.codex;

import java.util.*;

public class Solution {
        public static int maxInWindow(int[] arr, int n, int k) {
        if (n < k) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        Queue<Integer> queue = new LinkedList<>();
        for (int j = 0; j < n; j++) {
            queue.off(arr[j]);
            int size = queue.size();
            for (int i = 0; i < size - 1; i++) {
                queue.add(queue.remove());
            }
            if (j >= k - 1) {
                max = Math.max(max, queue.peek());
                queue.remove();
            }
        }
        return max;
    }    
}