package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int[] counter = new int[tickets.length];
        for (int i = 0; i < tickets.length; i++) {
            counter[i] = tickets[i];
        }
        int time = 0;
        while (counter[k] > 0) {
            time++;
            for (int i = 0; i < counter.length; i++) { // 0 1 2 3 4 5
                if (counter[i] > 0) { //   2 0 0 0 2 1
                    counter[i]--;
                }
            }
        }
        return time;
    }

    
}