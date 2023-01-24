package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {


        int convert;

        if (s.contains("a")) {
            //convert = s.indexOf('a') + 1;
            String a = String.valueOf('a');
            convert = Integer.parseInt(a);
        } else if (s.contains("b")) {
            //convert = s.indexOf('b') + 2;
            String a = String.valueOf('b');
            convert = Integer.parseInt(a);
        } else if (s.contains("c")) {
            //convert = s.indexOf('c') + 3;
            String a = String.valueOf('c');
            convert = Integer.parseInt(a);
        } else if (s.contains("d")) {
            //convert = s.indexOf('d') + 4;
            String a = String.valueOf('d');
            convert = Integer.parseInt(a);
        } else if (s.contains("e")) {
            //convert = s.indexOf('e') + 5;
            String a = String.valueOf('e');
            convert = Integer.parseInt(a);
        } else if (s.contains("f")) {
            //convert = s.indexOf('f') + 6;
            String a = String.valueOf('f');
            convert = Integer.parseInt(a);
        } else if (s.contains("g")) {
            //convert = s.indexOf('g') + 7;
            String a = String.valueOf('g');
            convert = Integer.parseInt(a);
        } else if (s.contains("h")) {
            //convert = s.indexOf('h') + 8;
            String a = String.valueOf('h');
            convert = Integer.parseInt(a);
        } else if (s.contains("i")) {
            //convert = s.indexOf('i') + 9;
            String a = String.valueOf('i');
            convert = Integer.parseInt(a);
        } else if (s.contains("j")) {
            //convert = s.indexOf('j') + 10;
            String a = String.valueOf('j');
            convert = Integer.parseInt(a);
        } else if (s.contains("k")) {
            //convert = s.indexOf('k') + 11;
            String a = String.valueOf('k');
            convert = Integer.parseInt(a);
        } else if (s.contains("l")) {
            //convert = s.indexOf('l') + 12;
            String a = String.valueOf('l');
            convert = Integer.parseInt(a);
        } else if (s.contains("m")) {
            //convert = s.indexOf('m') + 13;
            String a = String.valueOf('m');
            convert = Integer.parseInt(a);
        } else if (s.contains("n")) {
            //convert = s.indexOf('n') + 14;
            String a = String.valueOf('n');
            convert = Integer.parseInt(a);
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