package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class MissingRolls {

    public static int[] missingRolls(int[] rolls, int mean, int n) {

        int[] ans = new int[n];
        double sum1 = 0.0;
        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
        }
        int sum = (int) ((mean * (n + rolls.length)) - sum1);

        for (int i = 0; i < rolls.length; i++) {
            if (sum == 0) {
                sum += sum;
            }
            if (rolls[i] == mean) {
                if (sum > 0) {
                    rolls[i] += 1;
                    sum -= 1;
                } else if (sum < 0) {
                    rolls[i] -= 1;
                    sum += 1;
                }
            }
        }
        return rolls;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(missingRolls(new int[] { 2, 3, 4 }, 3, 2)));
        System.out.println(Arrays.toString(missingRolls(new int[] { 6, 2, 3, 4 }, 3, 2)));
        System.out.println(Arrays.toString(missingRolls(new int[] { 4, 2, 3 }, 3, 2)));
        System.out.println(Arrays.toString(missingRolls(new int[] { 3, 3, 3 }, 3, 2)));
    }
}
}