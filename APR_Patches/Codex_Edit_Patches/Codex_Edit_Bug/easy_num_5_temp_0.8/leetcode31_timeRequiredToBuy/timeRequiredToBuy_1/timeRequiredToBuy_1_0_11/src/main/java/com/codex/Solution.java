package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int time = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] > 0) {
                tickets[i] = tickets[i] - 1;
                time = time + 1;
            }
            if (tickets[i] == 0 && i == k) {
                break;
            }
        }
        return time;
    }

    
}