package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int sum = 0;
        for (int roll : rolls) sum += roll;
        
        int next = (mean * rolls.length - sum) / n;
        if (next > 6 || next < 1) {
            return new int[0];
        }

        int[] missingRolls = new int[n];
        for (int i = 0; i < n; i++) {
            if (next == 6) {
                missingRolls[i] = 6;
            }
            if (next == 1) {
                missingRolls[i] = 1;
            }
            missingRolls[i] = next;
            if (next == 5) {
                next = 1;
            } else {
                next++;
            }
                n--;
            }
        
        return missingRolls;
    }

    
}