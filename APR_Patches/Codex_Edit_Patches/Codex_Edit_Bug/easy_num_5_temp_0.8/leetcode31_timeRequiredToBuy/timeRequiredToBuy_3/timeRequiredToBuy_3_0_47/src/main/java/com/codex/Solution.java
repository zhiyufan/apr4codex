package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int maxTicketsNeeded = 0;  // max number of tickets needed to buy in an interval of size k
        int currentTicketsNeeded = 0; // Currently max number of tickets needed in an interval of size k

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