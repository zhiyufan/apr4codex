package com.codex;

import java.util.*;

public class Solution {
public static int getLucky(String s, int k) {

        int convert;
        } else {
            convert = 0;
        }

        if (s.contains("b")) {

        } else {
            convert = 0;
        }

        if (s.contains("c")) {
            convert = s.indexOf('c') + 3;
        } else {
            convert = 0;
        }

        if (s.contains("d")) {
            convert = s.indexOf('d') + 4;
        } else {
            convert = 0;
        }

        if (s.contains("e")) {
            convert = s.indexOf('e') + 5;
        } else {
            convert = 0;
        }

        if (s.contains("f")) {
            convert = s.indexOf('f') + 6;
        } else {
            convert = 0;
        }

        if (s.contains("g")) {
            convert = s.indexOf('g') + 7;
        } else {
            convert = 0;
        }

        if (s.contains("h")) {
            convert = s.indexOf('h') + 8;
        } else {
            convert = 0;
        }

        if (s.contains("i")) {
            convert = s.indexOf('i') + 9;
        } else {
            convert = 0;
        }

        if (s.contains("j")) {
            convert = s.indexOf('j') + 10;
        } else {
            convert = 0;
        }

        if (s.contains("k")) {
            convert = s.indexOf('k') + 11;
        } else {
            convert = 0;
        }

        if (s.contains("l")) {
            convert = s.indexOf('l') + 12;
        } else {
            convert = 0;
        }

        if (s.contains("m")) {
            convert = s.indexOf('m') + 13;
        } else {
            convert = 0;
        }

        if (s.contains("n")) {
            convert = s.indexOf('n') + 14;
        } else {
            convert = 0;
        }

        if (s.contains("o")) {
            convert = s.indexOf('o') + 15;
        } else {
            convert = 0;
        }

        if (s.contains("p")) {
            convert = s.indexOf('p') + 16;
        } else {
            convert = 0;
        }

        if (s.contains("q")) {
            convert = s.indexOf('q') + 17;
        } else {
            convert = 0;
        }

        if (s.contains("r")) {
            convert = s.indexOf('r') + 18;
        } else {
            convert = 0;
        }

        if (s.contains("s")) {
            convert = s.indexOf('s') + 19;
        } else {
            convert = 0;
        }

        if (s.contains("t")) {
            convert = s.indexOf('t') + 20;
        } else {
            convert = 0;
        }

        if (s.contains("u")) {
            convert = s.indexOf('u') + 21;
        } else {
            convert = 0;
        }

        if (s.contains("v")) {
            convert = s.indexOf('v') + 22;
        } else {
            convert = 0;
        }

        if (s.contains("w")) {
            convert = s.indexOf('w') + 23;
        } else {
            convert = 0;
        }

        if (s.contains("x")) {
            convert = s.indexOf('x') + 24;
        } else {
            convert = 0;
        }

        if (s.contains("y")) {
            convert = s.indexOf('y') + 25;
        } else {
            convert = 0;
        }

        if (s.contains("z")) {
            convert = s.indexOf('z') + 26;
        if (s.contains("a")) {
            convert = s.indexOf('a') + 1;
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