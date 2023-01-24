package com.codex;

import java.util.*;

public class Solution {
public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[] { 1, 2, 3, 3, 3, 4 }, 3));
        System.out.println(timeRequiredToBuy(new int[] { 2, 6, 3, 4, 5 }, 3));
        System.out.println(timeRequiredToBuy(new int[] { 2, 10, 3, 1, 5, 8 }, 5));
    }

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
            currentTicketsNeeded += tickets[i];
        }

        return currentTicketsNeeded * 2 + (k - currentTicketsNeeded) + (k - currentTicketsNeeded);
    }

    
}