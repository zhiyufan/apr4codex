package com.codex;

import java.util.*;

public class Solution {
    public static long countVowels(String word) {
        long count = 0;

        long count = 0;
        int cnt, len = word.length();
        char c;
        for (int i = 0; i < len; i++) {
            c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt = 1;
                for (int j = i + 1; j < len; j++) {
                    if (word.charAt(j) == c)
                        cnt++;
                    count += cnt;
                }
            }
        }
        return count;
    }

    
}