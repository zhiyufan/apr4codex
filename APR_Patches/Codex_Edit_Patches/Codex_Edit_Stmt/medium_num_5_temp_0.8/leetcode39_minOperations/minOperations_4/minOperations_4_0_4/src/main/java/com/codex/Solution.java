package com.codex;

import java.util.*;

public class Solution {
public static int minOperations(int[][] grid, int x) {

        int numberOfOperations = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt == x) continue;
                if (anInt < x) {
                    if ((x - anInt) % x != 0) return -1;
                    numberOfOperations += (x - anInt) / x;
                } else if ((anInt - x) % x != 0) return -1;
                numberOfOperations += (anInt - x) / x;
            }
        }
        return numberOfOperations;
    }
}