package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Arrays.sort(tickets);
        int total = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (k > 0) {
                if (tickets[i] < tickets[k]) {
                    total += tickets[i];
                } else {
                    total += tickets[k];
                    k--;
                }
            } else { 
                total += tickets[k]; 
                k--;
            }
        }
        return total;
    }

    
}