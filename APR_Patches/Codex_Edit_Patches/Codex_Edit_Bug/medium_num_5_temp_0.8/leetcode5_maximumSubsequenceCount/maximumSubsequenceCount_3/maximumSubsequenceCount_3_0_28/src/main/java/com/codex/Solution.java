package com.codex;

import java.util.*;

public class Solution {
public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;
        boolean found = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                found = true;
                for (int j = i; j < text.length(); j++) {
                    if (found) {
                        if (text.charAt(j) == pattern.charAt(1)) {
                            found = false;
                            res += 1;
                        }
                    }
                }
            }
        }
        return res;
    }
}