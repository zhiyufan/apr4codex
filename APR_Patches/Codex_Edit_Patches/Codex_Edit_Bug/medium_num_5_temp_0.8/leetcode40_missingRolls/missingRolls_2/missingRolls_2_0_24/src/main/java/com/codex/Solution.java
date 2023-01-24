package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] missingRolls = new int[n];

        for (int i = 0; i < rolls.length; i++) {
            mean = mean - rolls[i];
        }

        int next = mean / n;
        if (next > 6 || next < 1) {
            return new int[0];
        }
                index++;

        if (next == 6) {
            int index = 0;
            while (n > 0 && index < missingRolls.length) {
                missingRolls[index] = 6;
                n--;
            }
        }
        if (next == 1) {
            while (n > 0) {
                missingRolls[n - 1] = 1;
                n--;
            }
        }
        while (n > 0) {
            missingRolls[n - 1] = next;
            n--;
        }

        return missingRolls;
    }

    
}