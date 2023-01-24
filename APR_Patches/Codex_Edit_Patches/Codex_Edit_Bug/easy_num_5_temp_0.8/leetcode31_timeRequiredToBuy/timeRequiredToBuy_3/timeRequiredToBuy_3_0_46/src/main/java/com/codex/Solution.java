package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int maximum = 0;

        for (int ticket : tickets) {
            maximum = Math.max(ticket, maximum);
        }

        if (maximum > k) {
            return maximum * 2 - 1;
        }

        for (int i = 0; i <= k; i++) {
            maximum = Math.max(maximum, tickets[i]);
        }

        return maximum * 2 + (k - maximum) + (k - maximum);
    }

    
}