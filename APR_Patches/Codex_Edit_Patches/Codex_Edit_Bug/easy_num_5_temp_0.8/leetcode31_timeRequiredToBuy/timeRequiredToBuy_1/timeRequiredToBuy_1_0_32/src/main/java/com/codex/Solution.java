package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int n) {
        int[] counter = new int[tickets.length-1];
        for (int i = 0; i < counter.length; i++) {
            counter[i] = tickets[i]; 
        }
        int time = 0;
        for (int i = 0; i < tickets[tickets.length-1]; i+=counter.length) {
            time++;
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] > 0) {
                    counter[i]--;
                }
            }
        }
        return time;
    }

    
}