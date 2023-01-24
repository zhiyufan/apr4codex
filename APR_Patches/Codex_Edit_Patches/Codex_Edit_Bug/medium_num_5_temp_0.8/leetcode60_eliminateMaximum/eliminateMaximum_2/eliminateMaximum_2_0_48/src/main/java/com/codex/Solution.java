package com.codex;

import java.util.*;

public class Solution {

    public static List<Integer> maxSet(int[] arr) {
        int start = 0;
        int end = 0;
        int currentSum = 0;
        int maxSum = 0;
        int currentStart = 0;
        int currentEnd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (currentSum == 0 && arr[i] < 0) {
                currentSum = 0;
                currentStart = currentEnd + 1;
                currentEnd++;
            } else {
                currentSum += arr[i];
                currentEnd++;
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = currentStart;
                    end = currentEnd;
                }
            }
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

    
}