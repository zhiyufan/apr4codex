package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int[] counter = new int[tickets.length];
        for (int i = 0; i < tickets.length; i++) {
            counter[i] = tickets[i];
        }
        int time = 0;
        while (counter[k] > 0 || counter[0] > 0 || counter[1] > 0 || counter[2] > 0 || counter[3] > 0) {
            time++;
            for (int i = 0; i < counter.length; i++) {
                if (i == k && counter[i] > 0) {
                    counter[i]--;
                } else if (i != k && counter[i] > 0) {
                    counter[i]--; 
                }
            }
        }
        return time;
    }

    
}