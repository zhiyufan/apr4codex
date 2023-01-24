package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] ans = new int[n];
        int sum1 = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
        }
        int sum = (mean * (n + rolls.length)) - sum1;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sum / n;
        }
        return ans;
    }

    for (int i = 0; i < rolls.length; i++) {

            sum += rolls[i];
        }
        double mean1 = sum / rolls.length;
        double temp = 0.0;
        for (int i = 0; i < rolls.length; i++) {
            temp += Math.pow((rolls[i] - mean1), 2);
        }
        double sd = Math.sqrt(temp / rolls.length);
        return (int) (mean1 - (sd * 3));
    }

    public static int max1(int[] rolls) {

        int sum = 0;
        for (int i = 0; i < rolls.length; i++) {

            sum += rolls[i];
        }
        double mean1 = sum / rolls.length;
        double temp = 0.0;
        for (int i = 0; i < rolls.length; i++) {
            temp += Math.pow((rolls[i] - mean1), 2);
        }
        double sd = Math.sqrt(temp / rolls.length);
        return (int) (mean1 + (sd * 3));
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {

        int[] ans = new int[n];
        int sum1 = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
        }
        int sum = (mean * (n + rolls.length)) - sum1;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sum / n;
        }
        return ans;
    }

    public static boolean checkInput(int[] rolls, int mean, int n) {

        int min = min1(rolls);
        int max = max1(rolls);
        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i] > min && rolls[i] < max) {
                return false;
            }
        }
        return true;
    }
}
    
}