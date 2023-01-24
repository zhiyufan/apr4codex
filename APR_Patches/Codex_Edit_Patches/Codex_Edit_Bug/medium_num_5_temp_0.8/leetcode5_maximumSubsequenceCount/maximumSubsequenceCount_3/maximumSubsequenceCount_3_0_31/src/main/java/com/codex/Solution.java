package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        int subStrSize = pattern.length();
        if (subStrSize > text.length()) {
            return 0;
        }
        long res = 0;

        for (int i = 0; i < text.length() - subStrSize + 1; i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                boolean isEqual = true;
                for (int j = 1; j < subStrSize; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j))
                        isEqual = false;
                }
                if (isEqual) {
                    res += 1;
                }
            }
        }
        return res;
    }
}