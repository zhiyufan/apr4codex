package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        k = k - 1;
        Arrays.sort(tickets);
        int total = 0; 
        for (int i = 0; i <= k; i++) {
            if (tickets[i] < tickets[k]) {
                total += tickets[i];
            } else {
                total += tickets[k];
            }
        }
        return total;
    }

    
}