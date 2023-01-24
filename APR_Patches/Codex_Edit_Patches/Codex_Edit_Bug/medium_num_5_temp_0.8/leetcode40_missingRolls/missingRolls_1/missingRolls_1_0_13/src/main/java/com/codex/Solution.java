package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class MissingDiceRolls {

    public static void main(String[] args) {
        System.out.println("Printing: " + Arrays.toString(missingRolls(new int[] {1,2}, 3, 3)));
        System.out.println("Printing: " + Arrays.toString(missingRolls(new int[] {1,1}, 3, 2)));
        System.out.println("Printing: " + Arrays.toString(missingRolls(new int[] {1,2}, 3, 2)));
        System.out.println("Printing: " + Arrays.toString(missingRolls(new int[] {1,1}, 2, 2)));
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {    
        int[] res = new int[n - rolls.length];
        int missingSum = mean * n - sum(rolls);

        for (int i = 0; i < res.length; i++) {
            if (missingSum % res.length == 0) {
                int avg = missingSum / res.length;
                if (avg > 0 && avg <= 6) {
                    res[i] = avg;
                    missingSum -= avg;
                } else {
                    return new int[0];
                }
            } else {
                return new int[0];
            }
        }
        for (int i = 0; i < n; i++) {
            if (sum % n == 0) {
                int avg = sum / n;
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