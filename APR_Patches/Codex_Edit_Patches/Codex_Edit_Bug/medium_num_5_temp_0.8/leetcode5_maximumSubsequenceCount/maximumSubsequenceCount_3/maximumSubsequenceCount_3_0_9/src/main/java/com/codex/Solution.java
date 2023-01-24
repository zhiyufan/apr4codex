package com.codex;

import java.util.*;

public class Solution {
public static long maximumSubsequenceCount(String text, String pattern) {
    long res = 0;
    for (int i = 0; i < text.length() - 1; i++) {
        String commonPattern = String.valueOf(text.charAt(i)) + String.valueOf(text.charAt(i + 1));
        if (pattern.equals(commonPattern))
            res += 1;
    }
    return res;
}
}