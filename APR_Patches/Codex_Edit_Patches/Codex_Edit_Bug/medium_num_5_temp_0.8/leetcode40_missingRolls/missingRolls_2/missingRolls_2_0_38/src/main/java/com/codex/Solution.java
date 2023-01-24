package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] missingRolls = new int[n];

        int sum = 0;

        for (int element : rolls) {
            sum = sum + element;
        }


        mean = (mean * n) - sum;
        int next = Math.round(mean / n);
        
        if (next > 6 || next < 1) {
            return new int[0];
        }

        if (next == 6) {
            while (n > 0) {
                missingRolls[n - 1] = 6;
                n--;
            }
        }
        else if (next == 1) {
            while (n > 0) {
                missingRolls[n - 1] = 1;
                n--;
            }
        }
        else {
            while (n > 0) {
                missingRolls[n - 1] = 6;
                n--;
            }
        }

        return missingRolls;
    }

    
}