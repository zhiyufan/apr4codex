package com.codex;

import java.util.*;

public class Solution {
/*
      

      Write a method that calculates the index of the first occurrence of a lucky integer in the array. If there is no such index, the method should return -1. Use the following signature: 
      
      public static int getLucky(String s, int k)
      
      Examples:
      
      getLucky("abcde", 2) = 10
      getLucky("abcdef", 3) = 11
      getLucky("abcdefg", 1) = 2
      getLucky("abcdefgh", 4) = 15
      getLucky("abcdefghi", 2) = 17
      getLucky("abcdefghjkl", 3) = 29
      getLucky("abcdefghijklmnopqrs", 1) = 2
      getLucky("abcdefghijklmnopqrstuv", 2) = 42
      getLucky("abcdefghijklmnopqrstuvwxyz", 3) = 858
      getLucky("abcdefghijklmnopqrstuvwxyz", 4) = 1092
      getLucky("abcdefghijklmnopqrstuvwxyz", 5) = 1226
      getLucky("abcdefghijklmnopqrstuvwxyz", 6) = 1360
      getLucky("abcdefghijklmnopqrstuvwxyz", 7) = 1494
      getLucky("abcdefghijklmnopqrstuvwxyz", 8) = 1628
      getLucky("abcdefghijklmnopqrstuvwxyz", 9) = 1762
      getLucky("abcdefghijklmnopqrstuvwxyz", 10) = 1896
      getLucky("abcdefghijklmnopqrstuvwxyz", 11) = 2030
      getLucky("abcdefghijklmnopqrstuvwxyz", 12) = 2164
      getLucky("abcdefghijklmnopqrstuvwxyz", 13) = 2298
      getLucky("abcdefghijklmnopqrstuvwxyz", 14) = 2432
      getLucky("abcdefghijklmnopqrstuvwxyz", 15) = 2566
      getLucky("abcdefghijklmnopqrstuvwxyz", 16) = 2700
      getLucky("abcdefghijklmnopqrstuvwxyz", 17) = 2834
      getLucky("abcdefghijklmnopqrstuvwxyz", 18) = 2968
      getLucky("abcdefghijklmnopqrstuvwxyz", 19) = 3102
      getLucky("abcdefghijklmnopqrstuvwxyz", 20) = 3236
      getLucky("abcdefghijklmnopqrstuvwxyz", 21) = 3370
      getLucky("abcdefghijklmnopqrstuvwxyz", 22) = 3504
      getLucky("abcdefghijklmnopqrstuvwxyz", 23) = 3638
      getLucky("abcdefghijklmnopqrstuvwxyz", 24) = 3772
      getLucky("abcdefghijklmnopqrstuvwxyz", 25) = 3906
      getLucky("abcdefghijklmnopqrstuvwxyz", 26) = 4040
      getLucky("abcdefghijklmnopqrstuvwxyz", 27) = 4174
      getLucky("abcdefghijklmnopqrstuvwxyz", 28) = 4308
      getLucky("abcdefghijklmnopqrstuvwxyz", 29) = 4442
      getLucky("abcdefghijklmnopqrstuvwxyz", 30) = 4576

*/
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