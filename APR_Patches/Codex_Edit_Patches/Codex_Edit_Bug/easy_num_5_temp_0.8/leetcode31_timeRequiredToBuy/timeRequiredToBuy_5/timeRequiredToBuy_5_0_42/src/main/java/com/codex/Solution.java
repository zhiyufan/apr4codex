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


    // Time complexity: O(n), Space complexity: O(n)

    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int[] queue = new int[tickets.length];
        for (int i : tickets) {
            queue[i] = i;
        }
        int cur = 0;
        while (k > 0) {
            int num = 0;
            for (int i = 0; i < queue.length; i++) {
                if (queue[i] != 0) {
                    num = queue[i];
                    queue[i] = 0;
                    break;
                }
            }
            if (num > 1) {
                queue[num - 1] = num - 1;
            }
            cur++;
            k--;
        }
        return cur;
    }

    
}