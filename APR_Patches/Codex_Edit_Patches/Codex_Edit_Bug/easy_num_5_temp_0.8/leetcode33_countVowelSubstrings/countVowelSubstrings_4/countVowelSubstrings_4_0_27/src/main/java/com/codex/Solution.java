package com.codex;

import java.util.*;

public class Solution {

    public static int countVowelSubstrings(String s) {
        int count = 0, res = 0;
        for (char c : s.toCharArray()) {
            int a = 0, e = 0, i = 0, o = 0, u = 0;
            if (c == 'a') {
                a = 1;
            }
            if (c == 'e') {
                e = 1;
            }
            if (c == 'i') {
                i = 1;
            }
            if (c == 'o') {
                o = 1;
            }
            if (c == 'u') {
                u = 1;
            }
            if (a + e + i + o + u > 1) {
                count++;
            }
            else {
                res += count;
                count = 0;
            }
        }
        return (res += count);
    }
}