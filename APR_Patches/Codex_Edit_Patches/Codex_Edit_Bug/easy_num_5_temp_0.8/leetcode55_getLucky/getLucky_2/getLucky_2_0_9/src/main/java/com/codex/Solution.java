package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {


        s = s.toLowerCase();
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            number = number + s.charAt(i) - 96;
        }
        while (k > 0 && isPrime(number)) {
            int sum = 0;
            while (number != 0) {
                sum = sum + number % 10;
                number = number / 10;
            }
            number = sum;
            k--;
        }
        return number;
    }

    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}