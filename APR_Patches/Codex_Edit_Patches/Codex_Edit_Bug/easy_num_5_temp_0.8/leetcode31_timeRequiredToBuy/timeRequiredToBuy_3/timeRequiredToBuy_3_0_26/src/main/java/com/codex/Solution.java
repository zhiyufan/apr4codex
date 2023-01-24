package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] tickets = { 2, 6, 3, 4, 5 };
        int k = 2;
        int answer = timeRequiredToBuy(tickets, k);
        System.out.println(answer);
    }

    public static int timeRequiredToBuy(int[] tickets, int k)
    {
        Arrays.sort(tickets);
        int maxTicketsNeeded = 0;
        int currentTicketsNeeded = 0;

        int count = 0;
        for (int i = 0; i < tickets.length; i++) {
            currentTicketsNeeded += tickets[i];
            if (currentTicketsNeeded > k) {
                return tickets[i] * 2;
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