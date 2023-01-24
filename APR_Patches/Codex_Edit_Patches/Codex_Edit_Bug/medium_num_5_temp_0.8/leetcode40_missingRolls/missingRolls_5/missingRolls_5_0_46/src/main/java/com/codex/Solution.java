package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        for (int roll : rolls) {
            mean -= roll;
        }
        mean /= n;
        int res = mean;
        return res;
    }

    
}