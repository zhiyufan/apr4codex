package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int total = 0;
        Arrays.sort(tickets);
        for (int i = 0; i < k; i++) {
            total += tickets[i];
        }
        total += tickets[k];
        
        return total;        
    }    

    
}