package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Arrays.sort(tickets);
        int total = 0;
        for (int i = 0; i <= k; i++) {
            if (tickets[i] < tickets[k]) {
                total += tickets[i];
            } else {
                total += tickets[k];
            }

            for(int j = k + 1; j < tickets.length; j++) {
                total += tickets[j];
            }
        }
        return total;
    }

    
}