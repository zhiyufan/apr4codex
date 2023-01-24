package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        int number = toNumber(s);
        if (number == 0) {
            return -1;
        }
        while (number != 0 && k > 0) {
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

    public static int toNumber(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.toLowerCase().charAt(i);
            if (c >= 'a' && c <= 'z') {
                number = number + c - 96;
            } else {
                return -1;
            }
        }
        return number;
    }
}