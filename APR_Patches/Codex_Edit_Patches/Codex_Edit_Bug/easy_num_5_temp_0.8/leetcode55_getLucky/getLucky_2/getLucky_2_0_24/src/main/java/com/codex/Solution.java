package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        s = s.toLowerCase();
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            number = number + s.charAt(i) - 96;
        }
        while (k > 0) {
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

    
    public static boolean isKaprekar(int x) {
        
        int k = x * x;
        int k2 = 0;
        while (k > 0) {
            k2 = k2 * 10 + k % 10;
            k = k / 10;
        }
        int left = 0;
        int right = 0;
        for (int i = 1; i < Integer.toString(x).length(); i++) {

            if (k2 == 0) {
                return false;
            }
            left = k2 % (int) Math.pow(10, i);
            right = k2 / (int) Math.pow(10, i);
            if (left + right == x) {
                return true;
            }
        }
        return false;

    }
}