package com.codex;

import java.util.*;

public class Solution {
    import java.util.*;

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        double mean = 0;
        int sum = 0;
        for (int roll : rolls) sum += roll;
        mean = (double) sum / n;
        
        int[] res = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = mean;
        return res;
    }
    
}