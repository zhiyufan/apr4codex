package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfThree(int num) {

        if (num < 0) {
            return 0;
        }
        int low = 1;
        int high = 2;
        int sum = 3;

        long sum = 3;

        while (high < num) {
            if (sum < num) {
                high += 1;
                sum += high * high * high;
            } else if (sum < num) {
                sum -= low * low * low;
                low += 1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}