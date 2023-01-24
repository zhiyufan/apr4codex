package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int missing) {
        
        int[] missingRolls = new int[missing];

        for (int i = 0; i < rolls.length; i++) {
            mean = mean - rolls[i];
        }

        int next = mean / missing;
        if (next > 6 || next < 1) {
            return new int[0];
        }

        if (next == 6) {
            while (missing > 0) {
                missingRolls[missing - 1] = 6;
                missing--;
            }
        }
        if (next == 1) {
            while (missing > 0) {
                missingRolls[missing - 1] = 1;
                missing--;
            }
        }
        while (n > 0) {
            missingRolls[n - 1] = next;
            n--;
        }

        return missingRolls;
    }

    
}