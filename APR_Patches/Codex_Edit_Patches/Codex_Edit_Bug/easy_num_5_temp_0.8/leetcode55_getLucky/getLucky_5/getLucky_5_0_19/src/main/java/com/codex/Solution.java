package com.codex;

import java.util.*;

public class Solution {
    // function to get lucky number
    public static int getLucky(String s, int k) {
        // initialize returns
        int lucky = 0;
        int transformations = 0;


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
        } else if (s.contains("o")) {
            convert = s.indexOf('o') + 15;
        } else if (s.contains("p")) {
            convert = s.indexOf('p') + 16;
        } else if (s.contains("q")) {
            convert = s.indexOf('q') + 17;
        } else if (s.contains("r")) {
            convert = s.indexOf('r') + 18;
        } else if (s.contains("s")) {
            convert = s.indexOf('s') + 19;
        } else if (s.contains("t")) {
            convert = s.indexOf('t') + 20;
        } else if (s.contains("u")) {
            convert = s.indexOf('u') + 21;
        } else if (s.contains("v")) {
            convert = s.indexOf('v') + 22;
        } else if (s.contains("w")) {
            convert = s.indexOf('w') + 23;
        } else if (s.contains("x")) {
            convert = s.indexOf('x') + 24;
        } else if (s.contains("y")) {
            convert = s.indexOf('y') + 25;
        } else if (s.contains("z")) {
            convert = s.indexOf('z') + 26;
        } else {
            convert = 0;
        }
        // transformation
        int transformation;

        if (k == 1) {
            transformations = convert;
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
            transformations = sum;
        }

        // lucky number
        lucky = transformations;

        for (int i = 2; i <= k; i++) {
            int digit = s.length();
            int sum = 0;
            int c = transformations;
            while (c > 0) {
                c = c / 10;
                ++digit;
            }

            while (transformations > 0) {
                int r = transformations % 10;
                sum = sum + r;
                transformations = transformations / 10;
            }

            transformations = sum;
            lucky = transformations;
        }

        return lucky;
    }
}