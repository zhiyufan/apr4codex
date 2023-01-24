package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int n) {
        if (n < 10) {
            return n;
        }
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return minimumSum(sum);
    }
}