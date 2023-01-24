package com.codex;

import java.util.*;

public class Solution {
public class ThreeNum {


    public static void main(String[] args) {
        int[] rolls = new int[]{5,5,5,5};
        int mean = 5;
        int n = 1;
        int[] res = missingRolls(rolls, mean, n);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];
        int sum = mean * (n + rolls.length);
        for (int roll : rolls) {
            sum -= roll;
        }
        for (int i = 0; i < n; i++) {
            int avg = sum / (n - i);
            if (avg > 0 && avg <= 6) {
                res[i] = avg;
                sum -= avg;
            } else {
                return new int[0];
            }
        }
        return res;
    }
    
}