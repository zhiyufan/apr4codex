package com.codex;

import java.util.*;

public class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);
        String s1 = s, s2 = s;
        char maxChar = '9';
        char minChar = '0';
        int i = 0;
        while (i < s.length() && s.charAt(i) <= '9' && s.charAt(i) >= '0') {
            if (s.charAt(i) < maxChar) {
                maxChar = s.charAt(i);
            }
            if (s.charAt(i) > minChar) {
                minChar = s.charAt(i);
            }
            i++;
        }
        if (i == s.length()) {
            return 0;
        }
        for (int j = 0; j < s.length(); j++) {
            if (s1.charAt(j) == maxChar) {
                s1 = s1.replace(maxChar, '9');
            }
            if (s2.charAt(j) == minChar) {
                s2 = s2.replace(minChar, '0');
            }
        }
        return Integer.valueOf(s1) - Integer.valueOf(s2);
}
}