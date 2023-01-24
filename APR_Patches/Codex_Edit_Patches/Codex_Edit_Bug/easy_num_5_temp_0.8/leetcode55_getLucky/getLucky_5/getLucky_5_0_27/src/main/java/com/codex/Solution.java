package com.codex;

import java.util.*;

public class Solution {
public static int getLucky(String s, int k) {
        

    int convert;

    if (s.contains("a")) {
        convert = s.indexOf('a') + 1;
    } else if (s.contains("b")) {
        convert = s.indexOf('b') + 2;
    } else if (s.contains("c")) {
        convert = s.indexOf('c') + 3;
    } else if (s.contains("d")) {
        convert = s.indexOf('d') + 4;
    } else if (s.contains("e")) {
        convert = s.indexOf('e') + 5;
    } else if (s.contains("f")) {
        convert = s.indexOf('f') + 6;
    } else if (s.contains("g")) {
        convert = s.indexOf('g') + 7;
    } else if (s.contains("h")) {
        convert = s.indexOf('h') + 8;
    } else if (s.contains("i")) {
        convert = s.indexOf('i') + 9;
    } else if (s.contains("j")) {
        convert = s.indexOf('j') + 10;
    } else if (s.contains("k")) {
        convert = s.indexOf('k') + 11;
    } else if (s.contains("l")) {
        convert = s.indexOf('l') + 12;
    } else if (s.contains("m")) {
        convert = s.indexOf('m') + 13;
    } else if (s.contains("n")) {
        convert = s.indexOf('n') + 14;
    } else {
        convert = 0;
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