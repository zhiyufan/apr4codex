package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Solution {
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


    public static void main(String[] args) {
        int[] tickets = {1, 2, 5};
        int k = 2;
        System.out.println(Solution.timeRequiredToBuy(tickets, k));
    }
}
}