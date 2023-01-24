package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];
        int sum = 0;
        for (int roll : rolls) {sum+=roll;}
        for (int i = 0; i < n; i++) {
            res[i] = mean - ((sum - rolls[i]) / (n - 1));
        }

        return res;
    }

    
}