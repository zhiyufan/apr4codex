package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] arr = new int[rolls.length];
        int missingRolls = (n + rolls.length) - 1;
        int meanDiff = mean - (sum(rolls) + rolls[0]) / n;
        arr[0] = rolls[0] + meanDiff;
        for (int i = 1; i < missingRolls; i++) {
            arr[i] = mean;
        }
        arr[missingRolls] = rolls[rolls.length - 1] + meanDiff;
        return arr;
    }

    
}