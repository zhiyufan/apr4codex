package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Arrays.sort(tickets);
        int total = 0;
        if (k >= tickets.length) {
            return total + tickets[tickets.length - 1];
        }
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                total += tickets[k];
            } else {
                total += tickets[i];
            }
        }
        return total;
    }

    
}