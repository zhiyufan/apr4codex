package com.codex;

import java.util.*;

public class Solution {
public static int getLucky(String s, int k) {
        int convert = 0;
        for (int i = 0; i < s.length(); i++) {
            convert += (s.charAt(i) - 'a') + 1;
        }
        int transformation;

        if (k == 1) {
            transformation = convert;
        } else {
            int digit = s.length();
            int sum = 0;
            int c = convert;
            while (c > 0) {
                c = c / 10;
                ++digit;
            }

            while (convert > 0) {
                int r = convert % 10;
                sum = sum + r;
                convert = convert / 10;
            }
            transformation = sum;
        }

        return transformation;
    }
}