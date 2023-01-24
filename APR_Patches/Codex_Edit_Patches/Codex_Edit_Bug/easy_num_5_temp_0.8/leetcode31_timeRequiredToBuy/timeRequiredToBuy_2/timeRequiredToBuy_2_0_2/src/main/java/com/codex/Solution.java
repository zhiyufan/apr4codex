package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Arrays.sort(tickets);
        int total = 0;
        int length = tickets.length;
        for (int i = 0; i <= k; i++) {
            if (tickets[i] < tickets[length - 1]) {
                total += tickets[i];
            } else {
                total += tickets[length - 1];
            }
        }
        return total;
    }

    
}