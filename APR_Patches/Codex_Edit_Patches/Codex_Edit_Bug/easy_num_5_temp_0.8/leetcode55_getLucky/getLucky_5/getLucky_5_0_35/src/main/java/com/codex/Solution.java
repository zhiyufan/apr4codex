package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        int convert;

        if (s.contains("a")) {
            convert = s.indexOf('a');
        } else if (s.contains("b")) {
            convert = s.indexOf('b');
        } else if (s.contains("c")) {
            convert = s.indexOf('c');
        } else if (s.contains("d")) {
            convert = s.indexOf('d');
        } else if (s.contains("e")) {
            convert = s.indexOf('e');
        } else if (s.contains("f")) {
            convert = s.indexOf('f');
        } else if (s.contains("g")) {
            convert = s.indexOf('g');
        } else if (s.contains("h")) {
            convert = s.indexOf('h');
        } else if (s.contains("i")) {
            convert = s.indexOf('i');
        } else if (s.contains("j")) {
            convert = s.indexOf('j');
        } else if (s.contains("k")) {
            convert = s.indexOf('k');
        } else if (s.contains("l")) {
            convert = s.indexOf('l');
        } else if (s.contains("m")) {
            convert = s.indexOf('m');
        } else if (s.contains("n")) {
            convert = s.indexOf('n');
        } else if (s.contains("o")) {
            convert = s.indexOf('o');
        } else if (s.contains("p")) {
            convert = s.indexOf('p');
        } else if (s.contains("q")) {
            convert = s.indexOf('q');
        } else if (s.contains("r")) {
            convert = s.indexOf('r');
        } else if (s.contains("s")) {
            convert = s.indexOf('s');
        } else if (s.contains("t")) {
            convert = s.indexOf('t');
        } else if (s.contains("u")) {
            convert = s.indexOf('u');
        } else if (s.contains("v")) {
            convert = s.indexOf('v');
        } else if (s.contains("w")) {
            convert = s.indexOf('w');
        } else if (s.contains("x")) {
            convert = s.indexOf('x');
        } else if (s.contains("y")) {
            convert = s.indexOf('y');
        } else if (s.contains("z")) {
            convert = s.indexOf('z');
        } else {
            convert = 0;
        }
        convert = convert + 1;

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