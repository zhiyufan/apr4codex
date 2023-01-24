package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] rolls = {1,2,3,4,5,6};
        System.out.println(missingRolls(rolls, 21, 7));
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        mean = mean - sum(rolls);
        mean = mean / n;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = mean;
        }
        return res;
    }

    private static int sum(int[] rolls) {
        int sum = 0;
        for (int roll : rolls) {
            sum += roll;
        }
        return sum;
    }
}