package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String s) {
        
        if (!text.contains(s)) {
            return 0;
        }
        int counter = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == s.charAt(0) && text.charAt(j) == s.charAt(1)) {
                    boolean found = true;
                    for (int k = i + 1; k < j; k++) {
                        if (text.charAt(k) == s.charAt(0) || text.charAt(k) == s.charAt(1)) {
                            found = false;
                        }
                    }
                    if (found) {
                        counter++;
                    }

                }
            }
        }
        return counter;
    }
}