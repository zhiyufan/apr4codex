package com.codex;

import java.util.*;

public class Solution {
    /**
     * 
     * @param tickets 
     * @param k
     * @return int time
     */
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int[] counter = new int[tickets.length];
        for (int i = 0; i < tickets.length; i++) {
            counter[i] = tickets[i];
        }
        int time = 0;
        while (counter[k] > 0) {
            time++;
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] > 0) {
                    counter[i]--;        // this means to "get a ticket", and that ticket still belongs to the same queu
                }
            }
        }
        return time;
    }

    
}