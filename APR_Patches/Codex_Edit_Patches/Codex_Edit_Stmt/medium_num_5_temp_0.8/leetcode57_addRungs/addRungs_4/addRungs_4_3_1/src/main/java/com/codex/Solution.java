package com.codex;

import java.util.*;

public class Solution {
    public void run() {
        int t = ni();
        for (int i = 0; i < t; i++) {
            int n = ni();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = ni();
            }
            System.out.println(solve(a));
        }
    }

    private int solve(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        int left = 0;
        int right = 1000000000;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (check(a, b, mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
    boolean check(int[] a, int[] b, int dist) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        int i = 1;
        while (i < n) {
            if (b[i] > b[i - 1] + dist) {
                return false;
            }
            if (b[i] + dist > b[i - 1]) {
                i++;
            } else {
                if (i + 1 < n && b[i + 1] <= b[i] + dist) {
                    i += 2;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    
    
}