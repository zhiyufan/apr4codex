package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] rolls = {2,3,5,6};
        int[] miss = missingRolls(rolls,4,3);
        for (int i : miss) {
            System.out.print(i);
        }
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];
        int sum = mean * (n + rolls.length);
        for (int roll : rolls) {
            sum -= roll;
        }
        for (int i = 0; i < n; i++) {
            if (sum % (n-i) == 0) {
                int avg = sum / (n-i);
                if (avg > 0 && avg <= 6) {
                    res[i] = avg;
                    sum -= avg;
                } else {
                    return new int[0];
                }
            } else {
                return new int[0];
            }
        }
        return res;
    }
    
}