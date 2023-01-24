package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int maxTicketsNeeded = 0;
        int currentTicketsNeeded = 0;

        for (int i = 0; i < tickets.length; i++) {
            maxTicketsNeeded = Math.max(tickets[i], maxTicketsNeeded);
        }

        if (maxTicketsNeeded > k) {
            return maxTicketsNeeded * 2 - 1;
        }

        for (int i = 0; i < tickets.length; i++) {
            currentTicketsNeeded = Math.max(currentTicketsNeeded, tickets[i]);
        }

        return currentTicketsNeeded * 2 + (k - currentTicketsNeeded) + (k - currentTicketsNeeded);
    }

    
}