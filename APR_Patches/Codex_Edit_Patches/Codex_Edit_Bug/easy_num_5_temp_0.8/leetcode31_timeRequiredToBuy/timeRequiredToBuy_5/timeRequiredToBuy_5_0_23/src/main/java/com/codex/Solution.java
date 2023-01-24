package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> q = new LinkedList<Integer>();
        for (int i : tickets) {
            q.offer(i);
        }
        int cur = 0;
        while (k > 0 && !q.isEmpty()) {
            int num = q.poll();

            // Check whether the next ticket is bigger than the current one, if yes, swap them
            if (!q.isEmpty() && num < q.peek()) {
                q.offer(num);
                num = q.poll();
            }

            if (num > 1) {
                q.offer(num - 1);
            }
            cur++;
            k--;

            if (k > 0 && q.isEmpty()) {
                cur += k;
                k = 0;
            }
        }
        return cur;
    }


    
}