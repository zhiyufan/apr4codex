package com.codex;

import java.util.*;

public class Solution {
     public static int timeRequiredToCheck(int[] tickets, int k) {
 
        if (tickets.length == 0) {
            return 0;
        }
        int best = k;
        int total = tickets[k];
        for (int i = k + 1; i < tickets.length; i++) {
            // check if we need to move to another person
            int time = total + (i - best) * tickets[best];
            if (tickets[i] < tickets[best]) {
                best = i;
            }
            total = time;
        }
        return total;
    }

    
}