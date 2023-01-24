package com.codex;

import java.util.*;

public class Solution {
public static long maximumSubsequenceCount(String text, String pattern) {
     
        long res = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                for (int j = i + 1; j < text.length() - 1; j++) {
                    if (text.charAt(j) == pattern.charAt(0)) {
                        if (text.charAt(j + 1) == pattern.charAt(1)) {
                            for (int k = j + 2; k < text.length(); k++) {
                                if (text.charAt(k) == pattern.charAt(1)) {
                                    res += 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}