package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int numberOfTickets = 0;
        int maxTickets = 0;
        int minTickets = 0;
        int maxTicketsFound = 0;
        int minTicketsFound = 0;
        int totalTime = 0;

        for (int ticket : tickets) {
            numberOfTickets++;

            if (ticket > maxTickets) {
                maxTickets = ticket;
                maxTicketsFound = numberOfTickets;
            }

            else if (ticket < minTickets) {
                minTickets = ticket;
                minTicketsFound = numberOfTickets;
            }
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