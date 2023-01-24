package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int[] counter = new int[tickets.length + 1];

        for (int i = 0; i < tickets.length; i++) {
            counter[i] = tickets[i];
        }
        int time = 0;
        while (counter[k - 1] > 0) {

            time++;

            for (int i = 0; i < counter.length; i++) {
                if (counter[i] > 0) {
                    counter[i + 1]++;
                    counter[i] = 0;
                }
            }
        }

        return time;
    }

    
}