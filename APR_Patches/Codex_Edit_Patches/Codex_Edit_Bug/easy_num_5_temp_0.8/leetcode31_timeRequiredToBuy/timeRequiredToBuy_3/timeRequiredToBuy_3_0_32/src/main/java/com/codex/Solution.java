package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

    public static int timeRequiredToBuy(int[] tickets, int k) {

        int maxTicketsNeeded = 0;
        int currentTicketsNeeded = 0;

        for (int ticket : tickets) {
            maxTicketsNeeded = Math.max(ticket, maxTicketsNeeded);
        }

        if (maxTicketsNeeded > k) {
            return maxTicketsNeeded * 2 - 1;
        }

        for (int i = 1; i <= k; i++) {
    public static void main(String[] args) {
        int[] tickets = {2, 6, 3, 4, 5};
        System.out.println(timeRequiredToBuy(tickets, 2));
    }

            currentTicketsNeeded = Math.max(currentTicketsNeeded, tickets[i]);
        }

        return currentTicketsNeeded * 2 + (k - currentTicketsNeeded) + (k - currentTicketsNeeded);
    }
}