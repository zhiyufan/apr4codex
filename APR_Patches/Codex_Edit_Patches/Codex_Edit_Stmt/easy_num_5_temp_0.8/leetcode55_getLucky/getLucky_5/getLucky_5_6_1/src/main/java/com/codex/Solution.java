package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        int result;

        if (s.contains("a")) {
            result = s.indexOf('a') + 1;
        } else if (s.contains("b")) {
            result = s.indexOf('b') + 2;
        } else if (s.contains("c")) {
            result = s.indexOf('c') + 3;
        } else if (s.contains("d")) {
            result = s.indexOf('d') + 4;
        } else if (s.contains("e")) {
            result = s.indexOf('e') + 5;
        } else if (s.contains("f")) {
            result = s.indexOf('f') + 6;
        } else if (s.contains("g")) {
            result = s.indexOf('g') + 7;
        } else if (s.contains("h")) {
            result = s.indexOf('h') + 8;
        } else if (s.contains("i")) {
            result = s.indexOf('i') + 9;
        } else if (s.contains("j")) {
            result = s.indexOf('j') + 10;
        } else if (s.contains("k")) {
            result = s.indexOf('k') + 11;
        } else if (s.contains("l")) {
            result = s.indexOf('l') + 12;
        } else if (s.contains("m")) {
            result = s.indexOf('m') + 13;
        } else if (s.contains("n")) {
            result = s.indexOf('n') + 14;
        } else if (s.contains("o")) {
            result = s.indexOf('o') + 15;
        } else if (s.contains("p")) {
            result = s.indexOf('p') + 16;
        } else if (s.contains("q")) {
            result = s.indexOf('q') + 17;
        } else if (s.contains("r")) {
            result = s.indexOf('r') + 18;
        } else if (s.contains("s")) {
            result = s.indexOf('s') + 19;
        } else if (s.contains("t")) {
            result = s.indexOf('t') + 20;
        } else if (s.contains("u")) {
            result = s.indexOf('u') + 21;
        } else if (s.contains("v")) {
            result = s.indexOf('v') + 22;
        } else if (s.contains("w")) {
            result = s.indexOf('w') + 23;
        } else if (s.contains("x")) {
            result = s.indexOf('x') + 24;
        } else if (s.contains("y")) {
            result = s.indexOf('y') + 25;
        } else if (s.contains("z")) {
            result = s.indexOf('z') + 26;
        } else {
            result = 0;
        }

        int transformation;

        if (k == 1) {
            transformation = result;
        } else {
            int digit = s.length();
            int sum = 0;
            int c = result;
            while (c > 0) {
                c = c / 10;
                ++digit;
            }

            while (result > 0) {
                int r = result % 10;
                sum = sum + r;
                result = result / 10;
            }
            transformation = sum;
        }

        return transformation;
    }
}