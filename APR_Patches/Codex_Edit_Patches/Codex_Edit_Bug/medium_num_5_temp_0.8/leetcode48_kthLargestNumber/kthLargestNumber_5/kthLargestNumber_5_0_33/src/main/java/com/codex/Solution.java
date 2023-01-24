package com.codex;

import java.util.*;

public class Solution {
        public static boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        int i = 0, j = 0;
        while (i < sLen) {
            if (j < pLen && !Character.isLetterOrDigit(p.charAt(j)) && p.charAt(j) != '.') {
                return false;
            } else {
                if (j < pLen && Character.isLetterOrDigit(p.charAt(j))) {
                    if (j + 1 < pLen && p.charAt(j + 1) == '*') {
                        if (p.charAt(j) == '.') {
                            return true;
                        }
                        char cur = p.charAt(j);
                        while (i < sLen && s.charAt(i) == cur) {
                            i++;
                        }
                        j += 2;
                    } else {
                        if (i < sLen && s.charAt(i) == p.charAt(j)) {
                            i++;
                            j++;
                        } else {
                            return false;
                        }
                    }
                } else {
                    if (j + 1 < pLen && p.charAt(j + 1) == '*') {
                        j += 2;
                        continue;
                    }
                    if (j < pLen && p.charAt(j) == '.') {
                        i++;
                        j++;
                    } else {
                        return false;
                    }
                }
            }
        }
        while (j < pLen && p.charAt(j) == '*') {
            j++;
        }
        return i == sLen && j == pLen;
    }

    private static int getFirstComparison(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int lenA = strA.length();
        int lenB = strB.length();
        int i = 0;
        while (i < lenA || i < lenB) {
            if (i < lenA && i < lenB) {
                if (strA.charAt(i) < strB.charAt(i)) {
                    return 1;
                } else if (strA.charAt(i) > strB.charAt(i)) {
                    return -1;
                } else {
                    i++;
                }
            } else {
                if (i < lenA) {
                    if (strA.charAt(i) < strA.charAt(0)) {
                        return 1;
                    } else if (strA.charAt(i) > strA.charAt(0)) {
                        return -1;
                    } else {
                        i++;
                    }
                } else {
                    if (strB.charAt(i) < strB.charAt(0)) {
                        return -1;
                    } else if (strB.charAt(i) > strB.charAt(0)) {
                        return 1;
                    } else {
                        i++;
                    }
                }
            }
        }
        return 0;
    }
    
}