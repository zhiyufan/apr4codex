package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int maxTicketsNeeded = 0;
        int currentTicketsNeeded = 0;

        for (int ticket : tickets) {
            maxTicketsNeeded = Math.max(ticket, maxTicketsNeeded);
        }

        if (maxTicketsNeeded > k) {
            return maxTicketsNeeded * 2 - 1;
        }

        for (int i = 0; i <= k; i++) {
            currentTicketsNeeded = Math.max(currentTicketsNeeded, tickets[i]);
        }

        return currentTicketsNeeded * 2 + (k - currentTicketsNeeded) + (k - currentTicketsNeeded);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int tickets[] = new int[n];
        for (int tickets_i = 0; tickets_i < n; tickets_i++) {
            tickets[tickets_i] = in.nextInt();
        }
        System.out.println(timeRequiredToBuy(tickets, k));
    }
    
}