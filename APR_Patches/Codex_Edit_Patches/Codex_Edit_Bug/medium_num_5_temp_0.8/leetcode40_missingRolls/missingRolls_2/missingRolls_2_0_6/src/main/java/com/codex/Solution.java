package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        if (rolls.length + n <= 0) {
            return new int[0];
        }
        
        int[] missingRolls = new int[n];

        for (int i = 0; i < rolls.length; i++) {
            mean = mean - rolls[i];
        }

        int next = mean / n;
        if (next >= 6 || next <= 1) {
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
        else if (next > 1 && next < 6) {
            while (n > 0) {
                missingRolls[n - 1] = next;
                n--;
            }
        }
        else if (next == -1) {
            while (n > 0) {
                if (missingRolls[n - 1] == 1) {
                    missingRolls[n - 1] = 6;
                } else {
                    missingRolls[n - 1] = 1;
                }
                n--;
            }
        }
        else if (next < -1) {
            while (n > 0) {
                if (missingRolls[n - 1] == 6) {
                    missingRolls[n - 1] = 1;
                } else {
                    missingRolls[n - 1] = 6;
                }
                n--;
            }
        }
        else {
            while (n > 0) {
            missingRolls[n - 1] = next;
            n--;
            }
        }

        }

        return missingRolls;
    }

    
}