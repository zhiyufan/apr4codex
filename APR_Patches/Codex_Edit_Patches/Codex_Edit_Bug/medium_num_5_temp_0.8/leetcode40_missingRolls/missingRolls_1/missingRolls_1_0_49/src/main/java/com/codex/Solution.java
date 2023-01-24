package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4};
        int[] res = missingRolls(arr, 3, 2);
        for (int r : res) {
            System.out.print(r + "  ");
        }
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int sumOfrolls = 0;
        int nSum = n * mean;
        int[] res = new int[n];
        for (int i = 0; i < rolls.length; i++) {
            sumOfrolls += rolls[i];
        }
        for (int i = 0; i < nSum; i++) {
            if (sumOfrolls % n == 0) {
                res[i] = sumOfrolls / n;
                sumOfrolls -= res[i];
            } else {
                return new int[0];
            }
        }
        return res;
    }
   
}