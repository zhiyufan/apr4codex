package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        long[] dp = new long[milestones.length];
        int pqLen;
        dp[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        int pqHead, prev;
        for (long i = 1; i < dp.length; i++) {
            pqHead = pq.peek();
            if (milestones[(int) i] < dp[pqHead]) {
                dp[(int) i] = dp[pqHead] + milestones[(int) i];
            } else {
                dp[(int) i] = milestones[(int) i];
            }
            pqLen = pq.size();
            for (int j = 0; j < pqLen; j++) {
                prev = pq.remove();
                if (prev == pqHead) continue;
                if (milestones[(int) i] + dp[prev] < dp[pqHead]) {
                    pq.add(prev);
                    dp[(int) i] = dp[prev] + milestones[(int) i];
                    pq.add((int) i);
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }----solution----
public static long numberOfWeeks(int[] milestones) {
        long[] dp = new long[milestones.length];
        int pqLen;
        dp[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        int pqHead, prev;
        for (long i = 1; i < dp.length; i++) {
            pqHead = pq.peek();
            if (milestones[(int) i] < dp[pqHead]) {
                dp[(int) i] = dp[pqHead] + milestones[(int) i];
            } else {
                dp[(int) i] = milestones[(int) i];
            }
            pqLen = pq.size();
            for (int j = 0; j < pqLen; j++) {
                prev = pq.remove();
                if (prev == pqHead) continue;
                if (milestones[(int) i] + dp[prev] < dp[pqHead]) {
                    pq.add(prev);
                    dp[(int) i] = dp[prev] + milestones[(int) i];
                    pq.add((int) i);
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }   
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _milestones_size = 0;
        _milestones_size = Integer.parseInt(in.nextLine());
        
        int[] _milestones = new int[_milestones_size];
        int _milestones_item;
        for (int _milestones_i = 0; _milestones_i < _milestones_size; _milestones_i++) {
            _milestones_item = Integer.parseInt(in.nextLine());
            _milestones[_milestones_i] = _milestones_item;
        }
        
        long res = numberOfWeeks(_milestones);
        
        System.out.println(String.valueOf(res));
        
    }

}