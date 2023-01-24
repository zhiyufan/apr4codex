package com.codex;

import java.util.*;

public class Solution {
public static int[] missingRolls(int[] rolls, int mean, int n) {
    if (mean * rolls.length != sum(rolls)) return new int[]{};
    int sum = mean * (rolls.length + n);
    for (int x : rolls) sum -= x;
    if (sum % n != 0) return new int[]{};
    int avg = sum / n;
    for (int i = 0; i < rolls.length; i++) {
        if (rolls[i] < 1 || rolls[i] > 6) return new int[]{};
    }
    if (avg < 1 || avg > 6) return new int[]{};
    int[] res = new int[n];
    Arrays.fill(res, avg);
    return res;
}

private static int sum(int[] a) {
    int sum = 0;
    for (int x : a) sum += x;
    return sum;
}
}