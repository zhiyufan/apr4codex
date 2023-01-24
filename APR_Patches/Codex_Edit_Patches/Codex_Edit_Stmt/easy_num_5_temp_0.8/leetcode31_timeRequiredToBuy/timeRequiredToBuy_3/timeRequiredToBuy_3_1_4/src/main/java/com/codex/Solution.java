package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int sumTickets = 0;
        int maxTicketsNeeded = 0;
        int currentTicketsNeeded = 0;

        for (int ticket : tickets) {
            maxTicketsNeeded = Math.max(ticket, maxTicketsNeeded);
        }

        for (int ticket : tickets) {
            sumTickets += ticket;
        }        

        for (int i = 0; i <= k; i++) {
            currentTicketsNeeded = Math.max(currentTicketsNeeded, tickets[i]);
        }

        return currentTicketsNeeded * 2 + (sumTickets - currentTicketsNeeded) + (k - currentTicketsNeeded);
    }

    
}