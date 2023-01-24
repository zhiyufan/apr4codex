package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

    public static int[] missingRolls(int[] rolls, int mean, int n) {

        if (mean <= 0) {
            return new int[0];
        }
        
        int[] missingRolls = new int[n];

        int next = mean / n;
        int sum = 0;

        if (next == 0) {
            next = 1;
        }

        if (next == 6) {
            while (n > 0) {
                missingRolls[n - 1] = 6;
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