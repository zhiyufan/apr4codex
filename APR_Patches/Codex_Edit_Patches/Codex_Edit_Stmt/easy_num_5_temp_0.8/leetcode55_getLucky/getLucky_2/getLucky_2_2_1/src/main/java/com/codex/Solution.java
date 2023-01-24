package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        s = s.toLowerCase();
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
        int number = 0;
            }
        for (int i = 0; i < s.length(); i++) {
            number = number + s.charAt(i) - 96;
        }
        while (k > 0) {
            int sum = 0;
            while (number != 0) {
                sum = sum + number % 10;
                number = number / 10;
            }
            if (sum > 9) {
                number = sum;
            } else {
                break;
            }
            k--;
        }
        return number;
    }

    
}