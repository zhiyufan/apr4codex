package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int time = 0;
        while (tickets[k] > 0) {
            time++;
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                }
            }
        }
        return time;
    }

    
}