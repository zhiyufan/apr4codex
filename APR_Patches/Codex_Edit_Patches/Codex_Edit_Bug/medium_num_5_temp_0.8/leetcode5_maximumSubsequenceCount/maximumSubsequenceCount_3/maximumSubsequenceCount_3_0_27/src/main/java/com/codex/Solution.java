package com.codex;

import java.util.*;

public class Solution {
public class Main {
    public static void main(String[] args) {
        System.out.println(maximumSubsequenceCount("fihjjjjei", "fj"));
    }

    public static int maximumSubsequenceCount(String text, String pattern) {
        int res = 0;
        if (pattern.length() == 2) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == pattern.charAt(0)) {
                    for (int j = i + 1; j < text.length(); j++) {
                        if (text.charAt(j) == pattern.charAt(1)) {
                            res += 1;
                        }
                    }
                }
            }
        }
        return res;
    }
}