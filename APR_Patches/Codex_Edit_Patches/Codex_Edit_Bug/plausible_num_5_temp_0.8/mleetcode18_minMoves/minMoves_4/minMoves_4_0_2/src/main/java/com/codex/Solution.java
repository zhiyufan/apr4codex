package com.codex;

import java.util.*;

public class Solution {
    public int minSwaps(int[] data) {
    int n = data.length;
    int[] zeroes = new int[n];
    for (int i = 0; i < n; i++) zeroes[i] = i;
    for (int i = 0; i < n; i++) 
        if (data[i] == 0)
            zeroes[i] = i + 1 < n && data[i + 1] == 0
            ? zeroes[i + 1] : i;
    int swaps = 0;
    for (int i = 0; i < n; i++) {
        if (data[i] == 1) continue;
        if (data[i] == 0) {
            swaps = Math.max(swaps, zeroes[i] - i);
        } else {
            int j = i;
            while (data[j] == -1 && j < n) j++;
            if (j == n) 
                return -1;
            swaps = Math.max(swaps, zeroes[j] - i);
        }
    }
    return swaps;
}
}