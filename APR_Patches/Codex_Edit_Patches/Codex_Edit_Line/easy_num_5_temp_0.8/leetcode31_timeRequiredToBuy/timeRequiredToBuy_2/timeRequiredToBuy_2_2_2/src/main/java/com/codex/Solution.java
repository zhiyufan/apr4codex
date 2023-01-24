package com.codex;

import java.util.*;

public class Solution {
    //Problem : Given an array of positive integers representing the cost of each ticket and a positive integer k.
    // Find the minimum time to buy k tickets in the cinema.
    //Tickets for buy tickets are sold in the sequence 1, 2, 3, ..., n, which gives the minimum time.

    public static int timeRequiredToBuy(int[] tickets, int k) {

        Arrays.sort(tickets);
        int total = 0;
        for (int i = 0; i < k; i++) {
            if (tickets[i] < tickets[k]) {
                total += tickets[i];
            } else {
                total += tickets[k];
            }
        }
        return total;
    }
}