package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int[] res = new int[n];
        for (int roll : rolls) {
            mean -= roll;
        }
        mean /= n;
        for (int i = 0; i < n; i++) {
            res[i] = mean;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.print(Arrays.toString(missingRolls(new int[]{1, 1, 1, 1, 1, 1, 3}, 3, 6)));
    }
}
}