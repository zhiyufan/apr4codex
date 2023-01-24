package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int[] counter = new int[tickets.length];
        for (int i = 0; i < tickets.length; i++) {
            counter[i] = tickets[i];
        }
        int time = 0;
        int cur = 0;
        while (counter[k] > 0) {
            time++;
            cur++;
            if (cur == counter.length){
                cur = 0;
            }
            while (counter[cur] == 0) {
                cur++;
                if (cur == counter.length){
                    cur = 0;
                }
            }
            counter[cur]--;
        }
        return time;
    }

    
}