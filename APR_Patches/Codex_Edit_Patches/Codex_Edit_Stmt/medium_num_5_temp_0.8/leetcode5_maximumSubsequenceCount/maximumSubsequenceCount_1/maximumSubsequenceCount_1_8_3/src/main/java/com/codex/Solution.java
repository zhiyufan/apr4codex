package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

    public static long maximumSubsequenceCount(String text, String pattern) {
        
        if (pattern.length() == 0 || text.length() < pattern.length()) {
            return 0;
        }
        // 遍历text所有可能的子串
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            // 比较当前子串text[i...i+pattern.length)与pattern是否相等
            boolean match = true;
            for (int j = 0; j < pattern.length(); j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }
        }
        return dp[text.length()][pattern.length()];
    }

    
}