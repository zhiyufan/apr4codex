package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Arrays.sort(tickets);
        int[] clone = tickets.clone();
        int total = 0;
        for (int i = 0; i < k; i++) {
            if (clone[i] < clone[k]) {
                total += clone[i];
            } else {
                total += tickets[k];
            }
        }
        return total;
    }

    
}