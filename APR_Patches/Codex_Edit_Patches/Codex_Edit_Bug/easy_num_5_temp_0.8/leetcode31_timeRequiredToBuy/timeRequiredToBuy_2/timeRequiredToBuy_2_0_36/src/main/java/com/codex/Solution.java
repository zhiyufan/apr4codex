package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Arrays.sort(tickets); //It is not necessary to sort the array.
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