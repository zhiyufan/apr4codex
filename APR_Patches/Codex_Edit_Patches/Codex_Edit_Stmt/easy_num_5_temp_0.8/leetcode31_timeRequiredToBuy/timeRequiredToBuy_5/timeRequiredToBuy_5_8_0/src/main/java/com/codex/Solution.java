package com.codex;

import java.util.*;

public class Solution {
public static int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> q = new LinkedList<Integer>();
        for (int num : tickets) {
            q.offer(num);
        }
        int cur = 0;
        while (k > 0) {
            int num = q.poll(); // 先拿出来，最后还要放回去嘛
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
}
}