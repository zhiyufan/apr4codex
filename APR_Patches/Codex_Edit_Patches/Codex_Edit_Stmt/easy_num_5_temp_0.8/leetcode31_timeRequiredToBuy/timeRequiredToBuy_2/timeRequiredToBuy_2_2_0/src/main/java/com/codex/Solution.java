package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Arrays.sort(tickets);
        int total = 0, max = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i < k) {
                total += tickets[i];
            } else if (i == k) {
                total += tickets[i];
                max = total;
            } else {
                total += tickets[k];
            }
        }
        return total;
    }

    
}