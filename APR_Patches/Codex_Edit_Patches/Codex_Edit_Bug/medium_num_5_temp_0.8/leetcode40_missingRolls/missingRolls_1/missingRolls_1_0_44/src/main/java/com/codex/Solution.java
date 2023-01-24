package com.codex;

import java.util.*;

public class Solution {
public static int[] missingRolls(int[] rolls, int mean, int n) {
        if (n == 0) {
            return new int[0];
        } else {
            int[] res = new int[n];
            int sum = mean * (n + rolls.length);
            for (int roll : rolls) {
                    sum -= avg;
                }
            } else {
                return new int[0];
            }
        }
        return res;
    }
    
}