package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
    
    int n = start;
    int m = goal;
    int ans = 0;
    int count = 0;
    while (n > 0 || m > 0) {
    	count = 0;
        int b1 = n % 2;
        int b2 = m % 2;
        if (b1 != b2) {
            count++;
            if (count % 2 == 0)
            	ans++;
        } else {
            if (count % 2 != 0) {
                ans++;
            }
            n /= 2;
            m /= 2;
        }
        if (count % 2 != 0)
            return -1;
        return ans + count / 2;
    }

    
}