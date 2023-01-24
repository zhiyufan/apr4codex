package com.codex;

import java.util.*;

public class Solution {
    public static int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length) return -1;
        int l = 1, r = (int)1e9;
        while(l < r) {
            int mid = (l + r) / 2;
            if(check(bloomDay, m, k, mid)) r = mid;
            else l = mid+1;
        }
        return l;
    }

    public static boolean check(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0, curr = 0;
        for(int b : bloomDay)
            if(b <= day) curr++;
            else curr = 0;
            if(curr >= k) { bouquets++; curr = 0; }
        return bouquets >= m;
    }
}