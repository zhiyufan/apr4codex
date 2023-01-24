package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] rolls = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = rolls.length;
        int mean = (rolls[0] + rolls[n - 1]) * n / 2;
        int[] missingRolls = missingRolls(rolls, mean, n);
        System.out.println(Arrays.toString(missingRolls));
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] missingRolls = new int[n];

        for (int i = 0; i < rolls.length; i++) {
            mean = mean - rolls[i];
        }

                mean = mean - 6;
        int next = mean / n;
 
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
                mean = mean - 1;
            }
        }
        while (n > 0) {
            missingRolls[n - 1] = next;
            mean = mean - next;
            n--;
        }

        return missingRolls;
    }
}