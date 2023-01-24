package com.codex;

import java.util.*;

public class Solution {
public static int numberOfPairs(int[] a, long k) {
    
    int count = 0;
    for (int i = 0; i < a.length; i++) {
        for (int j = i + 1; j < a.length; j++) {
            if (a[i] + a[j] == k) count++;
        }
    }

    return count;
}
}