package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int[] res = new int[n];
        int sum = mean * (n + rolls.length);
        for (int roll : rolls) {
            sum -= roll;
        }
        if (sum % n == 0) {
            int avg = sum / n;
            if (avg <= 6) {
                int percentile = sum / n - 1;
                int small = percentile, big = 6 - percentile;
                for (int i = 0; i < n; i ++) {
                    if (small > 0) {
                        res[i] = avg - 1;
                        small --;
                    } else {
                        res[i] = avg + 1;
                        big --;
                    }
                }
                return res;
            } else {
                int percentile = (sum / n) / 2;
                int small = percentile, big = n - percentile;
                for (int i = 0; i < n; i ++) {
                    if (small > 0) {
                        res[i] = avg / 2;
                        small --;
                    } else {
                        res[i] = (avg + 1) / 2;
                        big --;
                    }
                }
                return res;
            }
        } else {
            int percentile = sum / n;
            if (percentile <= 6) {
                int small = percentile, big = 6 - percentile;
                if ((sum % n) % 2 == 0) {
                    small += (sum % n) / 2;
                    big += (sum % n) / 2;
                } else {
                    return new int[0];
                }
            } else {
                return new int[0];
            }
        }
        return res;
    }
    
}