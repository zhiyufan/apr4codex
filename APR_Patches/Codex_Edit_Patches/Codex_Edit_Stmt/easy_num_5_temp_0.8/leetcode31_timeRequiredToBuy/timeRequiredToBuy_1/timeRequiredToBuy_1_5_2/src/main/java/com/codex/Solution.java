package com.codex;

import java.util.*;

public class Solution {
		
		int[] tickets = {2, 6, 3, 4, 5};
		int[] tickets = {1, 2, 5};
		
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int[] counter = new int[tickets.length];
        int flag = 0;
        for (int i = 0; i < tickets.length; i++) {
            counter[i] = tickets[i];
        }
        int time = 0;
        while (flag != 1) {
            flag = 1;
            time++;
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] > 0) {
                    counter[i]--;
                    flag = 0;
                }
            }
        }
        return time;
    }

    
}