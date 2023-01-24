package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] rolls = {1,2,3,4,5};
        int[] res = missingRolls(rolls, 15, rolls.length+2);
        
        System.out.println("Result: " + java.util.Arrays.toString(res));
    }
    
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int[] res = new int[n];
        for (int roll : rolls) {
            mean -= roll;
        }
        mean /= n;
        for (int i = 0; i < n; i++) {
            res[i] = mean;
        }
        return res; // <----- shouldn't it return mean
    }

    
}