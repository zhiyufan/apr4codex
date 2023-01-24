package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int maxTicketsNeeded = tickets[0];
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

    
}