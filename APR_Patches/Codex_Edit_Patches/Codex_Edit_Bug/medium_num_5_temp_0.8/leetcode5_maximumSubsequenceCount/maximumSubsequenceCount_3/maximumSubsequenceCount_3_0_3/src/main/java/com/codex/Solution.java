package com.codex;

import java.util.*;

public class Solution {
public static long subsequenceCount(String text, String pattern) {
    // Makes sure the pattern is the shorter string.
    if (text.length() < pattern.length()) {
        String temp = text;
        text = pattern;
        pattern = temp;
    }

    int pos = 0;
        long res = 0;
        for (int i = 0; i < text.length(); i++) { 
            if (text.charAt(i) == pattern.charAt(pos)) {
                pos += 1;
            }
        }
        return res;
    }
}