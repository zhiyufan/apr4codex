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

        if (next == 6) {
            while (n > 0) {
                missingRolls[rolls.length + n - 1] = 6;
                n--;
            }
        }
        if (next == 1) {
            while (n > 0) {
                missingRolls[rolls.length + n - 1] = 1;
                n--;
            }
        }
        while (n > 0) {
            missingRolls[rolls.length + n - 1] = next;
            n--;
        }

        return missingRolls;
    }

    
}