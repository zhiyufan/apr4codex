package com.codex;

import java.util.*;

public class Solution {
    //solution one
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
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

    //solution two
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Arrays.sort(tickets);
        int total = 0;
        for (int i = 0; i < k; i++) {
            total += tickets[i];
        }
        total += tickets[k];
        return total;
    }
}