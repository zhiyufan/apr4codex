package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        

        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (int i = 0; i < dist.length; i++) {
            pq.add((double) dist[i] / speed[i]);
        }
        double cur = pq.poll();
        int count = 0;
        while (!pq.isEmpty() && pq.peek() - cur <= 1) {
            count++;
            pq.poll();
        }
        if (pq.isEmpty()) return dist.length;
        return count;
    }

public static boolean isTrue(String str) {
        int[] arr = new int[26];
        for (char ch : str.toCharArray()) {
            arr[ch - 'a']++;
        }
        int ones = 0;
        for (int i : arr) {
            if (i == 1) {
                ones++;
            }
        }
        if (ones == 1) return true;
        else return false;
    }
}