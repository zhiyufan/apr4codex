package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int length = rolls.length;
        
        int[] missingRolls = new int[length];

        for (int i = 0; i < length; i++) {
            mean = mean - rolls[i];
        }

        int next = mean / n;
        if (next > 6 || next < 1) {
            return new int[0];
        }

        if (next == 6) {
            while (length > 0) {
                missingRolls[length - 1] = 6;
                length--;
            }
        }
        if (next == 1) {
            while (length > 0) {
                missingRolls[length - 1] = 1;
                length--;
            }
        }
        while (n > 0) {
            missingRolls[n - 1] = next;
            n--;
        }

        return missingRolls;
    }

    
}