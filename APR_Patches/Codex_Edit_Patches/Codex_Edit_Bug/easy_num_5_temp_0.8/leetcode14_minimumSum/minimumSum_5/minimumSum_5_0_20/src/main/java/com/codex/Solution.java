package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int n) {

        while (n >= 10) {
            n = n / 10 + n % 10;
        }
        return n;
    }

    public static int minimumSum2(int n) {

        int sum = 0;
        while (n != 0) {
            int nextDigit = n % 10;
            n = n / 10;
            sum += nextDigit;
        }
        if (sum / 10 == 0) {
            return sum;
        } else {
            return minimumSum2(sum);
        }
    }

    public static int minimumSum3(int n) {

        int minSum = 0x7fffffff;
        int digitSum = 0;
        int curNum = n;
        for (int i = 1; i <= (int) Math.pow(10, String.valueOf(n).length()); i *= 10) {
            int curDigit = curNum / i;
            curNum = curNum % i;
            digitSum += curDigit;

            int newDigitSum = digitSum + curNum;
            while (newDigitSum >= 10) {
                newDigitSum = subSum(newDigitSum);
            }
            minSum = Integer.min(minSum, newDigitSum);
        }
        return minSum;
    }

    public static int subSum(int n) {
        int res = 0;
        while (n != 0) {
            int nextDigit = n % 10;
            res += nextDigit;
            n = n / 10;
        }
        return res;
    }

    public static int minimumSum4(int num) {
        int min = Integer.MAX_VALUE;
        int n = num;
        while (n >= 10) {
            n = n / 10 + n % 10;
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static int minimumSum5(int num) {
        int min = Integer.MAX_VALUE;
        String numString = String.valueOf(num);
        for (int i = 1; i < numString.length(); i++) {
            String s1 = numString.substring(0, i);
            String s2 = numString.substring(i, numString.length());
            int sum1 = Integer.valueOf(s1) + Integer.valueOf(s2);
            if (sum1 < min) {
                min = sum1;
            }
        }
        return min;
    }
}