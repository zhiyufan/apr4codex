package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < dist.length; i++) {
            pq.add(dist[i] * speed[i]);
        }
        int count = 0;
        int charge = 0;
        while (!pq.isEmpty()) {
            charge += pq.poll();
            count++;
            if (charge < 0) {
                break;
            }
        }
        return count;
    }

    static int findClosestSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int left = 0;
        int right = numbers.length - 1;
        int min = Integer.MAX_VALUE;
        int diff = min;
        while (left < right) {
            diff = numbers[left] + numbers[right] - target;
            if (diff == 0) {
                return target;
            }
            if (Math.abs(diff) < Math.abs(min)) {
                min = diff;
            }
            if (diff > 0) {
                right--;
            } else {
                left++;
            }
        }
        return target + min;
    }
    
    
}