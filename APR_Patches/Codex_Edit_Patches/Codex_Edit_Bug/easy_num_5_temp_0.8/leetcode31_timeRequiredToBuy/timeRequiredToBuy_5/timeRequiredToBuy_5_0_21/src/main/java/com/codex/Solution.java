package com.codex;

import java.util.*;

public class Solution {
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i : tickets) {
            q.offer(i);
        }
        int cur = 0;
        while (!q.isEmpty()) {
            int num = q.peek();
            if (num <= k) {
                q.poll();
                k-=num;
            } 
            cur++;
        }
        while (!q.isEmpty()) {
            q.poll();
            cur++;
        }
        return cur;
    }


    
}