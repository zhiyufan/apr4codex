package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i : tickets) {
            q.offer(i);
        }
        int cur = 0;
        while (k > 0) {
            int num = q.poll();
            if (num > 1) {
                q.offer(num - 1);
            }
            cur++;
            k--;
        }
        while (!q.isEmpty()) {
            q.poll();
            cur++;
        }
        return cur;
    }









      public static int timeRequiredToBuy(int[] tickets, int k) {
        int max = Integer.MIN_VALUE;
        for (int i : tickets) {
            max = Math.max(i, max);
        }
        int cur = 0;
        while (max > 0) {
            int idx = maxWindow(tickets, max);
            if (idx >= 0 && k > 0) {
                k--;
                cur++;
                tickets[idx]--;
            } else {
                break;
            }
            max = Integer.MIN_VALUE;
            for (int i : tickets) {
                max = Math.max(i, max);
            }
        }
        for (int i : tickets) {
            cur += i;
        }
        return cur;
    }

    public static int maxWindow(int[] tickets, int max) {
        int idx = -1;
        int maxval = -1;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] == max) {
                int j = i;
                int cnt = 0;
                while (j < tickets.length && tickets[j] == max) {
                    cnt++;
                    j++;
                }
                if (cnt >= maxval) {
                    idx = i;
                    maxval = cnt;
                }
                i = j - 1;
            }
        }
        return idx;
    }



    
}